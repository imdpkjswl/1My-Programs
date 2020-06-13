package com.company;

import java.util.Arrays;
import java.util.Scanner;

/** THE IDEA IS:
 *1.FIRST LINEARLY SEARCH FOR THE EXISTENCE OF KEY ELEMENT AND STORE THE INDEX OF KEY ELEMENT.
 * 2.AS WE CAN SEE THAT FROM THE GIVEN SAMPLE OUTPUT, ELEMENTS BEFORE KEY, IS LESSER THAN KEY ELEMENT.
 * 3.first apply loop 0 to n-1, and swap if Arr[Key_index] < Arr[0 to n-1], and update the key index value.
 * 4.After swapping,it clearly visible that all left side elements are lesser than key.
 * 5.Then,search right side of key, to check is any elements is greater than key.If found then shift
 *   elements from key_index to index of founded element.before shifting store founded index value in temporary variable.
 * 6.After shifting assign temporary variable data into shifted key_index position.So,key_index will be key_index = key_index+1(Due to shifting).
 * 7.At last, update the key_index position by key_index = key_index+1.
 * Time Complexity: O(n^2)
 * Auxiliary space: O(1)
 */

// Note: This program is not so efficient in some cases like: input: 2 7 9 5 4 7 3 , key = 5 it takes 3 swap But Really needs 2 swap.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter the value of K:");
        k = sc.nextInt();

       int count=0, index = 0;
       boolean flag =false;
       // Linear search for k is present in array or not.
        for(int i=0;i<n;i++){
            if(k == arr[i]){
                    flag =true;
                    index = i;
            }
        }
        if(!flag){
            System.out.println(k+" is not present in given array ->"+ Arrays.toString(arr));
            System.exit(0);
        }


        for(int i=0;i<n;i++){
            if(arr[index] < arr[i]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                count++;
                index = i;
                break;
            }
        }
        System.out.println(Arrays.toString(arr)); // displaying each phases of swapping


        for(int i = index ;i < n ; i++){

            if(arr[index] > arr[i]){
                int t = arr[i];

                for(int j=i;j>index;j--){
                    arr[j] = arr[j-1];
                }
                arr[index] = t; count++;
                index = index+1;
                System.out.println(Arrays.toString(arr));  // displaying each phases of swapping
            }
        }



        // Print the all elements
        System.out.println("\nThe minimum swaps required is:"+count);
        System.out.println("The resultant array is:  "+Arrays.toString(arr));
    }
}

/*
Output:
Enter the elements:
2 7 9 5 8 7 4
Enter the value of K:
5

The minimum swaps required is:2
The resultant array is:  [2, 4, 5, 9, 7, 8, 7]

 */