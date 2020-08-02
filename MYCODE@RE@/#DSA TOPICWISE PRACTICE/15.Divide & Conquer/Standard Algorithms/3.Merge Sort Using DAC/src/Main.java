import java.util.Scanner;


class Main {
    static  Scanner in = new Scanner(System.in);

    static void merge(int[] arr, int low, int mid, int high) {

        int l = mid -low + 1;
        int r = high - mid;

        int[] leftArray = new int [l];
        int[]  rightArray = new int [r];

        // Copy Left Half Array
        for (int i=0; i<l; ++i)
            leftArray[i] = arr[low + i];

        // Copy Right Half Array
        for (int j=0; j<r; ++j)
            rightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = low;

        while (i < l && j < r) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // copy the remaining elements of left array
        while (i<l) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // copy the remaining elements of right array
        while (j<r) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }



    static void SortMerge(int[] arr, int low, int high) {
        if (low<high) {

            int mid = (low+high)/2;
            SortMerge(arr, low, mid);
            SortMerge(arr , mid+1, high);
            merge(arr, low, mid, high);
        }
    }



    public static void main(String[] args)
    {
        int[] a;
        int n;

        System.out.println("Enter The Size Of The Array");
        n=in.nextInt();
        a=new int[n];
        for(int i =0;i<n;i++)
            a[i]=in.nextInt();

        SortMerge(a,0,n-1);

        System.out.println("The sorted array is displayed below");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
    }
}