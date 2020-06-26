package com.iamdj;


/**
 * Dyck path or nth catalan number is a staircase walk from bottom left, i.e., (n-1, 0) to top right, i.e.,
 * (0, n-1) that lies above the diagonal cells (or cells on line from bottom left to top right).
 * The number of Dyck paths from (n-1, 0) to (0, n-1) can be given by the Catalan numberC(n):
 * Cn = (2n)!/(n+1)!n1
 */
public class Main {
        // Returns count Dyck paths in n x n grid
        public static int countDyckPaths(int n) {

            // Compute value of 2nCn
            int res = 1;
            for (int i = 0; i < n; ++i) {

                res *= (2 * n - i);
                res /= (i + 1);
            }

            // return 2nCn/(n+1)
            return res / (n + 1);
        }

        // Driver code
        public static void main(String args[]) {

            int n = 4;
            System.out.println("Number of Dyck Paths is " + countDyckPaths(n));
        }
}
