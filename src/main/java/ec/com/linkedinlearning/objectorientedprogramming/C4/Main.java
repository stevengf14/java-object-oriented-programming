package ec.com.linkedinlearning.objectorientedprogramming.C4;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {

        /*Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
        ConditionArrayList divisibleByThreeListy
                = new ConditionArrayList(isDivisibleByThree);

        ConditionArrayList divisibleByThreeListy2
                = new ConditionArrayList(isDivisibleByThree,
                        1, 2, 3, 4, 5, 6, 9);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        ConditionArrayList divisibleByThreeListy3
                = new ConditionArrayList(isDivisibleByThree,
                        numsList);

        Predicate<Integer> isDivisibleBySix = n -> Math.abs(n) % 6 == 0;
        ConditionArrayList divisibleBySixList = new ConditionArrayList(isDivisibleBySix, divisibleByThreeListy);*/
        // Challenge
        Contact contactOne = new Contact("Sally", new PhoneNumber("2637263737"));
        Contact contactTwo = new Contact("Maggie Smith", new PhoneNumber(41, "9384713401"));
        Contact contactThree = new Contact("Roger Williams", new PhoneNumber("448474734929"));
        Contact contactFour = new Contact("David Jones", "david_jones@bluewire.com");
        Contact contactFive = new Contact("Sarah Brown", new PhoneNumber("2029384982"), "sarahb@tech.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);
    }

}
