package org.plos.namedentity.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.plos.namedentity.api.IndividualComposite;
import org.plos.namedentity.api.NedValidationException;
import org.plos.namedentity.api.dto.AddressDTO;
import org.plos.namedentity.api.dto.EmailDTO;
import org.plos.namedentity.api.dto.IndividualDTO;
import org.plos.namedentity.api.dto.PhonenumberDTO;
import org.plos.namedentity.api.dto.RoleDTO;
import org.plos.namedentity.api.entity.EmailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-beans.xml"})
public class NamedEntityServiceHighApiTest {

    @Autowired NamedEntityServiceHighApi nedSvcHighApi;
    @Autowired NamedEntityService        nedSvcLowApi;

	@Test
    public void testCreateIndividualWithoutRole() {
		// triggers phase 1 validation failure
        try {
            IndividualDTO dto = nedSvcHighApi.createIndividual(new IndividualComposite());
            fail();
        }
        catch (NedValidationException expected) {
			assertTrue(expected.getMessage().indexOf("No ROLE defined") != -1);
		}
    }

	@Test
    public void testCreateIndividualWithRole() {

		IndividualComposite composite = getIndividualWithRole();

        /* ------------------------------------------------------------------ */
        /*  EMAILS                                                            */
        /* ------------------------------------------------------------------ */

        List<EmailDTO> emails = new ArrayList<>();

		EmailDTO workEmail = new EmailDTO();
		workEmail.setEmailtype("Work");
		workEmail.setEmailaddress("fu.manchu.work@foo.com");
		workEmail.setIsprimary(true);
		emails.add( workEmail );

		EmailDTO personalEmail = new EmailDTO();
		personalEmail.setEmailtype("Personal");
		personalEmail.setEmailaddress("fu.manchu.home@foo.com");
		personalEmail.setIsprimary(false);
		emails.add( personalEmail );

        composite.setEmails( emails );

        /* ------------------------------------------------------------------ */
        /*  PHONE NUMBERS                                                     */
        /* ------------------------------------------------------------------ */

        List<PhonenumberDTO> phonenumbers = new ArrayList<>();

        PhonenumberDTO officePhone = new PhonenumberDTO();
        officePhone.setPhonenumbertype("Office");
        officePhone.setCountrycodetype("01");
        officePhone.setPhonenumber("123-456-7890");
        officePhone.setIsprimary(true);
        phonenumbers.add( officePhone );

        PhonenumberDTO mobilePhone = new PhonenumberDTO();
        mobilePhone.setPhonenumbertype("Mobile");
        mobilePhone.setCountrycodetype("01");
        mobilePhone.setPhonenumber("123-444-0011");
        mobilePhone.setIsprimary(false);
        phonenumbers.add( mobilePhone );

        PhonenumberDTO homePhone = new PhonenumberDTO();
        homePhone.setPhonenumbertype("Home");
        homePhone.setCountrycodetype("01");
        homePhone.setPhonenumber("123-555-6666");
        homePhone.setIsprimary(false);
        phonenumbers.add( homePhone );

        composite.setPhonenumbers( phonenumbers );

        /* ------------------------------------------------------------------ */
        /*  ADDRESSES                                                         */
        /* ------------------------------------------------------------------ */

        List<AddressDTO> addresses = new ArrayList<>();

        AddressDTO officeAddress = new AddressDTO();
        officeAddress.setAddresstype("Office");
        officeAddress.setAddressline1("addressline1");
        officeAddress.setAddressline2("addressline2");
        officeAddress.setCity("city");
        officeAddress.setStatecodetype("CA");
        officeAddress.setCountrycodetype("United States");
        officeAddress.setPostalcode("1234567");
        officeAddress.setIsprimary(true);
        addresses.add( officeAddress );

        composite.setAddresses( addresses );

        Integer nedId = null;
		try {
			IndividualDTO dto = nedSvcHighApi.createIndividual(composite);
			assertNotNull(dto);
			assertNotNull(dto.getNamedentityid());
		}
		catch (NedValidationException e) {
			fail();
		}
		finally {
			EmailEntity emailSearchCriteria = new EmailEntity();
			emailSearchCriteria.setEmailaddress("fu.manchu.work@foo.com");
			List<EmailEntity> emailSearchResult = nedSvcLowApi.findByAttribute(emailSearchCriteria);
			assertEquals(1, emailSearchResult.size());

            nedId = emailSearchResult.get(0).getNamedentityid();
            assertNotNull( nedId );
		}

        // Test "By NedId" Finders

        IndividualDTO individualDto = nedSvcHighApi.findIndividualByNedId(nedId);
        assertNotNull( individualDto );

        List<AddressDTO> addressesDto = nedSvcHighApi.findAddressesByNedId(nedId);
        assertEquals(1, addressesDto.size());

        List<EmailDTO> emailsDto = nedSvcHighApi.findEmailsByNedId(nedId);
        assertEquals(2, emailsDto.size());

        List<PhonenumberDTO> phonenumbersDto = nedSvcHighApi.findPhoneNumbersByNedId(nedId);
        assertEquals(3, phonenumbersDto.size());

        List<RoleDTO> rolesDto = nedSvcHighApi.findRolesByNedId(nedId);
        assertEquals(1, rolesDto.size());
    }

	@Test
    public void testCreateIndividualWithPhaseTwoValidationException() {

		IndividualComposite composite = getIndividualWithRole();

        List<EmailDTO> emails = new ArrayList<>();

		EmailDTO workEmail = new EmailDTO();
		workEmail.setEmailtype("Work");
		workEmail.setEmailaddress("foo@bar.com");
		workEmail.setIsprimary(true);
		emails.add( workEmail );

        composite.setEmails( emails );

		try {
			IndividualDTO dto = nedSvcHighApi.createIndividual(composite);
			fail();
		}
		catch (NedValidationException expected) {
		}
		// verify entities not committed to db. we'll just check email.
		finally {
			EmailEntity emailSearchCriteria = new EmailEntity();
			emailSearchCriteria.setEmailaddress("foo@bar.com");
			List<EmailEntity> emailSearchResult = nedSvcLowApi.findByAttribute(emailSearchCriteria);
			assertEquals(0, emailSearchResult.size());
		}
    }

	private IndividualComposite getIndividualWithRole() {

        IndividualComposite composite = new IndividualComposite();
        composite.setFirstname("firstname");
        composite.setMiddlename("middlename");
        composite.setLastname("lastname");
        composite.setNameprefix("Mr.");
        composite.setNamesuffix("III");
        composite.setPreferredlanguage("English");
        composite.setPreferredcommunication("Email");

        RoleDTO author = new RoleDTO();
        author.setRoletype("Author");
        author.setStartdate("2014-05-30");
        composite.setRole(author);

		return composite;
	}

    //TODO - add tests with address, email, and phone combinations
}