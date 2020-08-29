package gr.codehub.exone.structures;
import java.util.Stack;

public class Symmetric {
    String text = "AaabdbAaA";
    String reverseText = "";

    Stack<Character> stackSym = new Stack<>();

    public void findSymmetric () {
        System.out.println("===Ex205===");

        for(int i=0; i<text.length(); i++) {
            stackSym.push(text.charAt(i));
        }

        while(!stackSym.isEmpty()) {
            reverseText = reverseText+stackSym.peek();
            stackSym.pop();
        }

        if (text.toLowerCase().equals(reverseText.toLowerCase()))
            System.out.println(text+ " is Symmetrical!");
        else
            System.out.println(text+ " is not Symmetrical");
    }
}
