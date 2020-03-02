package com.dcompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int primeArray[] = new int[50];
        int n,count,ele=0;
        int i,j=0;

        for(n=3;n<50;n++)
        {
            count =0;
            for(i=1;i<=n;i++)
            {
                if(n%i == 0)
                    count++;
            }

            if(count == 2)
                primeArray[ele++] n;
        }

        System.out.println("Enter a positive even integer");

    }
}
