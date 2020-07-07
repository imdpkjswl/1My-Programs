package com.iamdj;

public class Main {

    public static void main(String[] args) {

        int num = 120;

        int result = num & 1;
        if(result==1)
            System.out.println("Odd");
        else
            System.out.println("Even");

    }
}
