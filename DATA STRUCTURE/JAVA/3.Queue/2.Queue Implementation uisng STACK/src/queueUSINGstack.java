import java.util.*;

// Java program to implement Queue using, Two stacks with costly enQueue()
public class queueUSINGstack {

    static Stack<Integer> s1 = new Stack();
    static Stack<Integer> s2 = new Stack();

    // Pushing item into front of queue
    static void enQueue(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push item into s1
        s1.push(x);

        // Push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue an item from  rear end od s1 from queue
    static int deQueue() {
        // if first stack is empty
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            System.exit(0);
        }

        // Return top of s1
        int x = s1.peek(); // Storing peek item into var bcuz pop method doesn't return ANY VALUE
        s1.pop();   // Deleting peek item
        return x;
    }

    static void display() {
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i : s1) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }


    // Driver code
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("Front Insert and Rear Delete Portal:");
        while (true) {
            System.out.println("1.Insert at Front\n2.Delete at Rear\n3.Display\n4.Exit");
            System.out.println("Enter your choice:");
            ch = in.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter an item:");
                    int item = in.nextInt();
                    enQueue(item);
                    break;

                case 2:
                    System.out.println("Deleted item is :  " + deQueue());
                    break;

                case 3:
                    System.out.println("The queue elements are:");
                    display();
                    break;

                case 4:
                    System.exit(0);

            }

        }
    }
}


