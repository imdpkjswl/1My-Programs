package JavaInputs;

import java.util.Scanner;

public class ScannerClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Enter int input:");
        int i1 = sc.nextInt();

        System.out.println("Enter long input:");
        long i2 = sc.nextLong();

        System.out.println("Enter float input:");
        float i3 = sc.nextFloat();

        System.out.println("Enter double input:");
        double i4 = sc.nextDouble();

        System.out.println("Enter char input:");
        char i5 = sc.next().charAt(0);// every word first letter
        char i6 = sc.next().charAt(0);
        System.out.println(i5+" "+i6);

        System.out.println("Enter string input:");
        String i7 = sc.nextLine();// take entire string
        System.out.println(i7);

        System.out.println("Enter string input:");
        String i8 = sc.next();// take single string only
        System.out.println(i8); */


        // Take pattern first, then whole string
        System.out.println("Enter the pattern");
        String ptr = sc.next();
        System.out.println(ptr);
        sc.nextLine();// This is important, for clearing the new line character

        System.out.println("Enter entire string pattern");
        String str = sc.nextLine();
        System.out.println(str);












    }
}
