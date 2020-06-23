package com.iamdj;

import java.util.Scanner;

/* Approach:
 we have 1 to N numbers, we know that the sum of all the numbers is N * (N + 1) / 2. Let S1 and S2 be two sets such that,
 1) sum(S1) + sum(S2) = N * (N + 1) / 2
 2) sum(S1) – sum(S2) = M
    Solving these two equations will give us the sum of both the sets. If sum(S1) and sum(S2) are integers
    and they are co-prime (their GCD is 1), then there exists a way to split the numbers into two sets.
    Otherwise, there is no way to split these N numbers.
 */

/**
 * Time complexity: O(Log(n))
 * Space complexity: O(1)
 */
public class Main {

    static int gcd(int a, int b){
        if(a == 0)
            return b;

        return gcd(b%a,a);
    }

    static boolean splitTable(int N, int M) {
        // Find the sum of total element from 1 to N
        int total = (N*(N+1))/2;

        // Find the sum1 whose difference with another sum2 might be equal to M.
        int sum1 = (total + M)/2;
        int sum2 = (total - sum1);

        int res = gcd(sum1, sum2);
        // checking for co-prime.
        return res == 1;  // if res will be 1,then it return true.otherwise false
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int N = in.nextInt();
        System.out.println("Enter the value of M:");
        int M = in.nextInt();

        if(splitTable(N, M))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}


/*
Input : N = 5 and M = 7
Output : YES
Explanation : as numbers from 1 to 5 can be divided into two sets {1, 2, 3, 5}
and {4} such that absolute difference between the sum of both sets is 11 – 4 = 7
is equal to M and also GCD(11, 4) = 1.




Input : N = 6 and M = 3
Output : NO
Explanation : In this case, Numbers from 1 to 6 can be divided into two sets {1, 2, 4, 5}
and {3, 6} such that absolute difference between their sum is 12 – 9 = 3. But, since 12
and 9 are not co-prime as GCD(12, 9) = 3, the answer is ‘NO’.
 */