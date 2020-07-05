package com.iamdj;

import java.util.Arrays;

public class Main {

    public static int SIZE = 8;

    // Function to check if binary representation of two numbers are anagram
    static boolean bit_anagram_check(long a, long b) {
        // Find reverse binary representation of a and store it in binary_a[]
        int i = 0;
        long[] binary_a = new long[SIZE];
        Arrays.fill(binary_a, 0);
        while (a > 0) {

            binary_a[i] = a%2;
            a /= 2;
            i++;
        }

        // Find reverse binary representation of b and store it in binary_a[]
        int j = 0;
        long[] binary_b = new long[SIZE];
        Arrays.fill(binary_b, 0);
        while (b > 0) {

            binary_b[j] = b%2;
            b /= 2;
            j++;
        }

        // Sort two binary representations
        Arrays.sort(binary_a);
        Arrays.sort(binary_b);

        // Compare two sorted binary representations
        for (i = 0; i < SIZE; i++)
            if (binary_a[i] != binary_b[i])
                return false;

        return true;
    }

    // driver program
    public static void main (String[] args) {

        long a = 5, b = 3;

        System.out.println(bit_anagram_check(a, b));
    }
}
