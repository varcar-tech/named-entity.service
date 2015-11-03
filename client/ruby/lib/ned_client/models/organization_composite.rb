module NedClient
  # 
  class OrganizationComposite < BaseObject
    attr_accessor :addresses, :emails, :phonenumbers, :uniqueidentifiers, :created, :type, :source, :nedid, :typeid, :sourcetypeid, :lastmodified, :isactive, :familiarname, :legalname, :maincontactid, :type_name
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'addresses' => :'addresses',
        
        # 
        :'emails' => :'emails',
        
        # 
        :'phonenumbers' => :'phonenumbers',
        
        # 
        :'uniqueidentifiers' => :'uniqueidentifiers',
        
        # 
        :'created' => :'created',
        
        # 
        :'type' => :'type',
        
        # 
        :'source' => :'source',
        
        # 
        :'nedid' => :'nedid',
        
        # 
        :'typeid' => :'typeid',
        
        # 
        :'sourcetypeid' => :'sourcetypeid',
        
        # 
        :'lastmodified' => :'lastmodified',
        
        # 
        :'isactive' => :'isactive',
        
        # 
        :'familiarname' => :'familiarname',
        
        # 
        :'legalname' => :'legalname',
        
        # 
        :'maincontactid' => :'maincontactid',
        
        # 
        :'type_name' => :'typeName'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'addresses' => :'Array<Address>',
        :'emails' => :'Array<Email>',
        :'phonenumbers' => :'Array<Phonenumber>',
        :'uniqueidentifiers' => :'Array<Uniqueidentifier>',
        :'created' => :'DateTime',
        :'type' => :'String',
        :'source' => :'String',
        :'nedid' => :'Integer',
        :'typeid' => :'Integer',
        :'sourcetypeid' => :'Integer',
        :'lastmodified' => :'DateTime',
        :'isactive' => :'BOOLEAN',
        :'familiarname' => :'String',
        :'legalname' => :'String',
        :'maincontactid' => :'Integer',
        :'type_name' => :'String'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'addresses']
        if (value = attributes[:'addresses']).is_a?(Array)
          self.addresses = value
        end
      end
      
      if attributes[:'emails']
        if (value = attributes[:'emails']).is_a?(Array)
          self.emails = value
        end
      end
      
      if attributes[:'phonenumbers']
        if (value = attributes[:'phonenumbers']).is_a?(Array)
          self.phonenumbers = value
        end
      end
      
      if attributes[:'uniqueidentifiers']
        if (value = attributes[:'uniqueidentifiers']).is_a?(Array)
          self.uniqueidentifiers = value
        end
      end
      
      if attributes[:'created']
        self.created = attributes[:'created']
      end
      
      if attributes[:'type']
        self.type = attributes[:'type']
      end
      
      if attributes[:'source']
        self.source = attributes[:'source']
      end
      
      if attributes[:'nedid']
        self.nedid = attributes[:'nedid']
      end
      
      if attributes[:'typeid']
        self.typeid = attributes[:'typeid']
      end
      
      if attributes[:'sourcetypeid']
        self.sourcetypeid = attributes[:'sourcetypeid']
      end
      
      if attributes[:'lastmodified']
        self.lastmodified = attributes[:'lastmodified']
      end
      
      if attributes[:'isactive']
        self.isactive = attributes[:'isactive']
      end
      
      if attributes[:'familiarname']
        self.familiarname = attributes[:'familiarname']
      end
      
      if attributes[:'legalname']
        self.legalname = attributes[:'legalname']
      end
      
      if attributes[:'maincontactid']
        self.maincontactid = attributes[:'maincontactid']
      end
      
      if attributes[:'typeName']
        self.type_name = attributes[:'typeName']
      end
      
    end

    def type_name=(type_name)
      allowed_values = ["INDIVIDUAL", "ORGANIZATION", "INVALID_NAMEDPARTY_TYPE"]
      if type_name && !allowed_values.include?(type_name)
        fail "invalid value for 'type_name', must be one of #{allowed_values}"
      end
      @type_name = type_name
    end

  end
end