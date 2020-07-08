package com.iamdj;

public class Main {

    static int power(int a, int b) {
        if(b == 0)
            return 1;
        return a * power(a, b-1);
    }
    public static void main(String[] args) {

        int a  = 4;
        int b  = 3;

        System.out.println(power(a,b));
    }
}
