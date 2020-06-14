package com.company;

import java.util.Arrays;
import java.util.Scanner;

// We can solve this problem using sorting that will take O(nLog(n)) time.

/**
 * Time Complexity: O(max), due to max traversing in table.
 * Auxiliary Space: O(max), Where max is the largest value present in the given array.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the element:");
        int[] arr = new int[n];

        int max =-999;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i])  // find max value to create table of size max.
                max = arr[i];
        }

        int[] table = new int[max+1];
        Arrays.fill(table,-999);  // fill table with minimum value.


        for(int i=0;i<n;i++){
            table[arr[i]] = arr[i]; // assign value to the valueTH index in table
        }

        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        int count =0;

        for(int i=0;i<=max;i++){
            if(table[i] != -999){
                count++;   // counting non -999 value occurrence in table.
                if(count == k){
                    System.out.println("The "+k+"th smallest number is:  "+table[i]);
                    System.exit(0);
                }
            }
        }

        System.out.println("Please enter valid input of K.");



    }
}
