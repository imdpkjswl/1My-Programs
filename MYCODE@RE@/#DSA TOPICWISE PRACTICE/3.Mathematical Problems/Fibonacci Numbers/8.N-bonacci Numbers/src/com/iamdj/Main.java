package com.iamdj;

/**
 * Time complexity: O(M*N)
 */
// Initialize first N-1 terms as 0 and N-th term as 1.
// Now to find terms from (N+1)-th to M-th, we simply compute sum of previous N terms.
class Main {
    // Function to print bonacci series
    static void bonacciSeries(int n, int m) {
        // Assuming m >= n.
        int []a = new int[m];
        a[n - 1] = 1;

        // Computing every term as sum of previous n terms.
        for (int i = n; i < m; i++)
            for (int j = i - n; j < i; j++)
                a[i] += a[j];

        for (int i = 0; i < m; i++)
            System.out.print(a[i] + " ");
    }

    // Driver Code
    public static void main(String args[]) {
        // Here, N is n-bonacci and M is mth term of n-bonacci number.
        int N = 2, M = 10;
        bonacciSeries(N, M);
    }
}