package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        int[] diff = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int type1,type2 = 0;
        type1= arr[0];  // choose any type that present at index 0.
        // Then, search for second type that will present in array.But Types must be only two type.
        for(int i=1;i<n;i++){
            if(arr[i] != type1){
                type2 = arr[i];
                break;
            }
        }
        // check for whose is lesser. Lesser value come first in array.
        int temp;
        if(type1 > type2){
            temp = type1;
            type1 = type2; // swap
            type2 = temp;

        } // else no need to write it has already assign as lesser.


        int j=0;
        for(int i=0;i<n;i++) {
            if(arr[i] == type1){  // firstly insert th lesser type value.
                arr[j++] = type1;
            }
        }

        for(int i=j;i<n;i++){ // then, inserting second type value for remaining size..
            arr[i] = type2;
        }

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));

    }
}
