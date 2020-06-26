package com.iamdj;

class Main {

    // function to calculate probability
    static double proCal(int n) {

        return (3.0 * n) / (4.0 * (n * n) - 1);
    }

    // Driver code to run above function
    public static void main(String arg[])
    {
        int a[] = { 1, 2, 3, 4, 5 };
        int n = a.length;
        System.out.print(Math.round(proCal(n) * 1000000.0) / 1000000.0);
    }
}