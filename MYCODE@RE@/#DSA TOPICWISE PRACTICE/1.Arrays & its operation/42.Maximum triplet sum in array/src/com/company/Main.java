package com.company;


import java.util.Arrays;
import java.util.Scanner;

/** Method 1: Brute force approach
 * Time complexity: O(n^3)
 * Space Complexity: O(1)
 */
/*
class Main {

    static int maxTripletSum(int arr[], int n) {

        // Initialize sum with INT_MIN
        int sum = -1000000;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if (sum < arr[i] + arr[j] + arr[k])
                        sum = arr[i] + arr[j] + arr[k];
        return sum;
    }

    // Driven code
    public static void main(String args[])
    {
        int arr[] = { 1, 0, 8, 6, 4, 2 };
        int n = arr.length;
        System.out.println(maxTripletSum(arr, n));
    }
}
 */


/** Method 2: Sorting approach
 * Time complexity: O(nLog(n))
 * Space Complexity: O(1)
 */
/*
class Main {

    // This function assumes that there are
    // at least three elements in arr[].
    static int maxTripletSum(int arr[], int n) {
        // sort the given array
        Arrays.sort(arr);

        // After sorting the array.
        // Add last three element
        // of the given array
        return arr[n - 1] + arr[n - 2] + arr[n - 3];
    }

    // Driven code
    public static void main(String args[])
    {
        int arr[] = { 1, 0, 8, 6, 4, 2 };
        int n = arr.length;
        System.out.println(maxTripletSum(arr, n));
    }
}
 */

/** Method 3: Scan & compute three Maximum approach:
 * Time complexity: O(n)
 * Space Complexity: O(1)
 */
/*
class Main {

    // This function assumes that there are at least  three elements in arr[].
    static int maxTripletSum(int arr[], int n) {

        // Initialize Maximum, second maximum and third maximum element
        int first = -100000000, second = -100000000;
        int third = -100000000;

        for (int i = 0; i < n; i++) {

            // Update Maximum, second maximum
            // and third maximum element
            if (arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }

            // Update second maximum and third maximum element
            else if (arr[i] > second)
            {
                third = second;
                second = arr[i];
            }

            // Update third maximum element
            else if (arr[i] > third)
                third = arr[i];
        }

        return (first + second + third);
    }


    public static void main(String args[]) {

        int arr[] = { 1, 0, 8, 6, 4, 2 };
        int n = arr.length;
        System.out.println(maxTripletSum(arr, n));
    }
}
*/


/** My Method for any numlets:
 * Time complexity: O(n*numlets)
 * Space complexity: O(1)
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        int triplets = 4;
        int i,j,index =- 1;
        for(j=1;j<=triplets;j++){
            for(i=0;i<n;i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i; // store index of max value.
                }
            }
            arr[index] = 0;  // assign zero to max value.
            maxSum += max;  // add max value.
            max = Integer.MIN_VALUE; // assign max to min value for further iterations.
        }

        System.out.println("Maximum triplet sum is:  "+maxSum);
    }
}