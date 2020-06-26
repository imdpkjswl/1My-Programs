package com.iamdj;



/** A recursive function to find nth catalan number
 * Catalan numbers satisfy the following recursive formula:
 * C0 = 1, Cn+1 = [Sigma i=0 to n] C(i)*C(n-i), for n >= 0.
 */
/*
class Main {

    static int catalan(int n) {
        int res = 0;
        // Base case
        if (n <= 1)
            return 1;

        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }

        return res;
    }

    public static void main(String[] args) {

        // Print first 10 catalan number
        for (int i = 0; i < 10; i++) {
            System.out.print(catalan(i) + " ");
        }
    }
}
*/

/** Solving Using Dynamic Programming Approach:
 * Time complexity: O(n^2)
 * Space complexity: O(n)
  */
/*
class Main {

    // A dynamic programming based function to find nth Catalan number
    static int catalanDP(int n) {
        // Table to store results of subproblems
        int[] catalan = new int[n + 2];

        // Initialize first two values in table
        catalan[0] = 1;
        catalan[1] = 1;

        // Fill entries in catalan[] using recursive formula
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }

        // Return last entry
        return catalan[n];
    }

    // Driver code
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(catalanDP(i) + " ");
        }

    }
}
*/

/** Solving Using Binomial Coefficient:-
 * formula to find nth catalan number:
 * C(n) = (1/n+1)(2n n)
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Main {
    // Returns value of Binomial Coefficient C(n, k)
    static long binomialCoeff(int n, int k) {
            long res = 1;

            // Since C(n, k) = C(n, n-k)
            if (k > n - k) {
                k = n - k;
            }

        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

    return res;
    }

    // A Binomial coefficient based function to find nth catalan number
    static long catalan(int n) {
            // Calculate value of 2nCn
            long c = binomialCoeff(2 * n, n);

            // return 2nCn/(n+1)
            return c / (n + 1);
    }


    // Driver program to test above function
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(catalan(i) + " ");
        }

        }
        }

