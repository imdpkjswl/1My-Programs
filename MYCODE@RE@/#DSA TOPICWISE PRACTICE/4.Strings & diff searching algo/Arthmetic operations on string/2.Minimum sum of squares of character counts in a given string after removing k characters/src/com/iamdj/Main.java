package com.iamdj;

import java.util.Arrays;


/** My method:
 * Time complexity: O(n*k), where n is size of table.
 */
public class Main {

    public static void main(String[] args) {

        String str = "aaaabbccc";
        char[] chr = str.toCharArray();
        int n = chr.length;

        int k = 4;
        int tableSize = 129;
        int[] table = new int[tableSize]; // hash table
        Arrays.fill(table,0);  // initialize all index by 0.

        // store frequency of characters
        for(int i =0; i<n;i++) {
            table[(int)chr[i]]++;
        }

        int max = 0;
        int index = 0;
        for(int j=1;j<=k;j++) { // decrement k times
            for(int i=0;i<tableSize;i++) {
                if(table[i] > max) {  // find index of max frequency
                    index = i;     // store index
                    max = table[i];  // update max value
                }
            }
            table[index]--;  // decrement max frequency by one.
            max = 0;   // make zero for next iteration
        }


        // Calculating sum of square of frequencies.
        int sqrSum=0;
        for(int i=0;i<tableSize;i++)
            if(table[i] != 0)
                sqrSum += Math.pow(table[i],2);


        System.out.println(sqrSum);  // finally print result

    }
}

/*
Input :  str = abccc, K = 1
Output :  6
We remove c to get the value as 12 + 12 + 22

Input :  str = aaaabbccc, K = 4
Output : 9
1^2 + 2^2 + 2^2  = 9

 */