package com.iamdj;
import java.util.Scanner;
// Best program to check a number is prime or not .
public class Main {

    public static void main(String[] args) {

        int num , prime = 0;
        System.out.println("Enter a number");

        Scanner in = new Scanner(System.in);

        num =  in.nextInt();
        int temp=num;

        if(num== 1 || num== 0){
            System.out.println(+temp+" is not a prime number.");
            return;
        }
        for(int i=2 ; i<(num/2);i++)
        {
            if(num%i == 0) {
                prime = 1;
            }
               break;
        }
        if(prime == 0)
        System.out.println(+temp+" is a Prime number.");
        else
            System.out.println(+temp+" is not a prime number.");
    }
}
