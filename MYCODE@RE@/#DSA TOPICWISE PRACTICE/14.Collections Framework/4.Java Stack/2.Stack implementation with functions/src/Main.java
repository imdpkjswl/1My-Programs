import java.util.*;

public class Main {

    public static void main(String args[]) {

        //creating an object of Stack class
        Stack <Integer> stk = new Stack<>();
        System.out.println("stack: " + stk);

        //pushing elements into the stack
        pushElement(stk, 20);
        pushElement(stk, 13);
        pushElement(stk, 89);
        pushElement(stk, 90);
        pushElement(stk, 11);
        pushElement(stk, 45);
        pushElement(stk, 18);

        //popping elements from the stack
        popElement(stk);
        popElement(stk);

        //throws exception if the stack is empty
        try {
            popElement(stk);
        }
        catch (EmptyStackException e) {
            System.out.println("empty stack");
        }

        // Peek top element
        System.out.println("\nPeek element is:  "+stk.peek());

        // Returns:If search() returns -1, it means that the object is not on the stack.
        if(stk.search(13) != -1){
            System.out.println("Element found in stack");
        }
        else{
            System.out.println("Element not found in stack");
        }

        // Size of stack
        System.out.println("The size of stack:  "+stk.size());
    }

    //performing push operation
    static void pushElement(Stack stk, int x) {
        //invoking push() method
        stk.push(new Integer(x)); // Insert Integer type object.
        System.out.println("push -> " + x);
        //prints modified stack
        System.out.println("stack: " + stk);
    }

    //performing pop operation
    static void popElement(Stack stk) {
        System.out.print("pop -> ");
        //invoking pop() method
        Integer x = (Integer) stk.pop();
        System.out.println(x);
        //prints modified stack
        System.out.println("stack: " + stk);
    }

}