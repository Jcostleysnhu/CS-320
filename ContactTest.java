package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;


class ContactTest {

	@Test
	void testContactClass() {
		Contact Contact = new Contact("IDNumber1", "First", "Last", "8001234567", "1234 Address Rd. City, ST");
		assertTrue(Contact.getContactID().equals("IDNumber1"));
		assertTrue(Contact.getfirstName().equals("First"));
		assertTrue(Contact.getlastName().equals("Last"));
		assertTrue(Contact.getphone().equals("8001234567"));
		assertTrue(Contact.getaddress().equals("1234 Address Rd. City, ST"));
	}
	
	//ContactID Tests
	@Test
    public void testContactIdLengthLess10() {
        Contact Contact = new Contact("IDNumber1", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("IDNumber1", Contact.getContactID());
    }
	
	@Test
    public void testContactIdLengthEqual10() {
        Contact Contact = new Contact("IDNumber10", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("IDNumber10", Contact.getContactID());
    }

	@Test
    public void testContactIdLengthGreater10() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact("IDNumber123456", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        });
    }
	
	@Test
    public void testContactIdNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(null, "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        });
    }
	
	//firstName Tests
	@Test
    public void testfirstNameLengthLess10() {
        Contact Contact = new Contact("IDNumber10", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("First", Contact.getfirstName());
    }
	
	@Test
    public void testfirstNameLengthEqual10() {
        Contact Contact = new Contact("IDNumber10", "FirstName1", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("FirstName1", Contact.getfirstName());
    }

	@Test
    public void testfirstNameLengthGreater10() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact("IDNumber10", "FirstName12345", "Last", "1234567890", "1234 Address Rd. City, ST");
        });
    }
	
	//Last Name Tests
	@Test
    public void testlastNameLengthLess10() {
        Contact Contact = new Contact("IDNumber10", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("Last", Contact.getlastName());
    }
	
	@Test
    public void testlastNameLengthEqual10() {
        Contact Contact = new Contact("IDNumber10", "First", "LastName10", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("LastName10", Contact.getlastName());
    }

	@Test
    public void testlastNameLengthGreater10() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact("IDNumber10", "First", "Last123456789", "1234567890", "1234 Address Rd. City, ST");
        });
    }
	
	//phone Tests
	@Test
	public void testPhoneLengthLess10() {
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("IDNumber10", "First", "Last", "1", "1234 Address Rd. City, ST");
	    });
	}
	
	@Test
    public void testPhoneLengthEqual10() {
        Contact Contact = new Contact("IDNumber10", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("1234567890", Contact.getphone());
    }

	@Test
    public void testPhoneLengthGreater10() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact("IDNumber10", "First", "Last", "12345678900", "1234 Address Rd. City, ST");
        });
    }
	
	//Address Tests
	@Test
    public void testAddressLengthLess30() {
        Contact Contact = new Contact("IDNumber10", "First", "Last", "1234567890", "1234 Address Rd. City, ST");
        assertEquals("1234 Address Rd. City, ST", Contact.getaddress());
    }
	
	@Test
    public void testAddressLengthEqual30() {
        Contact Contact = new Contact("IDNumber10", "First", "Last", "1234567890", "123456789 Address Rd. City, ST");
        assertEquals("123456789 Address Rd. City, ST", Contact.getaddress());
    }

	@Test
    public void testAddressLengthGreater30() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact("IDNumber10", "First", "Last", "1234567890", "12345678900 Address Rd. City, ST");
        });
    }
}
