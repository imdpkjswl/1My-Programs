package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            // If current element is smaller
            // than first then update both
            // first and second
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second)
                second = arr[i];

        }

        int j =0;
        for(int i=0;i<n;i++){
            if (arr[i] == first || arr[i] == second) {
                   continue;
            }

            arr[j++] = arr[i];
        }

        for(int i=0;i<j;i++)
            System.out.print(arr[i]+" ");

    }
}

/*
Output:
Enter the value of n:
6
Enter the elements:
7 -2 3 4 9 -1
-2 3 4 -1 
 */