package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.sql.Timestamp;

/**
 *
 * @author Steve
 */
public class AccountTransferPaymentEvent implements Event {

    private Long createdTimestamp;
    private String id;

    public AccountTransferPaymentEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer: " + id + " needs to transfer their service. Reaching out to "
                + "CTE to remove service form old device and add service to new device.");
    }

}
