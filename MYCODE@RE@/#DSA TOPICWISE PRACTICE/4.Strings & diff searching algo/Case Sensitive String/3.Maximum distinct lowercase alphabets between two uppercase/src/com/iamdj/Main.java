package com.iamdj;

import java.util.Arrays;

/**
 * Time complexity:
 * Worst Case: O(n^2) , if else part execute for filling table with zero.
 * Best Case: O(n) , else will not execute.
 */
public class Main {

    public static void main(String[] args) {

        String str = "zACaAbbaazzChhnhhG"; // given string
        char[] chr = str.toCharArray();   // convert into character array
        int n = str.length();

        int[] table = new int[127];  // it helps to count lower case letter without duplicates.
        Arrays.fill(table,0);  // fill to count lower count

        // Count the largest lower case alphabets
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(chr[i])) {  // consider only lower case
                    table[(int)chr[i]]++;   // ascii value index incremented by 1.
                    if(table[(int)chr[i]] == 1)  // execute only one time for each lower case.
                        count++;
            }else {
                max = Math.max(max,count);  // find maximum distinct lower case in between two upper case.
                Arrays.fill(table,0); // after, finding max.fill with zero for next lower case.
                count=0;
            }
        }

        // Print maximum distinct lowercase
        System.out.println("Maximum distinct lowercase:  "+ max);
    }
}
