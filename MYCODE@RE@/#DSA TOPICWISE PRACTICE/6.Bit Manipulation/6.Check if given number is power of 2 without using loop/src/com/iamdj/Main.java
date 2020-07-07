package com.iamdj;

public class Main {

    static boolean isPower(int n) {
        int res;
        res = n & (n-1);   // main statement
        if( res== 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        int n = 34;

        System.out.println(isPower(n));

    }
}
