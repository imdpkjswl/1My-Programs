package com.company;

import java.util.Scanner;

/**
 *  Time Complexity: O(Log(n)), Due to Binary Search.
 *  Space complexity: O(1)
 */
public class Main {

    static int binarySearchTechnique(int[] arr, int n, int key){
        int low=0;
        int high = n-1;
        int mid;


        while(low <= high){
            mid = (low+high)/2;

            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid])
                low = mid+1;
            else if(key < arr[mid]) {
                high = mid -1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        System.out.println("Enter key to be searched:");
        int key = in.nextByte();
        int result = binarySearchTechnique(arr, n, key);

        if(result == -1){
            System.out.println("Key not found.");
            System.exit(0);
        }

        System.out.println("Key found at : "+(result+1)+" position.");

    }
}
