package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time Complexity: O(n)
 * Auxiliary space: O(1)
 */

/*
   --> NOT WORKING IN BELOW CASE:
Enter the no. of elements:
5
Enter the elements:
2 1 5 4 3
Enter the value of K:
2
The minimum swaps required is:0
 */

public class Main {

    public static int minSwap(int[] arr, int n, int k){
            int count=0;

            // Find count of elements which are lesser than or equals to k
            for(int i=0;i<n;i++)
                if(arr[i] <= k)
                    ++count;

            // Find unwanted elements in current window of size 'count'
            int bad=0;
            for(int i=0;i<count;i++){
                if(arr[i] > k)
                    ++bad;
            }

            // Initialize answer with bad value of current window
            int ans = bad;
            for(int i=0,j=count; j<n; i++, j++){

                // Decrement count of previous window
                if(arr[i] > k)
                    --bad;

                // Increment count of current window
                if(arr[i] > k)
                    ++bad;

                // Update ans if count of bad is less in current window
                ans = Math.min(ans,bad);

            }

            return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter the value of K:");
        k = sc.nextInt();



        // Print the all elements
        System.out.println("\nThe minimum swaps required is:"+minSwap(arr, n ,k));

    }
}

