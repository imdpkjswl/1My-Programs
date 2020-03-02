package com.iamdj;

public class Main {

    public static void main(String[] args) {

        GrandSon obj =  new GrandSon();
        obj.getdata(25,50);
        obj.display();

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

class Son extends Father  // Intermediate Sub Class
{
    int c = 20;
     int add()
    {
        int sum = a + b + c;

        return sum;
    }
}

class GrandSon extends Son
{

    void display()
    {
        System.out.println("A is :  " + a);
        System.out.println("B is :  " + b);
        System.out.println("C is :  " + c);
        System.out.println("Sum is :  "+add());
    }
}

