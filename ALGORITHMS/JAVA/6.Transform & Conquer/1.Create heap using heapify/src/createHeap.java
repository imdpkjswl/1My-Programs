import java.util.Scanner;

/**
 *  Padma Reddy Algorithm for creating max heap without recursion.
 */
public class createHeap {

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

        System.out.println("Heap tree(Level wise):");
        for(int i=0;i<n;i++) {
            if(i==1 || i==3 || i==7 || i==15 || i==31 ||i ==63)  // new level starts
                System.out.println();
            System.out.print(a[i]+"  ");

        }

              /*  17
               /      \
             15         13
           /    \      /  \
          9      6    5   10
         / \    /  \
         4   8  3    1      */
    }
}