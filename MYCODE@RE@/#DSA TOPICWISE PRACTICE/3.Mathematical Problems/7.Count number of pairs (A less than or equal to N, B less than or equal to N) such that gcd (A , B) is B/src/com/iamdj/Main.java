package com.iamdj;


import java.util.Scanner;

/**
 * Naive method:
 * Time complexity: O(n^2Log(n))
 * Space complexity: O(1)
 */
/*
public class Main {

    public static int gcdPair(int a , int b){
        if(a == 0)
            return  b;

        return gcdPair(b % a , a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int N = in.nextInt();
        int count =0;

        for(int A=1;A<=N;A++) {
            for(int B=1;B<=N;B++) {

                if(gcdPair(A,B) == B){ // given
                    System.out.print("("+A+","+B+") ");
                    count++;
                }
            }
        }

        System.out.println("\nTotal number of pair is:  "+count);

    }
}
*/


// Java implementation of counting pairs such that gcd (a, b) = b
class Main {

    // returns number of valid pairs
    static int CountPairs(int n) {

        // initialize k
        int k = n;

        // loop till imin <= n
        int imin = 1;

        // Initialize result
        int ans = 0;

        while (imin <= n) {

            // max i with given k floor(n/k)
            int imax = n / k;

            // adding k*(number of i with floor(n/i) = k to ans
            ans += k * (imax - imin + 1);

            // set imin = imax + 1 and k = n/imin
            imin = imax + 1;
            k = n / imin;

        }

        return ans;
    }

    // Driver code
    public static void main(String[] args) {

        System.out.println(CountPairs(1));
        System.out.println(CountPairs(2));
        System.out.println(CountPairs(3));

    }
}












/*
Input : n = 2
Output : 3
(1, 1) (2, 2) and (2, 1).

Input : n = 3
Output : 5
(1, 1) (2, 2) (3, 3) (2, 1) and (3, 1).
 */