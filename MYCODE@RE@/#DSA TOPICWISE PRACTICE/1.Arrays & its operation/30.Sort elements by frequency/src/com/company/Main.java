package com.company;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Time complexity: O(n^2)
 * Auxiliary space: O(n)
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[n];
        int[] value = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int counter=0,clock=0; // counter is frequency of each value.AND clock keep tracking the arr index.
        int k=0;
        for(int i=0;i<n;){  // not used i++, clock used to keep track path.
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    freq[k] = ++counter;
                    clock++;
                }
            }
            value[k] = arr[i];  // assign unique values(not repeated)
            k++; // shos indexes of value and freq
            i = clock;  // contain index which is not repeated and have to visit.
            counter=0;
        }  // now, we know that frequency of element. Now, perform the sorting on ans & relatively on value array.

        // Bubble sort to sort freq array(sorting frequency of values).
        for(int j=1;j<k;j++){
            for(int i=0;i<k-j;i++){
                if(freq[i] > freq[i+1]){
                    int temp1,temp2;
                    temp1= freq[i];
                    freq[i] = freq[i+1];
                    freq[i+1] = temp1;

                    temp2 = value[i];
                    value[i] = value[i+1];
                    value[i+1] = temp2;
                }
            }
        }

        // Placing back the elements to arr with it's frequency.
        int i=0;
        int v=0;
        while(i<n){
            for(int j=0;j<freq[v];j++){
                arr[i++] = value[v];  // value[v] repeated freq[v] times.
            }
            v++;

        }

        System.out.println("The given array are sorted based on frequencies:");
        System.out.println(Arrays.toString(arr));
    }
}
