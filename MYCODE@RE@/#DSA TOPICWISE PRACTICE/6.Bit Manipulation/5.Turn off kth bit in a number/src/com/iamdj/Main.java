package com.iamdj;

class Main {

    // Function to turn off k'th bit in n
    public static int turnOffKthBit(int n, int k) {

        return n & ~(1 << (k - 1));   // NOTE: For turn on kth bit remove only negation from the statement.
    }

    public static void main(String[] args) {

        int n = 20;
        int k = 3;

        System.out.println(n + " in binary is " + Integer.toBinaryString(n));
        System.out.println("Turning k'th bit off..");

        n = turnOffKthBit(n, k);
        System.out.println(n + " in binary is " + Integer.toBinaryString(n));
    }
}


/*
n = 20 and k =3

00010100  &   ;    n = 20
11111011      ;   ~(1 << (3-1))
___________
00010000      ; n & ~(1<<(3-1))
-----------


 */