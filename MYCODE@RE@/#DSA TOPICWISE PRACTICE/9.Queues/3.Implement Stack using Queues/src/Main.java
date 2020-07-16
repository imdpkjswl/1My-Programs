import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int item) {

        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }

        q1.add(item);
        System.out.println("Pushed:  "+item);

        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }

    static void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Popped:  "+q1.remove());
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
