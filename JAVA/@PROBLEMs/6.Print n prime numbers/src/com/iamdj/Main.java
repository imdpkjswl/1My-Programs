package com.iamdj;
import java.util.Scanner;
//  program to print n prime numbers .
public class Main {

    public static void main(String[] args) {

        int num;

        System.out.println("Enter the end number");
        Scanner in = new Scanner(System.in);

        num =  in.nextInt();

            for (int j = 2; j <= num; j++) {
                int temp = 0;
                for (int i = 2; i <= j - 1; i++) {
                    if (j % i == 0) {
                        temp = temp + 1;
                    }
                }
                if (temp == 0)
                    System.out.println(j);

            }


    }
}
