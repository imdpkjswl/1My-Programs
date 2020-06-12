package com.company;

import java.util.Arrays;
import java.util.Scanner;

/** Using Naive Method  but Same complexity
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int j=0;
        for(int i=n-1;i>=0;i--) {
            temp[j] = arr[i];
            j++;
        }

        // Print the all elements
        System.out.println("\nThe reversed array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(temp[i]+"  ");
    }
}
*/


/** Using Rotation Method
 * Time complexity: O(k*n)
 * if n==k, then O(n^2)
 * Space complexity: O(1)
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        int temp;

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();


        // This logic take me one hour
        for(int k=1;k<n;k++) {  // Iterating n-1 times
            temp = arr[n-1];    // store last array element
            for (int i = n - 1; i >= k; i--) {  // shifting right by one position till k+1
                arr[i] = arr[i - 1];
            }
            arr[k-1] = temp; // assign at k-1 position
        }

        // Print the all elements
        System.out.println("\nThe reversed array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
    }
}
