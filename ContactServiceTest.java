package Test;

import Contact.Contact;
import Contact.ContactService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
	
	//Add Contact Test
	@Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        assertTrue(contactService.addContact(contact));
    }
	
	//Delete Contact Test
	@Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        contactService.addContact(contact);
        assertTrue(contactService.delContact("IDNumber1"));
    }
	
	//Add a Duplicate Contact Test
	@Test
    public void testAddDuplicateContact() {
        ContactService contactService = new ContactService();
        Contact contact1 = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        Contact contact2 = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        contactService.addContact(contact1);
        assertFalse(contactService.addContact(contact2));
    }
	
	//Update First Name Test
	@Test
    public void testUpdateFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        contactService.addContact(contact);
        assertTrue(contactService.updateFirstName("IDNumber1", "NewFirst"));
        assertEquals("NewFirst", contactService.getContact("IDNumber1").getfirstName());
    }
	
	//Update Last Name Test
	@Test
    public void testUpdateLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        contactService.addContact(contact);
        assertTrue(contactService.updateLastName("IDNumber1", "NewLast"));
        assertEquals("NewLast", contactService.getContact("IDNumber1").getlastName());
    }
	
	//Update Phone Number Test
	@Test
    public void testUpdatePhone() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        contactService.addContact(contact);
        assertTrue(contactService.updatePhone("IDNumber1", "8008675309"));
        assertEquals("8008675309", contactService.getContact("IDNumber1").getphone());
    }
	
	//Update Address Test
	@Test
    public void testUpdateAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
        contactService.addContact(contact);
        assertTrue(contactService.updateAddress("IDNumber1", "1234 A New Address City, ST"));
        assertEquals("1234 A New Address City, ST", contactService.getContact("IDNumber1").getaddress());
    }
}