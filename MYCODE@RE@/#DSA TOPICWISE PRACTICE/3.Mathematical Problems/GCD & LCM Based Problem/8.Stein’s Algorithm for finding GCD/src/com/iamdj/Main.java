package com.iamdj;

/**
 * Stein’s algorithm or binary GCD algorithm is an algorithm that computes the greatest common divisor
   of two non-negative integers. Stein’s algorithm replaces division with arithmetic shifts, comparisons,
   and subtraction.
 *Algorithm to find GCD using Stein’s algorithm gcd(a, b)
 Steps:
 * If both a and b are 0, gcd is zero gcd(0, 0) = 0.
 * gcd(a, 0) = a and gcd(0, b) = b because everything divides 0.
 * If a and b are both even, gcd(a, b) = 2*gcd(a/2, b/2) because 2 is a common divisor. Multiplication with 2 can be done with bitwise shift operator.
 * If a is even and b is odd, gcd(a, b) = gcd(a/2, b). Similarly, if a is odd and b is even, then
 * gcd(a, b) = gcd(a, b/2). It is because 2 is not a common divisor.
 * If both a and b are odd, then gcd(a, b) = gcd(|a-b|/2, b). Note that difference of two odd numbers is even
 * Repeat steps 3–5 until a = b, or until a = 0. In either case, the GCD is power(2, k) * b, where power(2, k) is 2 raise to the power of k and k is the number of common factors of 2 found in step 2.

 */


class Main {

    // Function to implement Stein's Algorithm
    static int gcd(int a, int b) {

        // GCD(0, b) == b; GCD(a, 0) == a,
        // GCD(0, 0) == 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Finding K, where K is the greatest
        // power of 2 that divides both a and b
        int k;
        for (k = 0; ((a | b) & 1) == 0; ++k) {

            a >>= 1;
            b >>= 1;
        }

        // Dividing a by 2 until a becomes odd
        while ((a & 1) == 0)
            a >>= 1;

        // From here on, 'a' is always odd.
        do {
            // If b is even, remove all factor of 2 in b
            while ((b & 1) == 0)
                b >>= 1;

            // Now a and b are both odd. Swap
            // if necessary so a <= b, then set
            // b = b - a (which is even)
            if (a > b) {

                // Swap u and v.
                int temp = a;
                a = b;
                b = temp;
            }

            b = (b - a);
        } while (b != 0);

        // restore common factors of 2
        return a << k;
    }

    // Driver code
    public static void main(String[] args) {

        int a = 34, b = 17;

        System.out.println("Gcd of given " + "numbers is " + gcd(a, b));
    }
}