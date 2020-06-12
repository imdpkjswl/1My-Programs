package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** Using Naive Method  but Same complexity
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int[] temp = new int[20];

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        Arrays.fill(temp,-1);
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            int t = arr[i];
            if(t != -1)
                temp[t] = t;
        }


        // Print the all elements
        System.out.println("\nThe rearranged array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(temp[i]+"  ");
    }
}
*/

/** Using HashSet Approach
 * Time complexity: O(n)
 * Space complexity: O(n) for HashSet
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();


        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);   // Duplicate elements will be ignored.
        }


        for(int i=0;i<n;i++){
            if(s.contains(i))   // checking, is i value is avail in HashSet or not
                arr[i] = i;
            else
                arr[i] = -1;  // if set does not contain the i value, put -1
        }

        // Print the all elements
        System.out.println("\nThe rearranged array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");




    }
}