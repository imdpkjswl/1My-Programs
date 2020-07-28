import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Main {
    public static void main (String[] args) {

        //creating an object of Stack class
        Stack stk = new Stack();

        //pushing elements into stack
        stk.push("BMW");
        stk.push("Audi");
        stk.push("Ferrari");
        stk.push("Bugatti");
        stk.push("Jaguar");

        // Method 1
        //iteration over the stack
        Iterator it = stk.iterator();
        while(it.hasNext()) {
            //Object values = it.next();
            //System.out.println(values);
            System.out.println(it.next());
        }

        // Method 2
        System.out.println("Iteration over the stack using forEach() Method:");
        //invoking forEach() method for iteration over the stack
        stk.forEach(n -> {
            System.out.println(n);
        });


        // Method 3
        ListIterator<String> lit = stk.listIterator(stk.size());
        System.out.println("Iteration over the Stack from top to bottom:");
        while (lit.hasPrevious())
        {
            String avg = lit.previous();
            System.out.println(avg);
        }

        
    }
}  