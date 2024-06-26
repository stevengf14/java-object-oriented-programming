package ec.com.linkedinlearning.objectorientedprogramming.C3;

import java.util.Stack;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
    }
}
