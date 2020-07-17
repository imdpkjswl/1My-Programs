import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);


        // Print original queue
        System.out.println(q);

        // Push queue element into stack
        while(q.size() != 0) {
            st.push(q.poll());
        }

        // Enqueue stack element into queue.
        while(!st.empty()){
            q.add(st.pop());
        }

        // Print reversed queue
        System.out.println(q);

    }
}
