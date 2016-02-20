=begin


OpenAPI spec version: Swagger Server

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'

# Unit tests for NedClient::OrganizationsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'OrganizationsApi' do
  before do
    # run before each test
    @instance = NedClient::OrganizationsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of OrganizationsApi' do
    it 'should create an instact of OrganizationsApi' do
      @instance.should be_a(NedClient::OrganizationsApi)
    end
  end

  # unit tests for find_organizations
  # Find organizations matching specified attribute.
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :attribute 
  # @option opts [String] :value 
  # @return [Array<OrganizationComposite>]
  describe 'find_organizations test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for create_organization
  # Create organization
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [OrganizationComposite] :body 
  # @option opts [String] :authorization 
  # @return [OrganizationComposite]
  describe 'create_organization test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for read_organization
  # Read organization by Ned ID
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @return [OrganizationComposite]
  describe 'read_organization test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_addresses
  # List addresses
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @return [Array<Address>]
  describe 'get_addresses test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for create_address
  # Create address
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @option opts [Address] :body 
  # @option opts [String] :authorization 
  # @return [Address]
  describe 'create_address test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_address
  # Read address
  # 
  # @param ned_id 
  # @param address_id 
  # @param [Hash] opts the optional parameters
  # @return [Address]
  describe 'get_address test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for update_address
  # Update address
  # 
  # @param ned_id 
  # @param address_id 
  # @param [Hash] opts the optional parameters
  # @option opts [Address] :body 
  # @option opts [String] :authorization 
  # @return [Address]
  describe 'update_address test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for delete_address
  # Delete address
  # 
  # @param ned_id 
  # @param address_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization 
  # @return [Array<Address>]
  describe 'delete_address test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_emails
  # List emails
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @return [Array<Email>]
  describe 'get_emails test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for create_email
  # Create email
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @option opts [Email] :body 
  # @option opts [String] :authorization 
  # @return [Email]
  describe 'create_email test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_email
  # Read email
  # 
  # @param ned_id 
  # @param email_id 
  # @param [Hash] opts the optional parameters
  # @return [Email]
  describe 'get_email test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for update_email
  # Update email
  # 
  # @param ned_id 
  # @param email_id 
  # @param [Hash] opts the optional parameters
  # @option opts [Email] :body 
  # @option opts [String] :authorization 
  # @return [Email]
  describe 'update_email test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for delete_email
  # Delete email
  # 
  # @param ned_id 
  # @param email_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization 
  # @return [nil]
  describe 'delete_email test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_phonenumbers
  # List phone numbers
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @return [Array<Phonenumber>]
  describe 'get_phonenumbers test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_uids
  # List UIDs
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @return [Array<Uniqueidentifier>]
  describe 'get_uids test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for create_uid
  # Create UID
  # 
  # @param ned_id 
  # @param [Hash] opts the optional parameters
  # @option opts [Uniqueidentifier] :body 
  # @option opts [String] :authorization 
  # @return [Uniqueidentifier]
  describe 'create_uid test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_uid
  # Read uid
  # 
  # @param ned_id 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [Uniqueidentifier]
  describe 'get_uid test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for update_uid
  # Update UID
  # 
  # @param ned_id 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization 
  # @option opts [Uniqueidentifier] :body 
  # @return [Uniqueidentifier]
  describe 'update_uid test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for read_organization_by_uid
  # Read organization by UID
  # 
  # @param uid_type 
  # @param uid_value 
  # @param [Hash] opts the optional parameters
  # @return [OrganizationComposite]
  describe 'read_organization_by_uid test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

end