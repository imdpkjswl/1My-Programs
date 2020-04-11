import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Main
{
    static  Scanner s = new Scanner(System.in);

    static void generaterandom(int min, int max, int a[])
    {
        Random r = new Random();

        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt((max-min)+1)+min;
        }
    }
/*
    static void merge(int arr[], int beg, int mid, int end)
    {

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int [l];
        int  RightArray[] = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = beg;

        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void SortMerge(int arr[], int beg, int end)
    {
        if (beg<end)
        {
            int mid = (beg+end)/2;
            SortMerge(arr, beg, mid);
            SortMerge(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }
*/

static void sortMerge(int a[], int low, int high)
{
    int mid;
    if(low < high)
    {
        mid = (low+high)/2;
        sortMerge(a, low, mid);
        sortMerge(a,mid+1,high);
        merge(a, low, mid, high);
    }
}

    static void merge(int a[], int low, int mid, int high)
    {
        int i, j, h, k, b[]= new int[100000];
        h=low; i=low; j=mid+1;

        while((h<=mid) && (j<=high))
        {
            if(a[h] < a[j])
            {
                b[i]=a[h];
                h=h+1;
            }
            else
            {
                b[i] = a[j];
                j=j+1;
            }
            i = i+1;
        }

        if(h > mid)
        {
            for(k=j; k<=high; k++)
            {
                b[i]=a[k];
                i= i+1;
            }
        }
        else
        {
            for(k=h;k<=mid;k++)
            {
                b[i]=a[k];
                i= i+1;
            }
        }

        for(k=low; k<= high; k++)
            a[k] = b[k];
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

        sortMerge(a,0,n-1);

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