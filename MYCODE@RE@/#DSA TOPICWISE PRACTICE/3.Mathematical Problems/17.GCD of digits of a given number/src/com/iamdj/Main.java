package com.iamdj;

import java.util.Scanner;

public class Main {

    static int gcd(int a, int b) {
        if(a == 0)
            return b;

        return gcd(b%a,a);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = in.nextInt();

        int m = n;

        int[] temp = new int[20]; // used to store digits of number in the form of array.

        int k=0;
        while(n!=0) {
            temp[k++] = n % 10;
            n = n/10;
        }

        int g = gcd(temp[0],temp[1]);
        for(int i=2;i<k;i++){
            g = gcd(g, temp[i]);
        }

        System.out.println("GCD of given number "+m+" is:  "+g);

    }
}
