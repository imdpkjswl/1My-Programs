package com.company;

import java.util.Scanner;

class addition{

    Scanner obj = new Scanner(System.in);

    int read() {
        int a,b,sum;
        System.out.println("Enter two number : ");
        a = obj.nextInt();
        b = obj.nextInt();

        sum = a+b;
        return sum;
    }

    void display() {

        int x;

        x = read();
        System.out.println("Sum is : "+x);

    }
}
public class Main {

    public static void main(String[] args) {

        addition obj = new addition();

        obj.display();
    }
}
