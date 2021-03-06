#!/usr/bin/env bash

# Copyright (c) 2017 Public Library of Science
#
# Permission is hereby granted, free of charge, to any person obtaining a
# copy of this software and associated documentation files (the "Software"),
# to deal in the Software without restriction, including without limitation
# the rights to use, copy, modify, merge, publish, distribute, sublicense,
# and/or sell copies of the Software, and to permit persons to whom the
# Software is furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
# THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
# FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
# DEALINGS IN THE SOFTWARE.

shopt -s nullglob

function check_ringgold_env {
    if [[ -z ${RINGGOLD_DB_DIR} ]]; then
        echo -e "\nUndefined RINGGOLD_DB_DIR (ex: export RINGGOLD_DB_DIR=~/work)\n"
        exit 1
    fi
    if [[ ! -d ${RINGGOLD_DB_DIR} ]]; then
        echo -e "\nRINGGOLD_DB_DIR : invalid directory (${RINGGOLD_DB_DIR})\n"
        exit 1
    fi
}

function import_ringgold {
    cd "${RINGGOLD_DB_DIR}"

    # delete sql file plus backup
    rm -f Ringgold_Identify_mysql.sql*
    rm -f Ringgold_Identify_mysql_counts.txt 

    ringgold_zip=(Ringgold_Identify_mysql.zip)

    if [ ${#ringgold_zip[@]} -ne 1 ]; then
        echo -e "\nUnexpected # of Ringgold zip's found (expected:1 found:${#ringgold_zip[@]}). Aborting.\n"
        exit 1
    fi

    unzip -o $ringgold_zip
    ringgold_sql=(Ringgold_Identify_mysql.sql)

    # add ".bak" to -i option for compatibility between GNU/BSD sed flavors
    # rename ringgold schema: identify -> ringgold
    sed -i.bak 's/ identify;/ ringgold;/g' $ringgold_sql

    # remove "_new" from table names
    sed -i.bak 's/_new\(;\| \|`\)/\1/g' $ringgold_sql

    echo -e "\nImporting Ringgold ... (this may take a few minutes)"
    mysql -u ned < $ringgold_sql

    echo "Finished"
}

function deploy_jar {
    ned_jar=(./target/$1-*.jar)

    # get groupId and version from pom. 
    # repositoryId = server id in your mvn settings.xml
    mvn deploy:deploy-file \
        -DpomFile=./pom.xml \
        -DartifactId=$1 \
        -Dpackaging=jar \
        -Dfile=${ned_jar} \
        -DrepositoryId=ambra \
        -Durl=sftp://maven.ambraproject.org/home/maven2/repository/release

    echo "Deployed ${ned_jar}"
}

function process_db_args {
    db_host=${1:-localhost}
    db_port=${2:-3306}
    db_username=${3:-ned}
    db_password=${4}
    db_url="jdbc:mysql://${db_host}:${db_port}/namedEntities?useUnicode=true&amp;characterEncoding=utf8"
}

function clean_db {
    process_db_args "$@"

    echo -e "\nAbout to destroy namedEntities schema on ${db_host}:${db_port} user:${db_username} password:'${db_password}'"
    read -p "Are you sure? " -n 1 -r
    echo
    if [[ $REPLY =~ ^[Yy]$ ]]
    then
        mvn -Ddb.url="$db_url" -Ddb.username="$db_username" -Ddb.password="$db_password" \
            properties:read-project-properties flyway:clean
    fi
}

function db_info {
    process_db_args "$@"
    mvn -P deploy -Ddb.url="$db_url" -Ddb.username="$db_username" -Ddb.password="$db_password" \
        properties:read-project-properties flyway:info
}

function migrate_db {
    process_db_args "$@"

    echo -e "\nAbout to apply migrations to namedEntities schema on ${db_host}:${db_port} user:${db_username} password:'${db_password}'"
    read -p "Are you sure? " -n 1 -r
    echo
    if [[ $REPLY =~ ^[Yy]$ ]]
    then
        mvn -P deploy -Ddb.url="$db_url" -Ddb.username="$db_username" -Ddb.password="$db_password" \
            -Dmaven.exec.skip=true compile flyway:migrate
    fi
    # here's how to migrate up to a specific target version. migrations with a
    # higher version number will not be applied (ex: apply v1 and v2).
    #mvn -P deploy -Ddb.url="$db_url" -Dflyway.target=2 compile flyway:migrate
}

function insert_app {
    if [[ -z $1 ]]; then
        echo -e "Error: App name not specified"
        exit 1
    fi

    if [[ -z $2 ]]; then
        echo -e "Error: App password not specified"
        exit 1
    fi

    app_username=$1
    app_password=$2
    db_host=${3:-localhost}
    db_port=${4:-3306}
    db_username=${5:-ned}
    db_password=${6}

    if [[ ! -f "target/classes/org/plos/namedentity/spring/security/BCrypt.class" ]]; then
        echo "compiling classes"
        mvn -q -Dmaven.exec.skip=true test-compile
    fi

    HASHED=$(mvn -q exec:java -Dexec.mainClass=org.plos.namedentity.spring.security.BCrypt -Dexec.args="$app_password")

    echo "REPLACE INTO namedEntities.consumers (name, password) VALUES ('$app_username','$HASHED'); \\"
    echo " | mysql -h $db_host -P $db_port --user=$db_username --password=$db_password"

    echo "REPLACE INTO namedEntities.consumers (name, password) VALUES ('$app_username','$HASHED');" \
        | mysql -h $db_host -P $db_port --user=$db_username --password=$db_password
}

function run_tomcat {
    process_db_args "$@"
    mvn -Dmaven.exec.skip=true -Dtomcat.db.url="$db_url" -Dtomcat.db.username="$db_username" -Dtomcat.db.password="$db_password" \
        clean tomcat:run
}

case "$1" in
codegen)
    mvn -P deploy clean generate-sources jooq-codegen:generate
    ;;

db-clean)
    shift && clean_db "$@"
    ;;

db-info)
    shift && db_info "$@"
    ;;

db-migrate)
    shift && migrate_db "$@"
    ;;

db-ringgold)
    check_ringgold_env
    import_ringgold
    ;;

insertapp)
    shift && insert_app "$@"
    ;;

test)
    mvn clean test
    ;;

package)
    mvn clean package
    ;;

install)
    mvn clean install
    ;;

deploy)
    install
    deploy_jar "named-entity-pojos"
    deploy_jar "named-entity-password"
    ;;

tomcat)
    shift && run_tomcat "$@"
    ;;

*)
    echo -e "\nUsage: `basename $0` (codegen|db-clean|db-info|db-migrate|db-ringgold|insertapp|test|package|install|deploy|tomcat)\n"
    echo "  codegen  # runs jooq code generator against docker instance with latest migrations"
    echo ""
    echo "  db-clean [<host> <port> <username> <password>]"
    echo "  db-clean                           # cleans ned schema (localhost:3306:ned:<empty>)"
    echo ""
    echo "  db-info  [<host> <port> <username> <password>]"
    echo "  db-info                            # shows applied migrations (localhost:3306:ned:<empty>)"
    echo "  db-info devbox02                   # shows applied migrations (devbox02:3306:ned:<empty>)"
    echo ""
    echo "  db-migrate [<host> <port> <username> <password>]"
    echo "  db-migrate                         # applies migrations (localhost:3306:ned:<empty>)"
    echo "  db-migrate devbox01 3304           # applies migrations (devbox01:3304:ned:<empty>)"
    echo "  db-migrate localhost 3306 ned ned  # applies migrations (localhost:3306:ned:ned)"
    echo ""
    echo "  db-ringgold                        # extracts and import ringgold archive"
    echo ""
    echo "  insertapp <app_username> <app_password> [<host> <port> <db_username> <db_password>]"
    echo "  insertapp etl etl                  # inserts etl app user into db (localhost:3306:ned:<empty>)"
    echo "  insertapp etl etl devbox02         # inserts etl app user into db (devbox02:3306:ned:<empty>)"
    echo ""
    echo "  tomcat [<db_host> <db_port> <db_username> <db_password>]"
    echo "  tomcat                       # starts embedded tomcat - http://localhost:8080, mysql(localhost:3306:ned:<empty>)"
    echo "  tomcat devbox01 3306 ned ned # starts embedded tomcat - http://localhost:8080, mysql(devbox01:3306:ned:ned)"
    echo ""
    echo "  test     # runs unit tests"
    echo "  package  # generates war and pojo's"
    echo "  install  # copies war/pojo's to internal maven repo"
    echo ""
    echo "  deploy   # deploys pojo's to external ambra maven repo"
    echo "           # (http://maven.ambraproject.org/maven2/release/org/plos/)"
    echo ""
    exit 0
    ;;
esac
