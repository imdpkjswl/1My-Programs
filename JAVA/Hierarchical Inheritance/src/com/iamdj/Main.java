package com.iamdj;

public class Main {

    public static void main(String[] args) {

        Son objs =  new Son(); // Create object of Son Sub-class.
        Daughter objd = new Daughter(); // Create object of Daughter Sub-class.

        objs.getdata(25,50); // Calling method of superClass.
        objs.display(); // Calling method of Sub-Class.

        objd.getdata(12,9); // Calling method of superClass.
        objd.display(); // Calling method of Sub-Class.


    }
}

class Father  // Super Class
{
    int a , b;

    void getdata(int x , int y )// Method with parameters
    {
        a = x;
        b = y;
    }
}

class Son extends Father  // Sub Class-1
{
    int add()
    {
        return a + b ;
    }

    void display()
    {
        System.out.println("A is :  " + a);
        System.out.println("B is :  " + b);
        System.out.println("Sum is :  "+add());
    }
}

class Daughter extends Father // Sub Class-2
{
    int mul()
    {
        return a*b ;
    }

    void display()
    {
        System.out.println("A is :  " + a);
        System.out.println("B is :  " + b);
        System.out.println("Multiplication is :  "+mul());
    }

}

