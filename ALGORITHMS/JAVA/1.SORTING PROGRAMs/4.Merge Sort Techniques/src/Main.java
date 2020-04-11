import java.util.Scanner;


class Main
{
    static  Scanner in = new Scanner(System.in);

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

    public static void main(String[] args)
    {
        int a[], n;

        System.out.println("Enter The Size Of The Array");
        n=in.nextInt();
        a=new int[n];
        for(int i =0;i<n;i++)
            a[i]=in.nextInt();

        SortMerge(a,0,n-1);

        System.out.println("The Sorted Array Is Displayed Below");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}