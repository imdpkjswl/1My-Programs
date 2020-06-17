package com.company;

import java.util.*;

/** Formula based trick program:
 * Required number = 2*(sum_of_array_without_duplicates) – (sum_of_array)
 * Time complexity: O(n) due to for loop and Iterator()
 * Space Complexity: O(K), k is the siz of hash table.
 */

class Main {

    // function which find number
    static int singleNumber(int[] arr, int n) {
        // HashSet used for storing unique elements
        HashSet<Integer> m = new HashSet<>();

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
              m.add(arr[i]); // not contain duplicates.
              sum2 += arr[i]; // sum2 contain, sum of elements with duplicates.
        }

        Iterator<Integer> i = m.iterator();
        while(i.hasNext()) {  // taking elements from hash table and storing.
            sum1 += i.next();
        }

        // applying the formula.
        return 2 * (sum1) - sum2;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();


        int result = singleNumber(arr, n);
        System.out.println("The single number which appear once is:  "+result);
    }
}