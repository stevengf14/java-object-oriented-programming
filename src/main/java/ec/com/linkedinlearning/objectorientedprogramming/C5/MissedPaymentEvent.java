package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.sql.Timestamp;

/**
 *
 * @author steve
 */
public class MissedPaymentEvent implements Event {

    private Long createdTimestamp;
    private String id;

    public MissedPaymentEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer: " + id + " missed their payment. Sending a bill to the customer.");
    }

}
