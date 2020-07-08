package com.iamdj;

/**
 * Time Complexity: O(n) : Divide & Conquer technique
 */
public class Main {

    static int stepCounter;
    static int fastPower(int a, int b) {
        if(b == 0)  // Base case
            return 1;

        stepCounter++;
        int identify = b & 1; // checking even or odd
        if(identify == 0)  // for even power
            return fastPower(a*a,b/2);  // relation for even power
        else
            return a * fastPower(a,b-1);  // relation for odd power
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 10;

        System.out.println(fastPower(a,b));
        System.out.println("Total steps needed:  "+stepCounter);

    }
}
