package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that
 * prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it without
 * division operator.
 * Time Complexity: O(n^2). Try to solve in O(n)
 * Space Complexity: O(n)
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextByte();
        int[] arr = new int[n];
        int[] ans = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();


        int prod=1 , k=0;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            for(int j=0;j<n;j++){
                if(temp != arr[j])
                    prod = prod*arr[j];
            }
            ans[k++] = prod;
            prod = 1;
        }

        System.out.println("The solved puzzle is:");
        for(int x: ans)
            System.out.print(x+"  ");
    }
}

/*
Output:
Enter the size of array:
5
Enter array elements:
10 3 5 6 2
The solved puzzle is:
180  600  360  300  900
 */