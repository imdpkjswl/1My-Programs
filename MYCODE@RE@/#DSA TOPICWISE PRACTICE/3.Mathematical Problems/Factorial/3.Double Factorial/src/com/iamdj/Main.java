package com.iamdj;
/*
class Main {

    // function to find double factorial of given number
    static long doubleFactorial(long n) {
        if (n == 0 || n==1)
            return 1;

        return n * doubleFactorial(n - 2);
    }

    // Driver code
    static public void main (String[] args) {

        System.out.println("Double factorial is " + doubleFactorial(5));
        System.out.println("Double factorial is " + doubleFactorial(6));
    }
}
*/

class Main {

    // function to find double factorial of given number
    static int doubleFact(int n) {
        int res = 1;
        for (int i = n; i >= 0; i = i-2)
        {
            if (i == 0 || i == 1)
                return res;
            else
                res *= i;
        }

        return res;
    }

    // Driver code
    public static void main(String[] args) {

        System.out.println("Double factorial is " + doubleFact(5));
    }
}