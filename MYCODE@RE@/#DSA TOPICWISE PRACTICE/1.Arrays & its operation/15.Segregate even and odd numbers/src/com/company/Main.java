package com.company;
/*
Aim:    Given an array of integers, segregate even and odd numbers in the array.
        All the even numbers should be present first, and then the odd numbers
 */
import java.util.Arrays;
import java.util.Scanner;

/** Naive Method
 * Time Complexity: O(n^2)
 * Auxiliary Space: O(1)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){

            if(arr[i] % 2 != 0){  // Firstly search for odd number
                for(int j=i+1;j<n;j++){
                    if(arr[j] % 2 == 0){ // Secondly search for even number
                        int temp;    // Then, Swap odd by even.
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
*/

/** Two Pointer Algorithm: Prerequisite of TPA, Array may be sorted. BUT HERE NOT REQUIRED.
 * Time Complexity: O(n) : due to while loop.
 * Auxiliary Space: O(1)
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();



        int i =0;
        int j = n-1;
        // Apply loop from 0  to n-1
        while(i<j){
            if(arr[i] % 2 != 0){  // check for odd number occurrence.
                if(arr[j] % 2 == 0){ // check for even number occurrence.
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // If Swapped,then Increment i by 1 and Decrement j by 1.
                    ++i;
                    --j;
                }
                else
                    --j;  // If Last item is odd, then decrement j by 1.
            }else
                ++i;  // If first item is even, then increment i by 1.
        }

        for(int k=0;k<n;k++)
        System.out.print(arr[k]+" ");

    }
}