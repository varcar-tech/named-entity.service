/*
 * Copyright (c) 2017 Public Library of Science
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */


USE namedEntities;

/* Named Party Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Named Party Types','Individual, Organization');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Named Party Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Individual', NULL, 'IND', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Organization', NULL, 'ORG', CURRENT_TIMESTAMP);

/* User Applications */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('User Applications','Editorial Manager, Ambra, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='User Applications';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Editorial Manager', NULL, 'EM', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Ambra', NULL, 'AMB', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Named Party DB', NULL, 'NPDB', CURRENT_TIMESTAMP);

/* Source Applications */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Source Applications','Editorial Manager, Ambra, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Source Applications';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Editorial Manager', NULL, 'EM', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Ambra', NULL, 'AMB', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Salesforce', NULL, 'SF', CURRENT_TIMESTAMP);

/* Organization Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Organization Types','University, Department, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Organization Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Research Hospital', NULL, 'HOSP', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'University', NULL, 'UNIV', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Department', NULL, 'DEPT', CURRENT_TIMESTAMP);

/* Roles */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Roles','Academic Editor, Author, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Roles';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Author', NULL, 'AUTH', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Co-Author', NULL, 'COAU', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Academic Editor (PLOS ONE)', NULL, 'AE_PLOSONE', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'NP System Administrator', NULL, 'SANP', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Editor (PLOS BIO)', NULL, 'E_PLOSBIO', CURRENT_TIMESTAMP);

/* Named Party Prefixes */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Named Party Prefixes','Ms, Dr, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Named Party Prefixes';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Mr.', NULL, 'MR', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Mrs.', NULL, 'MRS', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Dr.', NULL, 'DR', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Ms.', NULL, 'MS', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Professor', NULL, 'PROF', CURRENT_TIMESTAMP);

/* Named Party Suffixes */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Named Party Suffixes','II, III, Jr, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Named Party Suffixes';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'III', NULL, 'III', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'II', NULL, 'II', CURRENT_TIMESTAMP);

/* Languages */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Languages','English, Mandarin, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Languages';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'English', NULL, 'ENG', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Mandarin', NULL, 'MAN', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Italian', NULL, 'ITAL', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Spanish', NULL, 'SPAN', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'French', NULL, 'FREN', CURRENT_TIMESTAMP);

/* Communication Methods */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Communication Methods','Phone, Email, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Communication Methods';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Phone', NULL, 'PH', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Email', NULL, 'EMAI', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Fax', NULL, 'FAX', CURRENT_TIMESTAMP);

/* Telephone Number Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Telephone Number Types','Home, Mobile, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Telephone Number Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Home', NULL, 'HOME', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Office', NULL, 'OFF', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Mobile', NULL, 'CELL', CURRENT_TIMESTAMP);

/* Email Address Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Email Address Types','Home, Work, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Email Address Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Personal', NULL, 'PERS', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Work', NULL, 'WORK', CURRENT_TIMESTAMP);

/* Physical Address Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Physical Address Types','Home, Work, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Physical Address Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Office', NULL, 'WORK', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Home', NULL, 'HOME', CURRENT_TIMESTAMP);

/* Relationship Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Relationship Types','AE/Author, Manager/Subordinate, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Relationship Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Manager-Subordinate', NULL, 'MGR', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'AE-Author', NULL, 'AEAU', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Organization-Author', NULL, 'ORAU', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'AE-Reviewer', NULL, 'AERV', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Individual Affiliated with Organization', NULL, 'I-AFF-O', CURRENT_TIMESTAMP);

/* Country Codes for Phone Numbers */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Country Codes for Phone Numbers','01, 44, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Country Codes for Phone Numbers';
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Afghanistan','AF','93',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Albania','AL','355',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Algeria','DZ','213',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'American Samoa','AS','1 684 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Andorra','AD','376',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Angola','AO','244',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Anguilla','AI','1 264 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Antarctica','AQ','672',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Antigua and Barbuda','AG','1 268 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Argentina','AR','54',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Armenia','AM','374',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Aruba','AW','297',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Australia','AU','61',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Austria','AT','43',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Azerbaijan','AZ','994',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bahamas','BS','1 242 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bahrain','BH','973',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bangladesh','BD','880',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Barbados','BB','1 246 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Belarus','BY','375',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Belgium','BE','32',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Belize','BZ','501',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Benin','BJ','229',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bermuda','BM','1 441 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bhutan','BT','975',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bolivia','BO','591',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bosnia and Herzegovina','BA','387',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Botswana','BW','267',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Brazil','BR','55',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'British Virgin Islands','VG','1 284 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Brunei','BN','673',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Bulgaria','BG','359',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Burkina Faso','BF','226',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Burma (Myanmar)','MM','95',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Burundi','BI','257',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cambodia','KH','855',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cameroon','CM','237',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Canada','CA','1',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cape Verde','CV','238',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cayman Islands','KY','1 345 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Central African Republic','CF','236',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Chad','TD','235',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Chile','CL','56',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'China','CN','86',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Christmas Island','CX','61',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cocos (Keeling) Islands','CC','61',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Colombia','CO','57',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Comoros','KM','269',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cook Islands','CK','682',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Costa Rica','CR','506',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Croatia','HR','385',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cuba','CU','53',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Cyprus','CY','357',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Czech Republic','CZ','420',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Democratic Republic of the Congo','CD','243',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Denmark','DK','45',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Djibouti','DJ','253',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Dominica','DM','1 767 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Dominican Republic','DO','1 809 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Ecuador','EC','593',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Egypt','EG','20',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'El Salvador','SV','503',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Equatorial Guinea','GQ','240',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Eritrea','ER','291',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Estonia','EE','372',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Ethiopia','ET','251',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Falkland Islands','FK','500',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Faroe Islands','FO','298',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Fiji','FJ','679',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Finland','FI','358',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'France','FR','33',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'French Polynesia','PF','689',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Gabon','GA','241',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Gambia','GM','220',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Georgia','GE','995',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Germany','DE','49',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Ghana','GH','233',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Gibraltar','GI','350',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Greece','GR','30',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Greenland','GL','299',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Grenada','GD','1 473 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Guam','GU','1 671 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Guatemala','GT','502',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Guinea','GN','224',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Guinea-Bissau','GW','245',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Guyana','GY','592',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Haiti','HT','509',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Holy See (Vatican City)','VA','39',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Honduras','HN','504',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Hong Kong','HK','852',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Hungary','HU','36',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Iceland','IS','354',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'India','IN','91',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Indonesia','ID','62',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Iran','IR','98',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Iraq','IQ','964',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Ireland','IE','353',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Isle of Man','IM','44',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Israel','IL','972',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Italy','IT','39',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Ivory Coast','CI','225',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Jamaica','JM','1 876 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Japan','JP','81',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Jordan','JO','962',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Kazakhstan','KZ','7',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Kenya','KE','254',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Kiribati','KI','686',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Kosovo','/  ','381',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Kuwait','KW','965',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Kyrgyzstan','KG','996',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Laos','LA','856',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Latvia','LV','371',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Lebanon','LB','961',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Lesotho','LS','266',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Liberia','LR','231',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Libya','LY','218',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Liechtenstein','LI','423',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Lithuania','LT','370',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Luxembourg','LU','352',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Macau','MO','853',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Macedonia','MK','389',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Madagascar','MG','261',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Malawi','MW','265',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Malaysia','MY','60',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Maldives','MV','960',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mali','ML','223',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Malta','MT','356',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Marshall Islands','MH','692',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mauritania','MR','222',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mauritius','MU','230',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mayotte','YT','262',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mexico','MX','52',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Micronesia','FM','691',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Moldova','MD','373',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Monaco','MC','377',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mongolia','MN','976',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Montenegro','ME','382',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Montserrat','MS','1 664 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Morocco','MA','212',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Mozambique','MZ','258',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Namibia','NA','264',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Nauru','NR','674',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Nepal','NP','977',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Netherlands Antilles','AN','599',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Netherlands','NL','31',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'New Caledonia','NC','687',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'New Zealand','NZ','64',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Nicaragua','NI','505',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Niger','NE','227',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Nigeria','NG','234',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Niue','NU','683',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Norfolk Island','/ NFK ','672',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'North Korea','KP','850',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Northern Mariana Islands','MP','1 670 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Norway','NO','47',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Oman','OM','968',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Pakistan','PK','92',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Palau','PW','680',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Panama','PA','507',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Papua New Guinea','PG','675',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Paraguay','PY','595',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Peru','PE','51',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Philippines','PH','63',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Pitcairn Islands','PN','870',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Poland','PL','48',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Portugal','PT','351',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Puerto Rico','PR','1',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Qatar','QA','974',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Republic of the Congo','CG','242',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Romania','RO','40',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Russia','RU','7',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Rwanda','RW','250',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Barthelemy','BL','590',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Helena','SH','290',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Kitts and Nevis','KN','1 869 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Lucia','LC','1 758 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Martin','MF','1 599 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Pierre and Miquelon','PM','508',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saint Vincent and the Grenadines','VC','1 784 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Samoa','WS','685',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'San Marino','SM','378',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Sao Tome and Principe','ST','239',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Saudi Arabia','SA','966',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Senegal','SN','221',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Serbia','RS','381',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Seychelles','SC','248',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Sierra Leone','SL','232',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Singapore','SG','65',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Slovakia','SK','421',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Slovenia','SI','386',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Solomon Islands','SB','677',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Somalia','SO','252',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'South Africa','ZA','27',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'South Korea','KR','82',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Spain','ES','34',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Sri Lanka','LK','94',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Sudan','SD','249',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Suriname','SR','597',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Swaziland','SZ','268',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Sweden','SE','46',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Switzerland','CH','41',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Syria','SY','963',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Taiwan','TW','886',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Tajikistan','TJ','992',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Tanzania','TZ','255',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Thailand','TH','66',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Timor-Leste','TL','670',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Togo','TG','228',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Tokelau','TK','690',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Tonga','TO','676',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Trinidad and Tobago','TT','1 868 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Tunisia','TN','216',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Turkey','TR','90',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Turkmenistan','TM','993',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Turks and Caicos Islands','TC','1 649 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Tuvalu','TV','688',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'US Virgin Islands','VI','1 340 ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Uganda','UG','256',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Ukraine','UA','380',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'United Arab Emirates','AE','971',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'United Kingdom','GB','44',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'United States','US','1',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Uruguay','UY','598',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Uzbekistan','UZ','998',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Vanuatu','VU','678',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Venezuela','VE','58',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Vietnam','VN','84',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Wallis and Futuna','WF','681',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Yemen','YE','967',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Zambia','ZM','260',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, longDescription, typeCode, shortDescription, created) VALUES (@typeIdVar,'Zimbabwe','ZW','263',CURRENT_TIMESTAMP);

/* Subject Areas */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Subject Areas','Cancer, Urology, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Subject Areas';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Urology', NULL, 'URO', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'Oncology', NULL, 'ONC', CURRENT_TIMESTAMP);

/* Journal Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Journal Types','PLOSOne, PLOS Biology, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Journal Types';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'PLOSOne', NULL, 'PL1', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'PLOS Genetics', NULL, 'PLGE', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar, 'PLOS Biology', NULL, 'PLBI', CURRENT_TIMESTAMP);

/* Country Types */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Country Types','United States, Canada, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Country Types';
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AD','Andorra', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AE','United Arab Emirates', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AF','Afghanistan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AG','Antigua and Barbuda', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AI','Anguilla', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AL','Albania', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AM','Armenia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AO','Angola', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AQ','Antarctica', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AR','Argentina', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AS','American Samoa', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AT','Austria', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AU','Australia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AW','Aruba', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AX','Åland Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'AZ','Azerbaijan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BA','Bosnia and Herzegovina', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BB','Barbados', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BD','Bangladesh', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BE','Belgium', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BF','Burkina Faso', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BG','Bulgaria', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BH','Bahrain', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BI','Burundi', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BJ','Benin', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BL','Saint Barthélemy', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BM','Bermuda', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BN','Brunei Darussalam', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BO','Bolivia (Plurinational State of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BQ','Bonaire, Sint Eustatius and Saba', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BR','Brazil', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BS','Bahamas', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BT','Bhutan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BV','Bouvet Island', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BW','Botswana', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BY','Belarus', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'BZ','Belize', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CA','Canada', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CC','Cocos (Keeling) Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CD','Congo (the Democratic Republic of the)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CF','Central African Republic', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CG','Congo', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CH','Switzerland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CI','Côte d''Ivoire', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CK','Cook Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CL','Chile', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CM','Cameroon', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CN','China', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CO','Colombia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CR','Costa Rica', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CU','Cuba', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CV','Cabo Verde', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CW','Curaçao', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CX','Christmas Island', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CY','Cyprus', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'CZ','Czech Republic', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'DE','Germany', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'DJ','Djibouti', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'DK','Denmark', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'DM','Dominica', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'DO','Dominican Republic', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'DZ','Algeria', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'EC','Ecuador', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'EE','Estonia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'EG','Egypt', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'EH','Western Sahara', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ER','Eritrea', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ES','Spain', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ET','Ethiopia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'FI','Finland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'FJ','Fiji', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'FK','Falkland Islands (Malvinas)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'FM','Micronesia (Federated States of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'FO','Faroe Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'FR','France', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GA','Gabon', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GB','United Kingdom of Great Britain and Northern Ireland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GD','Grenada', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GE','Georgia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GF','French Guiana', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GG','Guernsey', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GH','Ghana', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GI','Gibraltar', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GL','Greenland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GM','Gambia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GN','Guinea', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GP','Guadeloupe', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GQ','Equatorial Guinea', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GR','Greece', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GS','South Georgia and the South Sandwich Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GT','Guatemala', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GU','Guam', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GW','Guinea-Bissau', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'GY','Guyana', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'HK','Hong Kong', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'HM','Heard Island and McDonald Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'HN','Honduras', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'HR','Croatia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'HT','Haiti', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'HU','Hungary', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ID','Indonesia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IE','Ireland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IL','Israel', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IM','Isle of Man', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IN','India', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IO','British Indian Ocean Territory', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IQ','Iraq', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IR','Iran (Islamic Republic of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IS','Iceland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'IT','Italy', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'JE','Jersey', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'JM','Jamaica', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'JO','Jordan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'JP','Japan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KE','Kenya', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KG','Kyrgyzstan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KH','Cambodia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KI','Kiribati', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KM','Comoros', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KN','Saint Kitts and Nevis', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KP','Korea (the Democratic People''s Republic of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KR','Korea (the Republic of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KW','Kuwait', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KY','Cayman Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'KZ','Kazakhstan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LA','Lao People''s Democratic Republic', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LB','Lebanon', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LC','Saint Lucia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LI','Liechtenstein', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LK','Sri Lanka', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LR','Liberia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LS','Lesotho', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LT','Lithuania', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LU','Luxembourg', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LV','Latvia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'LY','Libya', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MA','Morocco', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MC','Monaco', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MD','Moldova (the Republic of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ME','Montenegro', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MF','Saint Martin (French part)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MG','Madagascar', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MH','Marshall Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MK','Macedonia (the former Yugoslav Republic of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ML','Mali', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MM','Myanmar', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MN','Mongolia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MO','Macao', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MP','Northern Mariana Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MQ','Martinique', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MR','Mauritania', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MS','Montserrat', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MT','Malta', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MU','Mauritius', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MV','Maldives', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MW','Malawi', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MX','Mexico', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MY','Malaysia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'MZ','Mozambique', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NA','Namibia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NC','New Caledonia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NE','Niger', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NF','Norfolk Island', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NG','Nigeria', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NI','Nicaragua', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NL','Netherlands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NO','Norway', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NP','Nepal', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NR','Nauru', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NU','Niue', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'NZ','New Zealand', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'OM','Oman', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PA','Panama', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PE','Peru', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PF','French Polynesia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PG','Papua New Guinea', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PH','Philippines', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PK','Pakistan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PL','Poland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PM','Saint Pierre and Miquelon', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PN','Pitcairn', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PR','Puerto Rico', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PS','Palestine, State of', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PT','Portugal', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PW','Palau', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'PY','Paraguay', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'QA','Qatar', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'RE','Réunion', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'RO','Romania', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'RS','Serbia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'RU','Russian Federation', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'RW','Rwanda', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SA','Saudi Arabia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SB','Solomon Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SC','Seychelles', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SD','Sudan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SE','Sweden', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SG','Singapore', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SH','Saint Helena, Ascension and Tristan da Cunha', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SI','Slovenia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SJ','Svalbard and Jan Mayen', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SK','Slovakia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SL','Sierra Leone', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SM','San Marino', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SN','Senegal', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SO','Somalia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SR','Suriname', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SS','South Sudan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ST','Sao Tome and Principe', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SV','El Salvador', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SX','Sint Maarten (Dutch part)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SY','Syrian Arab Republic', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'SZ','Swaziland', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TC','Turks and Caicos Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TD','Chad', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TF','French Southern Territories', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TG','Togo', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TH','Thailand', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TJ','Tajikistan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TK','Tokelau', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TL','Timor-Leste', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TM','Turkmenistan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TN','Tunisia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TO','Tonga', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TR','Turkey', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TT','Trinidad and Tobago', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TV','Tuvalu', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TW','Taiwan (Province of China)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'TZ','Tanzania, United Republic of', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'UA','Ukraine', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'UG','Uganda', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'UM','United States Minor Outlying Islands', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'US','United States of America', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'UY','Uruguay', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'UZ','Uzbekistan', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VA','Holy See', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VC','Saint Vincent and the Grenadines', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VE','Venezuela (Bolivarian Republic of)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VG','Virgin Islands (British)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VI','Virgin Islands (U.S.)', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VN','Viet Nam', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'VU','Vanuatu', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'WF','Wallis and Futuna', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'WS','Samoa', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'YE','Yemen', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'YT','Mayotte', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ZA','South Africa', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ZM','Zambia', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, typeCode, shortDescription, created) VALUES (@typeIdVar,'ZW','Zimbabwe', CURRENT_TIMESTAMP);

/* Unique Identifier Types (INDIVIDUAL) */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('UID Individual Types','ORCID, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='UID Individual Types';
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'ORCID','ORC', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'Editorial Manager','EM', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'Salesforce','SF', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'Ambra','AMB', CURRENT_TIMESTAMP);

/* Unique Identifier Types (ORGANIZATION) */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('UID Organization Types','ORCID, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='UID Organization Types';
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'Ringgold','RG', CURRENT_TIMESTAMP);

/* State and Province Codes */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('State and Province Codes','CA, ONT, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='State and Province Codes';
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'CA','California','CA',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'NY','New York','NY',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'ONT','Ontario','ONT',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'NJ','New Jersey','NJ',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'TX','Texas','TX',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'WV','West Virginia','WV',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'TN','Tennessee','TN',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'IN','Indiana','IN',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'Queensland','Australia','QNLD',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'Victoria','Australia','VICT',CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId,shortDescription,longDescription,typeCode,created) VALUES (@typeIdVar,'Zhejiang','China','ZHEJ',CURRENT_TIMESTAMP);

/* Degrees */
INSERT INTO typeDescriptions(description, howUsed) VALUES ('Degrees','MD, PhD, etc');
SELECT id INTO @typeIdVar FROM typeDescriptions WHERE description='Degrees';
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'PhD','PHD', CURRENT_TIMESTAMP);
INSERT INTO globalTypes (typeId, shortDescription, typeCode, created) VALUES (@typeIdVar,'MD','MD', CURRENT_TIMESTAMP);
