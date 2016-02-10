# coding: utf-8

"""
Copyright 2016 SmartBear Software

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    Ref: https://github.com/swagger-api/swagger-codegen
"""

from pprint import pformat
from six import iteritems


class Url(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        Url - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'int',
            'nedid': 'int',
            'source': 'str',
            'sourcetypeid': 'int',
            'created': 'datetime',
            'lastmodified': 'datetime',
            'createdby': 'int',
            'createdbyname': 'str',
            'lastmodifiedby': 'int',
            'lastmodifiedbyname': 'str',
            'url': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'nedid': 'nedid',
            'source': 'source',
            'sourcetypeid': 'sourcetypeid',
            'created': 'created',
            'lastmodified': 'lastmodified',
            'createdby': 'createdby',
            'createdbyname': 'createdbyname',
            'lastmodifiedby': 'lastmodifiedby',
            'lastmodifiedbyname': 'lastmodifiedbyname',
            'url': 'url'
        }

        self._id = None
        self._nedid = None
        self._source = None
        self._sourcetypeid = None
        self._created = None
        self._lastmodified = None
        self._createdby = None
        self._createdbyname = None
        self._lastmodifiedby = None
        self._lastmodifiedbyname = None
        self._url = None

    @property
    def id(self):
        """
        Gets the id of this Url.


        :return: The id of this Url.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Url.


        :param id: The id of this Url.
        :type: int
        """
        self._id = id

    @property
    def nedid(self):
        """
        Gets the nedid of this Url.


        :return: The nedid of this Url.
        :rtype: int
        """
        return self._nedid

    @nedid.setter
    def nedid(self, nedid):
        """
        Sets the nedid of this Url.


        :param nedid: The nedid of this Url.
        :type: int
        """
        self._nedid = nedid

    @property
    def source(self):
        """
        Gets the source of this Url.


        :return: The source of this Url.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this Url.


        :param source: The source of this Url.
        :type: str
        """
        self._source = source

    @property
    def sourcetypeid(self):
        """
        Gets the sourcetypeid of this Url.


        :return: The sourcetypeid of this Url.
        :rtype: int
        """
        return self._sourcetypeid

    @sourcetypeid.setter
    def sourcetypeid(self, sourcetypeid):
        """
        Sets the sourcetypeid of this Url.


        :param sourcetypeid: The sourcetypeid of this Url.
        :type: int
        """
        self._sourcetypeid = sourcetypeid

    @property
    def created(self):
        """
        Gets the created of this Url.


        :return: The created of this Url.
        :rtype: datetime
        """
        return self._created

    @created.setter
    def created(self, created):
        """
        Sets the created of this Url.


        :param created: The created of this Url.
        :type: datetime
        """
        self._created = created

    @property
    def lastmodified(self):
        """
        Gets the lastmodified of this Url.


        :return: The lastmodified of this Url.
        :rtype: datetime
        """
        return self._lastmodified

    @lastmodified.setter
    def lastmodified(self, lastmodified):
        """
        Sets the lastmodified of this Url.


        :param lastmodified: The lastmodified of this Url.
        :type: datetime
        """
        self._lastmodified = lastmodified

    @property
    def createdby(self):
        """
        Gets the createdby of this Url.


        :return: The createdby of this Url.
        :rtype: int
        """
        return self._createdby

    @createdby.setter
    def createdby(self, createdby):
        """
        Sets the createdby of this Url.


        :param createdby: The createdby of this Url.
        :type: int
        """
        self._createdby = createdby

    @property
    def createdbyname(self):
        """
        Gets the createdbyname of this Url.


        :return: The createdbyname of this Url.
        :rtype: str
        """
        return self._createdbyname

    @createdbyname.setter
    def createdbyname(self, createdbyname):
        """
        Sets the createdbyname of this Url.


        :param createdbyname: The createdbyname of this Url.
        :type: str
        """
        self._createdbyname = createdbyname

    @property
    def lastmodifiedby(self):
        """
        Gets the lastmodifiedby of this Url.


        :return: The lastmodifiedby of this Url.
        :rtype: int
        """
        return self._lastmodifiedby

    @lastmodifiedby.setter
    def lastmodifiedby(self, lastmodifiedby):
        """
        Sets the lastmodifiedby of this Url.


        :param lastmodifiedby: The lastmodifiedby of this Url.
        :type: int
        """
        self._lastmodifiedby = lastmodifiedby

    @property
    def lastmodifiedbyname(self):
        """
        Gets the lastmodifiedbyname of this Url.


        :return: The lastmodifiedbyname of this Url.
        :rtype: str
        """
        return self._lastmodifiedbyname

    @lastmodifiedbyname.setter
    def lastmodifiedbyname(self, lastmodifiedbyname):
        """
        Sets the lastmodifiedbyname of this Url.


        :param lastmodifiedbyname: The lastmodifiedbyname of this Url.
        :type: str
        """
        self._lastmodifiedbyname = lastmodifiedbyname

    @property
    def url(self):
        """
        Gets the url of this Url.


        :return: The url of this Url.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """
        Sets the url of this Url.


        :param url: The url of this Url.
        :type: str
        """
        self._url = url

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other): 
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """ 
        Returns true if both objects are not equal
        """
        return not self == other

