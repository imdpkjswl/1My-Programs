package com.company;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner obj = new Scanner(System.in);
	    int a,b,sum;
        System.out.println("Enter two number");
        a = obj.nextInt();
        b = obj.nextInt();

        sum = a+b;

        System.out.println("Sum of "+a+" and "+b+" is : "+sum);

    }
}
