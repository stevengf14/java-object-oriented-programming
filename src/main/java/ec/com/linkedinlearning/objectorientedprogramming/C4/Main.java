package ec.com.linkedinlearning.objectorientedprogramming.C4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {
        /*ConditionArrayList oddListy = new ConditionArrayList(1, 2, 3, 4, 7, 9, -13);

        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(7);
        listy.add(9);
        listy.add(-13);

        System.out.println(listy);*/

        ConditionArrayList oddListy = new ConditionArrayList(n -> Math.abs(n) % 2 == 1);
        oddListy.add(1);
        oddListy.add(2);
        addRandomNumber(oddListy);
        System.out.println(oddListy);

        ConditionArrayList conditionListy = new ConditionArrayList(n -> Math.abs(n) % 2 == 0);
        conditionListy.add(1);
        conditionListy.add(2);
        addRandomNumber(conditionListy);
        System.out.println(conditionListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        addRandomNumber(listy);
        System.out.println(listy);

    }

    public static void addRandomNumber(ArrayList<Integer> list) {
        Random random = new Random();
        int n = random.nextInt(1000);

        if (list instanceof ConditionArrayList) {
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n)) {
                n = random.nextInt(1000);
            }
        }
        list.add(n);
    }

}
