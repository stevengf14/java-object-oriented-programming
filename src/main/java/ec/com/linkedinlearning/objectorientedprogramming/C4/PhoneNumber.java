package ec.com.linkedinlearning.objectorientedprogramming.C4;

/**
 *
 * @author Steve
 */
public class PhoneNumber {

    private int countryCode;
    private String phoneNumber;

    public PhoneNumber(int countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            this.countryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length() - 10));
            this.phoneNumber = phoneNumber.substring(phoneNumber.length() - 10);
        } else {
            this.countryCode = 1;
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + countryCode + ", " + phoneNumber + '}';
    }

}
