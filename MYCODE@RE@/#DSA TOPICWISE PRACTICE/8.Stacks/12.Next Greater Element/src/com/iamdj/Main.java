package com.iamdj;

/**
  Given an array, print the Next Greater Element (NGE) for every element. The Next greater
  Element for an element x is the first greater element on the right side of x in array.
  Elements for which no greater element exist, consider next greater element as -1.
 *Time Complexity: O(n^2)
 * Space complexity: O(n)
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {13, 7, 6, 12};
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] < arr[j]){  // First greater number
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

    }
}
