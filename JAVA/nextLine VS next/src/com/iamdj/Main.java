package com.iamdj;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        System.out.println("Enter your name");

        Scanner in = new Scanner(System.in);

        str = in.nextLine(); // nextLine means it will take input after pressing space button.
        System.out.println("Your full name is  " + str);

        System.out.println("Again, Enter your name");
        str = in.next(); // next means it will not take input after pressing space button.
        System.out.println("Your name is  " + str);

    }
}
