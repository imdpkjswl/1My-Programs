import java.util.Stack;

public class Main {

    static void sortedInsert(Stack<Integer> s, int x) {

        // Base case: Either stack is empty or newly inserted
        // item is greater than top (more than all existing)
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }

    // Method to sort stack
    static void sortStack(Stack<Integer> s) {

        // If stack is not empty
        if (!s.isEmpty()) {

            // Remove the top item
            int x = s.pop();

            // Sort remaining stack
            sortStack(s);

            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(12);
        st.push(4);
        st.push(43);
        st.push(23);
        st.push(16);
        // Print original unsorted element
        System.out.println(st);

        // call sort method
        sortStack(st);

        // Print sorted element
        System.out.println(st);

    }
}
