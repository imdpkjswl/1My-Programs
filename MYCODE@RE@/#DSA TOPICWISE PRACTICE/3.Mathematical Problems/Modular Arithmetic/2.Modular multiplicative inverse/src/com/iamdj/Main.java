package com.iamdj;

/**
 *  A naive method to find modular multiplicative inverse of 'a' under modulo 'm'.
 *  For every number x, check if (a*x)%m is 1.
 *  Time complexity:  O(m)
 */

/*
public class Main {

        static int modInverse(int a, int m) {

            a = a % m;  // used to reduce a value by m.
            for (int x = 1; x < m; x++) // check one by one by putting x values.
                if ((a * x) % m == 1)
                    return x;
            return 1;
        }

        // Driver Program
        public static void main(String args[]){

            int a = 3, m = 11;
            System.out.println(modInverse(a, m));
        }

}
*/
/**
 * modular inverse using extended Euclid algorithm.
 * Time complexity: O(Log(m))
 */


class Main {

    // Returns modulo inverse of a with respect to m using extended Euclid
    // Algorithm Assumption: a and m are coprimes, i.e., gcd(a, m) = 1
    static int modInverse(int a, int m) {

        int m0 = m;
        int y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1)
        {
            // q is quotient
            int q = a / m;

            int t = m;

            // m is remainder now, process
            // same as Euclid's algo
            m = a % m;
            a = t;
            t = y;

            // Update x and y
            y = x - q * y;
            x = t;
        }

        // Make x positive
        if (x < 0)
            x += m0;

        return x;
    }

    // Driver program to test above function
    public static void main(String args[]) {

        int a = 3, m = 11;
        System.out.println("Modular multiplicative inverse is:  " + modInverse(a, m));
    }
}
