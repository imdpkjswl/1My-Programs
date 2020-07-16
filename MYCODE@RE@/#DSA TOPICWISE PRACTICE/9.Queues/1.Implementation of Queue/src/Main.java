import java.util.Scanner;

// Implementing basic single queue
public class Main {

    static int n=10, front = 0, rear = -1;

    static int[] queue = new int[n];

    // enque at rear only
    static void enque(int item) {
        if (rear == n-1){
            System.out.println("Queue is full.");
            return;
        }
        queue[++rear] = item;
        System.out.println("Enqueued successfully.");
    }

    // deque at front only
    static void deque() {
        if (front == rear+1){
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("Dequeued successfully: "+queue[front++]);
    }

    // print queue element
    static void traverse() {
        if (front == rear+1){
            System.out.println("Queue is Empty.");
            return;
        }

        for(int i=front;i<=rear;i++) {
            System.out.print(+queue[front++] + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ch, item;

        while (true) {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Traverse\n4.Exit\nEnter your choice:");
            ch = in.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter item:");
                    item = in.nextInt();
                    enque(item);
                    break;

                case 2:
                    deque();
                    break;

                case 3:
                    traverse();
                    break;

                case 4:
                    System.exit(1);
            }
        }


    }
}
