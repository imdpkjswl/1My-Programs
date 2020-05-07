package Display;

import Addition.add; // importing add class from Addition package

public class show {
    add object = new add();
    double a,b;
    java.util.Scanner obj = new java.util.Scanner(System.in);

    public void read(){
        System.out.println("Enter first number");
        a = obj.nextDouble();
        System.out.println("Enter second number");
        b = obj.nextDouble();
    }

    public void print(){
        System.out.println("Sum:  "+object.sum(a,b));
    }
}
