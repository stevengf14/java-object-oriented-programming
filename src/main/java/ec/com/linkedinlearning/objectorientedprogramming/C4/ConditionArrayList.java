package ec.com.linkedinlearning.objectorientedprogramming.C4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 *
 * @author steve
 */
public class ConditionArrayList extends ArrayList<Integer> {

    private Predicate<Integer> condition;

    public ConditionArrayList(Predicate<Integer> predicate, Integer... nums) {
        super(Arrays.stream(nums)
                .filter(predicate).collect(Collectors.toList()));
        this.condition = condition;
    }

    @Override
    public void add(int index, Integer element) {
        if (isEligible(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element) {
        if (isEligible(element)) {
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
                .filter(this::isEligible)
                .collect(Collectors.toList()));
    }

    public boolean isEligible(Integer element) {
        return condition.test(element);
    }
}
