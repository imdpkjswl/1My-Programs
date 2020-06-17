package com.company;

import java.util.*;

// Solving using table

/**
 * Time complexity: O(k)
 * Space complexity: O(k) , where k is the size of table.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1 = in.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n1;i++) a1[i] = in.nextInt();

        System.out.println("Enter the size of second array:");
        int n2 = in.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<n2;i++) a2[i] = in.nextInt();

        int[] table = new int[101];
        Arrays.fill(table, Integer.MAX_VALUE);  // table initialized with max value of integer.

        int[] union = new int[n1+n2];
        int[] interSection = new int[n1+n2];

        for(int i=0;i<n1;i++){
            table[a1[i]] = a1[i];
        }

        int is=0;
        for(int i=0;i<n2;i++){
            if(a2[i] == table[a2[i]]){
                interSection[is++] = a2[i];
            }
            table[a2[i]] = a2[i];
        }

        int u=0;
        for(int i=0;i<=100;i++){
            if(table[i] != Integer.MAX_VALUE){
                union[u++] = table[i];
            }
        }


        System.out.println("Union of both arrays:");
       for(int i=0;i<u;i++)
           System.out.print(union[i]+" ");
        System.out.println();

        if(is ==0 ){
            System.out.println("No any common values avail in both arrays.Hence any intersection occur.");
            System.exit(0);
        }
        System.out.println("Intersection of both arrays:");
        for(int i=0;i<is;i++){
            System.out.print(interSection[i]+" ");
        }

    }
}
