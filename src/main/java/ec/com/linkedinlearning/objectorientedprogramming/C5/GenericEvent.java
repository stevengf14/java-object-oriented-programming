package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.sql.Timestamp;

/**
 *
 * @author steve
 */
public abstract class GenericEvent implements Event {

    protected Long createdTimestamp;
    protected String id;

    public GenericEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return createdTimestamp;
    }

    public abstract void process();

}
