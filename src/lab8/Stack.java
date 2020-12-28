// Exercise 6
// Stack implementation using LinkedList

package lab8;

import java.util.*;

public class Stack {
    private LinkedList<Integer> stack;

    // constructor
    public Stack() {
        stack = new LinkedList<Integer>();
    }

    // accessor
    public LinkedList<Integer> getStack() {
        return stack;
    }

    // size of stack
    public int length() {
        return stack.size();
    }

    // add element to the end of stack
    public void append(int elem) {
        stack.add(elem);
    }

    // remove element from the end of stack
    public boolean delete() {
        if (length() == 0) {
            System.out.println("The stack is empty.");
            return false;
        }

        stack.remove(stack.size() - 1);
        return true;
    }

    // retrieve element from the end of stack, i.e., last element
    public int getElement() {
        return stack.get(stack.size() - 1);
    }

    public String toString() {
        return stack.toString();
    }
} // end of class Stack.

class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // remove last element
        stack.delete();

        // add elements
        stack.append(10);
        stack.append(11);
        stack.append(12);
        stack.append(13);
        System.out.println("Original stack: " + stack);

        // remove last element
        stack.delete();
        System.err.println("Last element deleted: " + stack);

        // retrieve last element
        System.out.println("Last element in stack: " + stack.getElement());

        // size of stack
        System.out.println("Size of stack: " + stack.length());

        // print stack
        System.out.println("Modified stack: " + stack);
    }
}