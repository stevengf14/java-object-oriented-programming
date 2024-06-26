package ec.com.linkedinlearning.objectorientedprogramming.C3;

import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class ModArrayList extends ArrayList<Object> {

    public Object getUsingMod(int index) {
        return this.get(Math.abs(index) % this.size());
    }

}
