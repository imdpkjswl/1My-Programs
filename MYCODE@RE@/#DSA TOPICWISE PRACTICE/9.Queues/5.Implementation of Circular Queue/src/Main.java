import java.util.Scanner;

public class Main {

    static int front=0 ,rear=-1;
    static int n = 5, count=0; // n is size of circular queue and count is used to trace no. of element in cq.
    static int[] cq = new int[n];

    static void insert_rear(int item) {

        if(count == n) {
            System.out.println("Queue is Full.");
            return;
        }

        ///Increment Rear by 1
        rear  = (rear+1)%n;
        cq[rear] = item;

        count++;

    }

    static void delete_front() {

        if(count == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Item is deleted =  " +cq[front]);

        ///Incremented Front by 1
        front = (front+1)%n;
        count--;
    }

    static void display() {

        if(count == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Element of queue are:");

        int i,k;
        for(k=1,i=front;k<=count;k++) {

            System.out.print(cq[i]+" ");
            i = (i+1)%n;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int item,choice;

        for(;;) {
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.println("Enter your choice:");
            choice = in.nextInt();


            switch(choice) {
                case 1:
                    System.out.println("Enter the item to be inserted:");
                    item = in.nextInt();
                    insert_rear(item);
                    break;

                case 2:
                    delete_front();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                   System.exit(0);

            }
        }
    }

}
