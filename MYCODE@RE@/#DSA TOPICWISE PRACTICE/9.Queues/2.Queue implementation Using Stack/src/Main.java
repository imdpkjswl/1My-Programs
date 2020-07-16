import java.util.Stack;

public class Main {

    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    static void enque(int item) {

        while(!st1.empty()) {
            st2.push(st1.pop());
        }

        st1.push(item);
        System.out.println(item +" is now inserted.");

        while(!st2.empty()){
            st1.push(st2.pop());
        }

    }

   // --> 1 2 3 4 Deque from the front side.
    static void deque() {

        if(st1.empty()){
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println(st1.pop()+" is now deleted.");
    }


    public static void main(String[] args) {

        enque(1);
        enque(2);
        enque(3);
        enque(4);

        deque();
        deque();
        deque();
        deque();
        deque();


    }
}
