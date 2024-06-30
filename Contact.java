package Contact;

public class Contact {
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String contactID;
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid contactID");
		}
		this.contactID = contactID;
		
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.firstName = firstName;
				
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		this.lastName = lastName;
				
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		this.phone = phone;
				
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getphone() {
		return phone;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}

	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}

	public void setPhone(String phone) {
	    this.phone = phone;
	}

	public void setAddress(String address) {
	    this.address = address;
	}
}
