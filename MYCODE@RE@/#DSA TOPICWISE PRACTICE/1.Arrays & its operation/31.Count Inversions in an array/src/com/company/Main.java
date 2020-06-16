package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Note: Inversion means(As i observed), minimum no. of linear swap required to sort the array.
/** Method 1
 * Inversion Count for an array indicates – how far (or close) the array is from being sorted.
   If array is already sorted then inversion count is 0. If array is sorted in reverse order
   that inversion count is the maximum.
 * Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

 * Time complexity: O(n)
 * Auxiliary space: O(1)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int min = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    min++;
                }
            }
        }

        System.out.println("Number of inversions are: " + min);

    }
}
 */


/**
 * Time complexity: O(nLog(n))
 * Space complexity: O(n), Temporary array
 */
// Java implementation of the merge sort approach
public class Main {

    // Function to count the number of inversions during the merge process
    private static int mergeAndCount(int[] arr, int l, int m, int r) {

        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }

        // Fill from the rest of the left subarray
        while (i < left.length)
            arr[k++] = left[i++];

        // Fill from the rest of the right subarray
        while (j < right.length)
            arr[k++] = right[j++];

        return swaps;
    }

    // Merge sort function
    private static int mergeSortAndCount(int[] arr, int l, int r) {

        // Keeps track of the inversion count at a particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            count += mergeSortAndCount(arr, l, m);

            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    // Driver code
    public static void main(String[] args) {

        int[] arr = { 1, 20, 6, 4, 5 };

        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
    }
}