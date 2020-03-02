package com.iamdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the coefficient of quadratic equation");
        Scanner in = new Scanner(System.in);
        double r1 , r2;
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double d = b*b - 4*a*c;

        if(d == 0){
            System.out.println("Roots are equal");
            r1 = r2 = (-b)/(2*a);
            System.out.println("Root1 :  "+r1+" and Root2 :  "+r2);
        }
        if(d > 0){
            System.out.println("Roots are real and distinct");
            r1 = ((-b)+(Math.sqrt(d)))/(2*a);
            r2 = ((-b)-(Math.sqrt(d)))/(2*a);
            System.out.printf("Root1 :  %.3f and Root2 :  %.3f",r1,r2);
        }
        if(d < 0){
            System.out.println("Roots are imaginary and complex");
            r1 = (-b)/(2*a);
            r2 = (Math.sqrt(-d))/(2*a);
            System.out.printf("Root1 :  %.3f + %.3fi\n",r1,r2);
            System.out.printf("Root2 :  %.3f - %.3fi",r1,r2);
        }



    }
}
