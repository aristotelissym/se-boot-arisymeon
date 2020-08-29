package gr.codehub.exone.structures;
import java.util.Stack;

public class StackReverse {

    String stringIn = "This is a String";
    Stack<Character> stacks = new Stack<>();

    public void stackString() {
        System.out.println("===Ex204===");
        System.out.println("Reverse String using Stack: ");
        for(int i=0; i<stringIn.length(); i++) {
            stacks.push(stringIn.charAt(i));
        }
        while(!stacks.isEmpty()) {
            System.out.println(stacks.peek());
            stacks.pop();
        }

    }
}
