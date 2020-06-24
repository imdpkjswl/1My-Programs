package com.iamdj;

// Java Program to find position of n'th multiple of a number k in Fibonacci Series

class Main {

    public static int findPosition(int k, int n) {

        long f1 = 0, f2 = 1, f3;
        int i = 2;

        while(i != 0) {

            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

            if(f2 % k == 0) {  // checking divisibility
                return n * i;
            }

            i++;
        }
        return 0;
    }


    // Driver Code
    public static void main(String[] args) {
        // Multiple no.
        int n = 5;

        // Number of whose multiple we are finding
        int k = 4;

        System.out.print("Position of n'th multiple of k in Fibonacci Series is:  ");

        System.out.println(findPosition(k, n));
    }
}