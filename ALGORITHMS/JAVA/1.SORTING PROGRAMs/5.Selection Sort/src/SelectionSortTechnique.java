import java.util.Scanner;


public class SelectionSortTechnique {
    static int[] a ; static int n;

    public static void selectionSort() {
        int pos,temp;

        for(int i=0;i<n;i++){
            pos = i;
            for(int j=i+1;j< n;j++){
                if(a[j] < a[pos])
                    pos = j;  // saving the index of bigger item
            }

            temp = a[pos]; // exchange with small item
            a[pos] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter number of elements");
        n=in.nextInt();

        a = new int[n];

        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();

        selectionSort();
        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");

    }

}
