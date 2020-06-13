package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time complexity: O(nLogn) due to sorting.
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


        // Print the all elements that is every even pos is greater or equal than every odd pos.
        System.out.println("\nThe rearranged array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+"  ");
    }
}

/*
Output:
Enter the no. of elements:
7
Enter the elements:
7 2 1 5 3 4 6

The rearranged array elements are:
1  7  2  6  3  5  4
 */