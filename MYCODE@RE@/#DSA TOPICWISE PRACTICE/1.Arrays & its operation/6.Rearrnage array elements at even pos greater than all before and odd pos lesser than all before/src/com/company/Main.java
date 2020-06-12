package com.company;

import java.util.Arrays;
import java.util.Scanner;


/** The basic idea is:
 * 1.First sort the given element in ascending order
 * 2.Take another array and start filling the elements from first array.
 * 3.But we need to know that n is even or odd,then only we can decide at odd pos, we have to fill max or min elements.
 * 4.If n is odd,then place min element at last index of second array and max element at second last index of second array...continue till 0 index.
 * 5.4.If n is even,then place max element at last index of second array and min element at second last index of second array...continue till 0 index.
 * 6.Now, print the second array.
 * Time complexity: O(nLogn)
 * Space complexity(Auxiliary): O(n)
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int[] temp = new int[20];

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) temp[i] = sc.nextInt();

        Arrays.sort(temp, 0, n);

        if(n%2 ==0){
            System.out.println("n is even");
            int flag =1;  // flag is used for flipping the execution each iteration
            int j=0;  // min pos
            int k = n-1; // max pos
            for(int i=n-1;i>=0;i--){
                if(flag ==1){
                    flag = 0;
                    arr[i] = temp[k--]; // placing max element at even position
                }
                else{
                    flag = 1;
                    arr[i] = temp[j++]; // placing min element at odd position
                }
            }
        }
        else {
            System.out.println("n is odd");
            int flag =1;
            int j=0;  // min pos
            int k = n-1; // max pos
            for(int i=n-1;i>=0;i--){
                if(flag ==1){
                    flag = 0;
                    arr[i] = temp[j++]; // placing min element at odd position
                }
                else{
                    flag = 1;
                    arr[i] = temp[k--]; // placing max element at even position
                }
            }
        }




        // Print the all elements
        System.out.println("The rearranged array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"  ");
        }

    }
}

/*
Output 1:
Enter the no. of elements:
7
Enter the elements:
1 2 3 4 5 6 7
n is odd
The rearranged array elements are:
4  5  3  6  2  7  1


Output 2:
Enter the no. of elements:
8
Enter the elements:
1 2 1 4 5 6 8 8
n is even
The rearranged array elements are:
4  5  2  6  1  8  1  8

 */