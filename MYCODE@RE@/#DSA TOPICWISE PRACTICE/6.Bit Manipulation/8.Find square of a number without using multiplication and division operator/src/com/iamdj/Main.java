package com.iamdj;

// Square of any number 'n' is sum of odd number 'n' times.
public class Main {

    // Another method:
    static int square(int n) {
        int sq = 0;
        for(int i=0;i<n;i++) {
            sq = sq + n;
        }
        return sq;
    }

    public static void main(String[] args) {

        int n = -7;
        n = Math.abs(n);

        

        int odd = 1;
        int sq = 0;
        for(int i=0;i<n;i++) {

            sq = sq + odd;  // add odd numbers
            odd = odd+2;  // Generate odd number
        }
        System.out.println(sq);


        // 2nd method result:
        System.out.println(square(n));
    }
}
