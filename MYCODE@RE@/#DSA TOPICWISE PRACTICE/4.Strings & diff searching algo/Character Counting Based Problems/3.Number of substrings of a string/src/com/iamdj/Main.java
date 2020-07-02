package com.iamdj;

/**
 * Total number of substrings of all lengths from 1 to n =
 *  n + (n-1) + (n-2) + (n-3) + … 2 + 1
 *      = n * (n + 1)/2
 *
 *      Time complexity: O(1)
 */
public class Main {

    static int countNonEmptySubString(String str) {

        int n = str.length();
        return n * (n + 1) / 2;
    }

    // Driver code
    public static void main(String args[]) {

        String s = "abcd";
        System.out.println("Possible subStrings:  "+countNonEmptySubString(s));
    }
}