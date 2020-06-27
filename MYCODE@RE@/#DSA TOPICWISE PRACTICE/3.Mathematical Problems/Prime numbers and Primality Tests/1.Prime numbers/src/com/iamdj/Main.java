package com.iamdj;

public class Main {

    static boolean isPrime(int n) {

        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int n = 3;

        System.out.println(isPrime(n));


    }
}
