package com.iamdj;

import java.util.Scanner;

/**The ida is:
 * 1. Find the gcd of every sub array and check gcd is belonging to given array or not.
 * 2. Then, print gcd value if it exist in given array.
 * 3. and after checking any sub array whose gcd in belong to given array, print the individual array elements also.
 * Time complexity: O(n^2Log2(n))
 * Auxiliary Space complexity: O(1)
 */
public class Main {

    static int gcd(int a, int b) {
        if(a == 0)
            return b;
        return gcd(b%a,a);
    }

    static int linearSearch(int[] arr, int key) {

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key)
                return 1;  // found
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
          arr[i] = in.nextInt();

        int hcf = 1;
        boolean flag = true;
        boolean noArray = true;
        for(int i=0;i<n-1;i++) {
            for(int j=i+2;j<n;j++) {
                if(flag) {
                  hcf = gcd(arr[j-2] , arr[j-1]);
                  flag = false; // used to
                }

                hcf = gcd(hcf , arr[i]);
            }
            // check gcd of sub-array exist in given array or not.
            int res = linearSearch(arr, hcf); // pass array and key value for search.
            if(res == 1) {
                System.out.print(hcf + " ");
                noArray = false; // used to check for sub array can be build.(FIRST TIME EXECUTE TO CHECK SUB-ARRAY GCD EXIST IN GIVEN ARRAY OR NOT).
            }

            if(!noArray)
                System.out.print(arr[i]+" ");  // Individual element have own gcd.

            flag = true;   // flag to find gcd of sub array.
        }

        if(!noArray) // Print the last element have own gcd.coz it executed n-2 times only.
            System.out.print(arr[n-1]);
        else
            System.out.println("No array can be build");  // noArray==true means, not found gcd of any sub array belonging to array.

    }
}
