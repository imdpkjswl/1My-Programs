import java.util.Scanner;

public class heapSort {

    public static void bottom_up_heapify(int []a, int n) {
        int item,c;

        for(int i=(n-1)/2;i>=0;i--) // starting from non-leaf node
        {
            item = a[i];  // Item is the next non-leaf node
            c = 2*i + 1;  // obtain the position of left child

            while(c <= n-1)
            {
                // obtain the position of largest child
                if(c+1 <= n-1  && a[c] < a[c+1])
                    c = c+1;
                if(item < a[c]) // if parent is less than the child
                {
                    a[i] = a[c]; // move largest child to parent position
                    i = c;  // slide the parent to the child position
                    c = 2*i +1;  // obtain the new left child
                }
                else
                    break; // terminate the algorithm, insert the item at the parent position

            }
            a[i] = item;  // Insert the item and create the heap
        }
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int []a = new int[30];
        System.out.println("Enter the no.of elements to be inserted:");
        int n = in.nextInt();
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }

        bottom_up_heapify(a, n);
        System.out.println("Create heap is:");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+"  ");
        }


        for(int i=n-1;i>=0;i--){
            int temp;  // swap root with last leaf and create the heap
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            bottom_up_heapify(a, i);
        }

        System.out.println("\nHeap sort:");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+"  ");
        }

    }
}