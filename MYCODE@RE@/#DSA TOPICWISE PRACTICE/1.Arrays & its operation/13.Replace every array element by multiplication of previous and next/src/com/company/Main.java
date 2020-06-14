package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	    int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for (int i=0;i<n;i++){
            if(i == 0){ // For first item, there is no any left element available.
                ans[i] = arr[i]*arr[i+1];
            }else if(i == n-1){  // For last item,there is no any right element available.
                ans[i] = arr[i]*arr[i-1];
            }else{
                ans[i] = arr[i-1]*arr[i+1];
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");

    }
}
/*
Output:
Enter the value of n:
5
Enter the array elements:
2 3 4 5 6
6 8 15 24 30
Explanation:
2*3  2*4  3*5  4*6  5*6
 */
