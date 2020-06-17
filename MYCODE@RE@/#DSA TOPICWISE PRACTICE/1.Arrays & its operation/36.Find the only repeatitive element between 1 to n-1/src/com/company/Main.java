package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

/**  Naive Method:
 *  Time Complexity: O(n^2), Due to Nested loop.
 *  Space complexity: O(k), k is size of temporary array.
 */
/*
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        System.out.println("Enter element:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        int k=0;
        int flag =0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                if(arr[i] == arr[j] && arr[j] != Integer.MAX_VALUE){  // Compare who still have'nt visited.
                    temp[k] = arr[i];
                    arr[j] = Integer.MAX_VALUE;   // Assign max value to all duplicate elements.
                    flag = 1;  // used for incrementing value of k.It help to assign value into temp only once.
                }
            }
            if(flag == 1){
               flag =0; k++;
            }

        }

        if(k==0){
            System.out.println("No repetitive element found.Hence all All are distinct element in array.");
            System.out.println(Arrays.toString(arr));
            System.exit(0);
        }

        for(int i=0;i<k;i++)
            System.out.print(temp[i]+" ");
    }
}
*/


/**  My Method: Sort and check adjacent elements are same or not and also check for already visited or not.
 *  Time Complexity: O(nLog(n)) , due to sorting.
 *  Space complexity: O(k), size of temp array.
 */
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        System.out.println("Enter element:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        Arrays.sort(arr);
        Arrays.fill(temp,Integer.MAX_VALUE);
        System.out.println(Arrays.toString(arr));


        int k=1;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1] && temp[k-1] != arr[i]){ // Compare current and previous element and check for already visited or not.
                temp[k++] = arr[i-1];
            }
        }



        int p=0;
        // Now,eliminating the element which is equal max integer.
        for(int i=1;i<k;i++){
            if(temp[i] != Integer.MAX_VALUE){
                temp[p++] = temp[i];
            }
        }

        // Print only repetitive elements.
        for(int i=0;i<p;i++){
            System.out.print(temp[i]+" ");
        }




    }
}
