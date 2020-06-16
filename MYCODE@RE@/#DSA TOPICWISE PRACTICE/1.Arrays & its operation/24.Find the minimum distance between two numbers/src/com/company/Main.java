package com.company;

import java.util.Scanner;


/** My Naive Method:
 * Time Complexity: O(n^2)
 * Space Complexity: O(k), where k is the possible different distances from first num and second num.
 */
/*
public class Main {

    static int minDistance(int[] arr, int n, int first,int second){

        // Flags are used to find whether both number are present in arr or not.
        boolean flag1 = false;
        boolean flag2 = false;
        int[] temp1 = new int[n];  // Used to store index of occurrence of first number.
        int[] temp2 = new int[n];  // Used to store index of occurrence of second number.
        int[] ans = new int[100];  // combinations might be more than n.

        int t1 = 0;  // size of temp1 array.
        int t2 = 0; // size of temp2 array.

        //storing indexes of occurrence of first number in arr.
        for(int i=0;i<n;i++) {
            if(arr[i] == first) {
                temp1[t1++] = i;
                flag1 = true;
            }

            //storing indexes of occurrence of second number in arr.
            if(arr[i] == second) {
                temp2[t2++] = i;
                flag2 = true;
            }
        }


        // Check is first number is present or not
        if(!flag1){
            System.out.println(first+" element not found in array.");
            return 0;
        }
        // Check is second number is present or not
        if(!flag2){
            System.out.println(second+" element not found in array.");
            return 0;
        }

        // Now, subtracting temp1 from temp2 and soring its value into another array ans.
        int k = 0;
        for(int i=0;i<t1;i++) {
            for(int j=0;j<t2;j++) {
                ans[k++] = temp2[j] - temp1[i];
            }
        }


        // Bubble sort used to arrange ans in increasing order.
        for(int i=1;i<k;i++){
            for(int j=0;j<k-i;j++){
              if(ans[j] < ans[j+1]) {
                  int temp = ans[j];
                  ans[j] = ans[j + 1];
                  ans[j + 1] = temp;
              }
            }
        }

        // Print sorted ans
        for(int i=0;i<k;i++)
            System.out.print(ans[i]+" ");
        System.out.println();


        int Positive=0;  // contain smallest positive number present in ans array.
        int Negative=0;  // contain largest negative number present in ans array.
        int flag =0;  // Flag used to stop if statement after occurring first biggest negative number.

        for(int i=0;i<k;i++){
            if(ans[i] > 0 ) {
                Positive = ans[i];
            }

            if(ans[i]< 0 && flag ==0){
                Negative = ans[i];
                flag = 1;
            }
        }
        System.out.println("Positive:"+Positive);
        System.out.println("Negative:"+Negative);

        // Compare the both positive and negative number and return the smallest distance.
        if(Positive != 0 && Negative != 0) {  // distance cannot be zero, so check is both contain the value or not.
            if (Positive < Math.abs(Negative)) {
                return Positive;
            } else if (Positive > Math.abs(Negative)) {
                return Math.abs(Negative);
            } else
                return Positive;
        }
        // check if anyone have not contain any value & return the absolute value if negative is min distance.
        else if(Positive != 0 && Negative == 0){
            return Positive;
        } else if(Positive == 0 && Negative != 0){
            return Negative;
        }


        return 0;  // it means no valid distance found.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println("Enter the first element:");
        int first= sc.nextInt();
        System.out.println("Enter the second element:");
        int second = sc.nextInt();

        int result = minDistance(arr,n,first,second);


        System.out.println("The minimum distance between "+first+" and "+second+" is:  "+result);

    }
}
*/

/** GFG Naive Method:
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Main
{
    static int minDist(int arr[], int n, int x, int y) {

        //previous index and min distance
        int p = -1, min_dist = Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] ==x || arr[i] == y)
            {
                //we will check if p is not equal to -1 and
                //If the element at current index matches with
                //the element at index p , If yes then update
                //the minimum distance if needed
                if(p != -1 && arr[i] != arr[p])
                    min_dist = Math.min(min_dist, i-p);

                //update the previous index
                p=i;
            }
        }
        //If distance is equal to int max
        if(min_dist==Integer.MAX_VALUE)
            return -1;

        return min_dist;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {

        //int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int arr[] = {1, 2, 3, 2, 4, 3};
        int x = 2;
        int y = 3;
        int n = arr.length;
        //int x = 3;
        //int y = 6;

        System.out.println("Minimum distance between " + x + " and " + y + " is " + minDist(arr, n, x, y));
    }
}