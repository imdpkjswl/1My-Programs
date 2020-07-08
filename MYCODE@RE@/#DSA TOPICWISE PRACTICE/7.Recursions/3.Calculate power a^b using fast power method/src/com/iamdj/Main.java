package com.iamdj;

/**
 * Time Complexity: O(n) : Divide & Conquer technique
 */
/*
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
*/





/**
    $ If we extend the same program , it can be improved:
    $ Time complexity: O(Log(N))
 */

public class Main {

    static int stepCounter;
    static int fastPower(int x, int y) {

        if( y == 0)
            return 1;
        stepCounter++;
        int temp = fastPower(x, y/2);
        if (y%2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 10;

        System.out.println(fastPower(a,b));
        System.out.println("Total steps needed:  "+stepCounter);

    }
}


