package com.iamdj;

import java.util.Scanner;

/**
 * My method:
 * Time complexity: O(n^2), due to double for loop.
 * Auxiliary space : O(1)
 */
public class Main {

    static boolean isPrime(int n) {
        if(n <= 1)return false;

        for (int i=2;i<n;i++){
            if(n % i == 0)
                return false; // not prime
        }
        return  true;  // prime
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();

        int temp = n;

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                if(temp % i == 0) {  // check divisibility of given n by i prime number.
                    temp = temp / i;
                    System.out.print(i+"  ");
                    i = i - 1; // used to check that i can also divide the new value of n or not.
                }
            }
        }


    }
}
