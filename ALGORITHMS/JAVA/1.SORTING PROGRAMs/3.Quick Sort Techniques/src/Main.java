import java.util.Scanner;

public class Main {
    static void swap(int []a,int i,int []b,int j){
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }

    static int partition(int []a, int lb, int ub){
            int pivot, start, end;
            pivot = a[lb];
            start = lb;
            end = ub;

            while(start < end) {
                while (a[start] <= pivot) {
                    start++;
                }
                while (a[end] > pivot) {
                    end--;
                }
                if (start < end) {
                    swap(a, start, a, end);
                }
            }
            swap(a, lb, a, end);
            return end;
    }

    static void quickSort(int []a, int lb, int ub){
        int loc;
        if(lb < ub){
            loc = partition(a, lb, ub);
            quickSort(a, lb,loc-1);
            quickSort(a, loc+1,ub);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, a[];

        System.out.println("Enter the size:");
        n=in.nextInt();
        a = new int[n];

        for(int i=0;i<n;i++)
            a[i]=in.nextInt();


        quickSort(a,0,n-1);

        for(int i=0; i<n; i++) {
            System.out.print(a[i]+"  ");
        }


    }
}
