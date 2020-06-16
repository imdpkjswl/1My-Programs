package com.company;
// Answer might be vary due to wave may be in any form.
/** Java implementation of naive method for sorting an array in wave form.
 * Time Complexity Written on function used.
 * Space Complexity: O(1)
 */

class Main
{
    // A utility method to swap two numbers.
    void swap(int[] arr, int ia, int ib)
    {
        int temp = arr[ia];
        arr[ia] = arr[ib];
        arr[ib] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    /** Time Complexity: O(nLog(n)) */
    /*
        void sortInWave(int arr[], int n)
        {
            // Sort the input array
            Arrays.sort(arr);

            // Swap adjacent elements
            for (int i=0; i<n-1; i += 2)
                swap(arr, i, i+1);
        }
    */

    /** Time Complexity: O(n) */
    void sortInWave(int[] arr, int n) {
        // Traverse all even elements
        for (int i = 0; i < n; i+=2) {

            // If current even element is smaller than previous
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);

            // If current even element is smaller than next
            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
    }


    // Driver method
    public static void main(String[] args)
    {
        Main ob = new Main();
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}