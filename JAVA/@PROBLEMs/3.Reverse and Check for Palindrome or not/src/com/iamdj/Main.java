package com.iamdj;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long num , digit,res = 0; // Long used for big numbers.
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);

        num = in.nextLong();

        long temp = num;

        while(num != 0) // Logic for Palindrome and Reverse.
        {
            digit = num%10;
            res = res*10 + digit;
            num = num/10;
        }

        if(res == temp)
            System.out.println(+temp+" is a Palindrome number.");
        else
            System.out.println(+temp+" is not a Palindrome number.");

    }
}
