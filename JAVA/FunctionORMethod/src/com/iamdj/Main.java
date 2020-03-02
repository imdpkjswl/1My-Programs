package com.iamdj;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int first , second;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two number to swap them");
        first = in.nextInt();
        second = in.nextInt();
        System.out.println("First number is : "+ first+  "\nSecond number is : " + second);
        Swap(first , second);

    }

    private static void Swap(int m, int n){

        int temp;

        temp = m;
        m = n;
        n = temp;

        System.out.println("Now After Swapped:\nFirst number is : "+ m +  "\nSecond number is : " + n);
    }
}
