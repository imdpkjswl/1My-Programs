package com.iamdj;

import java.util.Scanner;

/** The idea is to generate fib number till key value and check whether they are equal or not.
 * Time complexity: O(N)
 * Space complexity: O(1)
 */
public class Main {

    static int fib(int n) {
        double base = (1 + Math.sqrt(5)) / 2;

        return (int) Math.round(Math.pow(base, n) / Math.sqrt(5));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the key number:");
        int key = in.nextInt();

        

        for(int i=2;i<=key;i++){
            if( key == fib(i)){
                System.out.println(key+" is a fibonacci number.");
                System.exit(0);
            }
        }
        System.out.println(key+" is not a fibonacci number.");

    }
}
