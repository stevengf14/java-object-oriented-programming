package ec.com.linkedinlearning.objectorientedprogramming.C3;

import java.util.Stack;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {
        /*Stack<Character> charStack = new Stack<>();
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());*/

        ModArrayList modList = new ModArrayList();
        modList.add(0);
        modList.add(10);
        modList.add(20);
        modList.add(30);

        System.out.println(modList.getUsingMod(1));
        System.out.println(modList.getUsingMod(2));
        System.out.println(modList.getUsingMod(-2));
        System.out.println(modList.getUsingMod(40));
    }
}
