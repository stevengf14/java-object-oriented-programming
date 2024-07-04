package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.sql.Timestamp;

/**
 *
 * @author Steve
 */
public class AccountTransferPaymentEvent extends GenericEvent implements Event {

    public AccountTransferPaymentEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer: " + id + " needs to transfer their service. Reaching out to "
                + "CTE to remove service form old device and add service to new device.");
    }

}
