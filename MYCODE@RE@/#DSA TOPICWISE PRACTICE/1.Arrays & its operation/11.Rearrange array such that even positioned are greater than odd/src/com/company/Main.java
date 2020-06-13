package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time complexity: O(n)
 * Space complexity: O(n)
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


        Arrays.sort(arr);
        int[] ans = new int[n];
        int p=0, q=n-1;
        for(int i=0;i<n;i++) {

            // Assign even indexes with maximum elements
            if((i+1) % 2 == 0)
                ans[i] = arr[q--];
            else
                // Assign odd indexes with minimum elements
                ans[i] = arr[p++];

        }


        // Print the all elements
        System.out.println("\nThe rearranged array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+"  ");
    }
}
