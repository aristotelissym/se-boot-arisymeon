package gr.codehub.exone.structures;

import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    public ArrayList<Integer> stack = new ArrayList<>(Arrays.asList(2,4,8,16,32));
    public int topElementSize = stack.size()-1;

    public void stackSimulation() {
        System.out.println("Initial Stack is: " +stack);
        System.out.println("- .peek() retrieves the top element of the stack: ");
        peekStack();

        System.out.println("- Stack after .pop() deletes the top element of the stack: ");
        popStack();

        System.out.println("- Stack after .push() puts a new element at the top of the stack: ");
        pushStack();
    }

    public void peekStack() {
        System.out.println(stack.get(topElementSize));
    }

    public void popStack() {
        stack.remove(stack.get(topElementSize));
        System.out.println(stack);

    }

    public void pushStack() {
        stack.add(topElementSize, 111);
        System.out.println(stack);
    }
}
