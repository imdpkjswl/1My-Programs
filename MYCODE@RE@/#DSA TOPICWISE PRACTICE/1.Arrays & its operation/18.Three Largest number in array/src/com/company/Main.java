package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int first, second, third;
        first = second = third = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.print("The three largest number is:  "+first+", "+second+", "+third);
    }
}
