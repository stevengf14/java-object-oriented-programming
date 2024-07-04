package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.sql.Timestamp;

/**
 *
 * @author steve
 */
public class PasswordChangeEvent extends GenericEvent implements Event {

    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public Long getTimeStamp() {
        return createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer: " + id + " changed their password. Sending a confirmation email to the customer.");
    }

}
