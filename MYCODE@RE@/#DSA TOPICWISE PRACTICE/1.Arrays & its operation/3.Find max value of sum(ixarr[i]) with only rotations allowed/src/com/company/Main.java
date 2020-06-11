package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int[] index1 = new int[20];  // for maxSum
        int[] index2 = new int[20];  // for sum

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();


        int maxSum =0;
        for(int i=0;i<n;i++) {
            maxSum += (i * arr[i]);
            index1[i] = arr[i];  // storing index for showing maxSum with array elements
        }

        for(int i=1;i<n;i++){ // Iterating d times
            int sum =0;
            int temp = arr[0];  // selecting first index item each time
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];  // // Shifting array items left by one position
            }
            arr[n-1]  = temp;  // assigning first index item to the last of array

            for(int t=0;t<n;t++){
                sum += (t*arr[t]);
                index2[t] = arr[t];  // storing indexes, if it may maxSum.
            }
            if(sum >maxSum){
                maxSum = sum;
                System.arraycopy(index2,0,index1,0,n);  // copy array index2 into array index1
            }

        }


        // Print the all elements
        System.out.println("The rotated elements are:");
        for(int i=0;i<n;i++)
            System.out.print(index1[i]+"  ");


        System.out.println("\nwe got the maximum sum is:  "+maxSum);



    }
}

