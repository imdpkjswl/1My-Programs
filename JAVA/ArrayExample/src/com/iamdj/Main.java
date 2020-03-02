package com.iamdj;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n.");
        int len = in.nextInt();

        int[] arr = new int[len];  //  Creating an array.

        System.out.println("Enter the "+len+" elements of an array");

        for(int i=0;i<len;i++) {
            arr[i] = in.nextInt();
        }
        in.close(); //  It is used to close the scope of class object...

        System.out.println();

        for(int i=0;i<len;i++) {
            System.out.println(arr[i]);
        }
    }
}
