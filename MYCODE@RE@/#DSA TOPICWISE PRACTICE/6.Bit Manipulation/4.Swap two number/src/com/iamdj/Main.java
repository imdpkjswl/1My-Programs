package com.iamdj;

public class Main {

    public static void main(String[] args) {
        int x = 3, y = 4;

        System.out.println("Before swap: x = " +x+ " and y = " +y);
        // swap
        if (x != y) {

            x ^=  y;
            y = x ^ y;
            x ^=  y;
        }
        System.out.println("After swap: x = " +x+ " and y = " +y);
    }
}