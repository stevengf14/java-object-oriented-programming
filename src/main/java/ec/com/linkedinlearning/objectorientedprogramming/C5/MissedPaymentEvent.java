package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.sql.Timestamp;

/**
 *
 * @author steve
 */
public class MissedPaymentEvent extends GenericEvent implements Event {

    public MissedPaymentEvent(String id) {
        super(id);
    }

    @Override
    public Long getTimeStamp() {
        return createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer: " + id + " missed their payment. Sending a bill to the customer.");
    }

}
