package ec.com.linkedinlearning.objectorientedprogramming.C4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {
        /*OddArrayList oddListy = new OddArrayList(1, 2, 3, 4, 7, 9, -13);

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

        OddArrayList oddListy = new OddArrayList(7);
        oddListy.add(1);
        oddListy.add(2);
        addRandomNumber(oddListy);
        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        addRandomNumber(listy);
        System.out.println(listy);

    }

    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size();
        Random random = new Random();
        while (originalSize + 1 != list.size()) {
            int n = random.nextInt(1000);
            list.add(n);
        }
    }

}
