package ec.com.linkedinlearning.objectorientedprogramming.C4;

/**
 *
 * @author Steve
 */
public class Contact {

    private String name;
    private PhoneNumber phoneNumber;
    private String email;

    public Contact(String name, PhoneNumber phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" + name + ", " + phoneNumber + ", " + email + '}';
    }

}
