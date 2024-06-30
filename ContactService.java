package Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contact> contacts;

    public ContactService() {
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contact.getContactID())) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    public boolean delContact(String contactID) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contactID)) {
                contacts.remove(cont);
                return true;
            }
        }
        return false;
    }

    public boolean updateFirstName(String contactID, String firstName) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contactID)) {
                if (firstName == null || firstName.length() > 10) {
                    throw new IllegalArgumentException("Invalid firstName");
                }
                cont.setFirstName(firstName);
                return true;
            }
        }
        return false;
    }

    public boolean updateLastName(String contactID, String lastName) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contactID)) {
                if (lastName == null || lastName.length() > 10) {
                    throw new IllegalArgumentException("Invalid lastName");
                }
                cont.setLastName(lastName);
                return true;
            }
        }
        return false;
    }

    public boolean updatePhone(String contactID, String phone) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contactID)) {
                if (phone == null || phone.length() != 10) {
                    throw new IllegalArgumentException("Invalid phone");
                }
                cont.setPhone(phone);
                return true;
            }
        }
        return false;
    }

    public boolean updateAddress(String contactID, String address) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contactID)) {
                if (address == null || address.length() > 30) {
                    throw new IllegalArgumentException("Invalid address");
                }
                cont.setAddress(address);
                return true;
            }
        }
        return false;
    }

    public Contact getContact(String contactID) {
        for (Contact cont : contacts) {
            if (cont.getContactID().equals(contactID)) {
                return cont;
            }
        }
        return null;
    }
}