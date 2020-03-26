/*
    Given an array of integers, write a function that returns true if there is a triplet (a, b, c)
    that satisfies a2 + b2 = c2.

Example:
Input: arr[] = {3, 1, 4, 6, 5}
Output: (3, 4, 5).
There is a Pythagorean triplet: 1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i,j,k,n;
        int count=0;
        int []arr = new int[50];

        System.out.println("Enter the size of array:");
        n=in.nextInt();

        for(i=0;i<n;i++)
            arr[i] = in.nextInt();

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(((arr[i]*arr[i]) + (arr[j]*arr[j])) == (arr[k]*arr[k])) {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                        count++;
                    }
                }
            }
        }

        if(count!=0)
            System.out.println("Total Pythagorean triplets:  "+count);
        else
            System.out.println("There is no Pythagorean triplet.");
    }
}
