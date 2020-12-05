/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VACCINE1 {

    private static int solve(int d1, int v1, int d2, int v2, int p) {
        if (d1 == d2) {
            int extra = 0; // handling case: 3 2 3 2 14
            if (d1 != 1) {
                extra = d1 - 1;
            }


            int v = (v1 + v2);
            int d = 1;
            // count no. of days
            for (; d <= 1000; d++) {
                if (v * d >= p) {
                    break;
                }
            }
            d = d + extra; // add extra days, when company wouldn't produce vaccine.
            return  d;
        }

        int v = 0;
        boolean flag = false;
        int d = 1; // start producing from day first

        // simply count day company not produce any vaccine initially
        for (; d < Math.min(d1, d2); d++) { }

        // use to identify company production per day
        if (d == d2) {
            flag = true;
        }

        // count days from min tp max-1 and sum produced vaccines
        for (; d < Math.max(d1, d2); d++) {
            if (flag)
                v += v2; // this means, company2 produce first, then company1
            else
                v += v1; // this means, company1 produce first, then company2

            if (v >= p) // Handling Extra Test Cases Here(if inbetween requirement fulfilled)
                return d;
        }

        // From here, company1 and company2 have same production till requirement
        int tmp = v1 + v2;
        for (; d <= 1000; d++) {
            v += tmp;
            if (v >= p) {
                break;
            }
        }

        return d;
    }

    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int d1 = 0, v1 = 0, d2 = 0, v2 = 0, p = 0;
        if (in.hasNextInt()) { // Handling NZEC
            d1 = in.nextInt();
        }
        if (in.hasNextInt()) {
            v1 = in.nextInt();
        }
        if (in.hasNextInt()) {
            d2 = in.nextInt();
        }
        if (in.hasNextInt()) {
            v2 = in.nextInt();
        }
        if (in.hasNextInt()) {
            p = in.nextInt();
        }

        int result = solve(d1, v1, d2, v2, p);
        System.out.println(result);
    }

}

/**
TEST CASES:
* 1 2 1 3 14
* 5 4 2 10 100
* 3 2 3 3 14
* 10 4 20 5 14
* 2 5 6 20 15
*/
