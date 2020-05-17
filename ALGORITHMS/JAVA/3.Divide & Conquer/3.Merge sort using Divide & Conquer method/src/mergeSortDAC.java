import java.util.Scanner;

class mergeSortDAC {
    static  Scanner in = new Scanner(System.in);

    static void merge(int arr[], int low, int mid, int high) {

        int left = mid - low + 1; // size of left array
        int right = high - mid; // size of right array

        int LeftArray[] = new int [left];
        int  RightArray[] = new int [right];

        // copying data from array into sub array
        for (int i=0; i<left; ++i)
            LeftArray[i] = arr[low + i];

        for (int j=0; j<right; ++j)
            RightArray[j] = arr[mid + 1+ j];

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarry array
        int k = low;

        while (i<left && j<right)
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

        /* Copy remaining elements of LeftArray[] if any */
        while (i<left)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of RightArray[] if any */
        while (j<right)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void SortMerge(int arr[], int low, int high) {
        if (low<high) {
            int mid = (low+high)/2;
            // Sort first and second halves
            SortMerge(arr, low, mid);
            SortMerge(arr , mid+1, high);
            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int a[], n;

        System.out.println("Enter The Size Of The Array");
        n=in.nextInt();
        a=new int[n];
        for(int i =0;i<n;i++)
            a[i]=in.nextInt();

        SortMerge(a,0,n-1);

        System.out.println("The sorted array is displayed below");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}