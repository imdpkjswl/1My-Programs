// Quick Sort is also known as Partition Exchange Sort.....
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static  Scanner s = new Scanner(System.in);

    static void generaterandom(int min, int max, int a[]) {
        Random r = new Random();

        for(int i=0;i<a.length;i++) {
            a[i]=r.nextInt((max-min)+1)+min;  // Storing rand number in between 5k-6k into array.
        }
    }

/*
    static int partition(int a[], int start, int end) {

        int left, right, temp, loc, flag;
        loc = left = start;
        right = end;
        flag = 0;
        while(flag != 1)
        {
            while((a[loc] <= a[right]) && (loc!=right))
                right--;

            if(loc==right)
                flag =1;
            else if(a[loc]>a[right])
            {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }

            if(flag!=1)
            {
                while((a[loc] >= a[left]) && (loc!=left))
                    left++;

                if(loc==left)
                    flag =1;
                else if(a[loc] <a[left])
                {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }
*/
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


    static void SortQuick(int []a, int start, int end) {

        int loc;
        if(start < end)
        {
            loc = partition(a, start, end);
            SortQuick(a, start, loc-1);
            SortQuick(a, loc+1, end);
        }
    }

    public static void main(String[] args)
    {
        int a[],min=5001, max=5999,n;
        long starttime, stoptime, consumedtime;

        starttime=System.nanoTime();

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        generaterandom(min, max, a);

        SortQuick(a,0,n-1);

        stoptime=System.nanoTime();

        consumedtime= TimeUnit.MICROSECONDS.convert(stoptime-starttime, TimeUnit.NANOSECONDS);

        System.out.println("The Sorted Array Is Displayed Below");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Time Take To Sort Array Using Quick Sort Is "+consumedtime+" Microseconds");
    }
}