package com.company;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Time Complexity: O(n)
 * Auxiliary space: O(n)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[20];  // contain non-zeroes
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // Copying the all elements from arr excluding zeroes.
        int t1=0;
       for(int i=0;i<n;i++){
           if(arr[i] != 0){
               temp[t1++] = arr[i];
           }
       }

       Arrays.fill(arr,0);

        System.arraycopy(temp, 0, arr, 0, t1); // copy elements from temp to arr.


        // Print the all elements
        System.out.println("\nAlternatively rearranged array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
    }
}
*/







/**The Basic idea is:
 * 1.First Copying the all elements from arr to its previous indexes excluding zeroes.
 * 2.After copying t1 length, fill arr with zeroes to n-1 length.
 * Time Complexity: O(n)
 * Auxiliary space: O(1)
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Copying the all elements from arr excluding zeroes.
        int t1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[t1++] = arr[i];   // retaining only non-zeroes elements.
            }
        }

        // After t1 length, fill arr with zeroes to n-1 length
        while(t1 <n){
            arr[t1++] = 0;
        }


        // Print the all elements
        System.out.println("\nAlternatively rearranged array elements are:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
    }
}