package ec.com.linkedinlearning.objectorientedprogramming.C4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 *
 * @author steve
 */
public class OddArrayList extends ArrayList<Integer> {

    public OddArrayList(Integer... nums) {
        super(Arrays.stream(nums)
                .filter(OddArrayList::isOdd).collect(Collectors.toList()));
    }

    @Override
    public void add(int index, Integer element) {
        if (isOdd(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element) {
        if (isOdd(element)) {
            return super.add(element);
        } else {
            return false;
        }
    }

    @Override
    public void replaceAll(UnaryOperator<Integer> uo) {
        super.replaceAll(uo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer set(int index, Integer element) {
        return super.set(index, element); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList()));
    }

    public static boolean isOdd(Integer element) {
        return Math.abs(element) % 2 == 1;
    }
}
