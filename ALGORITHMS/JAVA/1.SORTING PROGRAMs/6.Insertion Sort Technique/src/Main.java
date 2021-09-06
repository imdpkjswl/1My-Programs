import java.util.Scanner;


public class Main {
    static int[] a ; static int n;

    public static void insertionSort() {
        int cur;

        for(int i=1;i<n;i++){
            cur = a[i];
            int j = i-1;

            while(a[j] > key && j>=0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = cur;
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

        insertionSort();
        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");

    }

}
