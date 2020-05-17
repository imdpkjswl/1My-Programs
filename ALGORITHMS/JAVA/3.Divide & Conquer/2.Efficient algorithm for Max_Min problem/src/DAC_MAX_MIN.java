// Code to demonstrate Divide and Conquer Algorithm
// function to find the maximum no. in a given array.

public class DAC_MAX_MIN {

    // Defining the variables:
    static int min= Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    // Divide & Conquer solution to find minimum and maximum number in an array
    static void findMinAndMax(int arr[], int low, int high)
    {
        // if array contains only one element

        if (low == high)            // common comparison
        {
            if (max < arr[low])     // comparison 1
                max = arr[low];

            if (min > arr[high])    // comparison 2
                min = arr[high];

            return;
        }

        // if array contains only two elements

        if (high - low == 1)            // common comparison
        {
            if (arr[low] < arr[high])    // comparison 1
            {
                if (min > arr[low])     // comparison 2
                    min = arr[low];

                if (max < arr[high])    // comparison 3
                    max = arr[high];
            }
            else
            {
                if (min > arr[high])    // comparison 2
                    min = arr[high];

                if (max < arr[low])     // comparison 3
                    max = arr[low];
            }
            return;
        }

        // find mid element
        int mid = (low + high) / 2;

        // recur for left sub-array
        findMinAndMax(arr, low, mid);

        // recur for right sub-array
        findMinAndMax(arr, mid + 1, high);
    }


    // Driver Code
    public static void main(String [] args) {
        // Initializing the array:
        int[] arr = {70, 250, 50, 80, 140, 12, 14, 34, 8};

        // recursion - Max_MIN function called:
        findMinAndMax(arr, 0, arr.length-1);

        System.out.printf("The minimum number in a given array is:  %d\n", min);
        System.out.printf("The maximum number in a given array is:  %d", max);
    }

}