package com.iamdj;

/*
// Note : This program will not work for large value of integer.
public class Main {

    static int fact(int n){
        int res = 1;

        for(int i=1;i<=n;i++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 10, p = 3;

        int result = fact(n);

        int max = 0;
        for(int x = 1;x<= n;x++){
            if( result % Math.pow(p,x)  == 0) {
                if(max < x)
                    max = x;
            }
        }

        System.out.println(max);
    }
}
*/

// This will work for any values.
class Main {

    // Function that returns largest power of p that divides n!
    static int Largestpower(int n, int p) {

        // Initialize result
        int ans = 0;

        // Calculate x = n/p + n/(p^2) + n/(p^3) + ....
        while (n > 0) {

            n /= p;
            ans += n;
        }
        return ans;
    }

    // Driver program
    public static void main (String[] args) {

        int n = 10;
        int p = 3;
        System.out.println(" The largest power of " + p + " that divides " + n + "! is " + Largestpower(n, p));


    }
}