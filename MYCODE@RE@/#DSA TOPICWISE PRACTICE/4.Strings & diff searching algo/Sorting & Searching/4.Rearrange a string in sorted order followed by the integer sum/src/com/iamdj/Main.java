package com.iamdj;

import java.util.Arrays;


/**
 * Time complexity: O(nLog(n)), due to sorting algorithm
 * Auxiliary Space: O(n)
 */
public class Main {

    public static void main(String[] args) {

        String str = "ACCA10D2EWB30";
        char[] chr = str.toCharArray();

        char[] temp = new char[chr.length];

        int k = 0;
        int sum = 0;
        for (int i = 0; i < chr.length; i++) {
            if (!Character.isDigit(chr[i]))
                temp[k++] = chr[i];
            else {
                sum = sum + Integer.parseInt(String.valueOf(chr[i]));
            }
        }
        Arrays.sort(temp);

        System.out.print(new String(temp));
        System.out.print(sum);
    }
}