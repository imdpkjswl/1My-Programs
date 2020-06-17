package com.company;

import java.util.*;

/** THIS PROGRAM CONTAIN BUG AT SOME CASES:
 * Time complexity: O(n^2)
 * Space Complexity: O(1)
 */
/*
class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        int sum1=0;
        int sum2=0;

        // Search from left side
        for(int i=0;i<=n-2;i++){
            sum1 += arr[i];
            for(int j=i+1;j<=n-1;j++){
                sum2 += arr[j];
            }
            if(sum1 == sum2){
                System.out.println("The equilibrium index(LeftToRight) is:  "+i);
            }
            sum2 = 0;
        }
        // Note: i is:  { 0__i } == { i+1__(n-1) } wil  be equilibrium.
        //              LEFT SIDE     RIGHT SIDE
    }
}
 */





// Java program to find equilibrium index of an array
/** BugLess program:  Brute force approach-
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
/*
class Main {

    static int equilibriumIndex(int arr[], int n) {
        int i, j;
        int leftSum, rightSum;

        // Check for indexes one by one until an equilibrium index is found
        for (i = 0; i < n; ++i) {

            // get left sum
            leftSum = 0;
            for (j = 0; j < i; j++)
                leftSum += arr[j];

            // get right sum
            rightSum = 0;
            for (j = i + 1; j < n; j++)
                rightSum += arr[j];

            // if leftSum and rightSum are same,then we are done
            if (leftSum == rightSum)
                return i;  // equilibrium index
        }

        // return -1 if no equilibrium index is found
        return -1;
    }

    // Driver code
    public static void main(String[] args) {

        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; // here, Sum of Left side of 2 = Sum of Right side of 2.Answer will be 3.
        int arr_size = arr.length;

        System.out.println("The equilibrium index is:  "+equilibriumIndex(arr, arr_size));

    }
}

*/


// Java program to find equilibrium index of an array

/**
 * Tricky and Efficient)
 * The idea is to get the total sum of the array first. Then Iterate through the array and keep updating the left
 * sum which is initialized as zero. In the loop, we can get the right sum by subtracting the elements one by one.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Main {

    static int equilibriumIndex(int[] arr, int n) {

        int sum = 0; // initialize sum of whole array
        int leftSum = 0; // initialize leftSum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];

        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftSum == sum)
                return i;

            leftSum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }

    // Driver code
    public static void main(String[] args) {

        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;

        System.out.println("The equilibrium index is " +equilibriumIndex(arr, arr_size));
    }
}