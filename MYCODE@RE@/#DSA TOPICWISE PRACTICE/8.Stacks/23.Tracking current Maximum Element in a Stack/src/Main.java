import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();  // original stack
        Stack<Integer> temp = new Stack<>(); // tracking max stack

        System.out.println("Enter the value of n:");
        int n = in.nextByte();

        for(int i=0;i<n;i++) {
            System.out.println("Enter element:");
            int item = in.nextInt();

            // For initial push operation on stack
            if(st.empty() && temp.empty()) {
                temp.push(item);
                st.push(item);
                System.out.println("Current max item:  "+temp.peek());
                continue;
            }

            st.push(item); // First push, then compare peek of both stack.
            if (st.peek() >= temp.peek()) {
                temp.push(item);
            } else {
                int prev = temp.pop();
                temp.push(item);
                temp.push(prev);
            }

            System.out.println("Current max item:  "+temp.peek());
        }
    }
}
