import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static Queue<Integer> q = new LinkedList<>();

    // Push operation
    static void push(int item) {

        // get previous size of queue
        int size = q.size();

        // Add current element
        q.add(item);
        System.out.println(item + " pushed.");

        // Pop (or Dequeue) all previous elements and put them after current element
        for (int i = 0; i < size; i++) {

            // this will add front element into rear of queue
            int temp = q.remove();
            q.add(temp);
        }
    }

    // Removes the top element
    static void pop() {
        if (q.isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }

        System.out.println(q.remove() + " popped.");
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        pop();
        pop();
        pop();
        pop();
        pop();
    }

}