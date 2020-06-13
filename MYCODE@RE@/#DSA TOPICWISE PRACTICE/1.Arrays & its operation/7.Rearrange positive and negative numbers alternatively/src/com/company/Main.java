package com.company;

import java.util.Scanner;


/**
 * Basic idea is:
 * 1.Take input from user into original array.
 * 2.then, place the positive and negative numbers into two separate arrays.
 * 3.At last, place the elements into original array in negative and positive fashion.
 *
 * Time Complexity: O(n)
 * Auxiliary space: O(n)
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp1 = new int[20];  // contain +ve elements
        int[] temp2 = new int[20];  // contain -ve elements
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // Separating +ve and -ve number into two different arrays.
        int t1=0;
        int t2=0;
        for(int i=0;i<n;i++) {
            if(arr[i] >= 0) {
                temp1[t1++] = arr[i];
            }else
                temp2[t2++] = arr[i];
        }



        // Now, dropping out the elements from both arrays in -Ve->+ve fashion into original array.
        int a=0, b=0;
        for(int i=0;i<n;i++) {
        // Given in question,Every positive number is followed by negative number.
            if(b<t2)
                arr[i++] = temp2[b++];

            if(a<t1)
                arr[i] = temp1[a++];
        }


        // Print the all elements
        System.out.println("\nAlternatively rearranged array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
    }
}