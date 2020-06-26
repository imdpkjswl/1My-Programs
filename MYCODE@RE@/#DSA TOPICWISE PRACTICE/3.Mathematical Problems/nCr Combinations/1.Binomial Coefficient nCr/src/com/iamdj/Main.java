package com.iamdj;

/**
 *  C(n, k) = C(n-1, k-1) + C(n-1, k)
 *  C(n, 0) = C(n, n) = 1
 */
/*
class Main {

    // Returns value of Binomial Coefficient C(n, k)
    static int binomialCoeff(int n, int r) {

        // Base Cases
        if (r == 0 || r == n)
            return 1;

        // Recur
        return binomialCoeff(n - 1, r - 1) + binomialCoeff(n - 1, r);
    }

    public static void main(String[] args) {

        int n = 5, r = 2;
        System.out.printf("Value of C(%d, %d) is %d ", n, r, binomialCoeff(n, r));
    }
}
*/

/*
// Overlapping Sub-problems: O(n*r)
class Main {

    // Returns value of Binomial Coefficient C(n, r)
    static int binomialCoeff(int n, int r) {
        int C[][] = new int[n+1][r+1];
        int i, j;

        // Calculate  value of Binomial Coefficient in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= min(i, r); j++)
            {
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;

                    // Calculate value using previously stored values
                else
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        return C[n][r];
    }

    // A utility function to return minimum of two integers
    static int min(int a, int b) {

        return (a<b)? a: b;
    }


    public static void main(String args[]) {
        int n = 5, k = 2;
        System.out.println("Value of C("+n+","+k+") is "+binomialCoeff(n, k));
    }
}
*/

class Main {

    static int fact(int n) {
        int res=1;
        while(n != 0) {
            res = res*n;
            n--;
        }
        return  res;
    }

    public static void main(String[] args) {

        int n = 8, r = 6;
        // Apply formula: C(n,r) = n!/(n-r)!r!
        int result = fact(n)/(fact(n-r)*fact(r));

        System.out.println("The value of C("+n+","+r+") = "+result);

    }
}
