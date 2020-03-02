package com.iamdj;
public class Main {

    public static void main(String[] args) {

        Son obj =  new Son();
        obj.getdata(12,28);
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

class Son extends Father  // Sub Class
{
    private int add()
    {
        int sum = a + b;

        return sum;
    }

    void display()
    {
        System.out.println("A is :  " + a);
        System.out.println("B is :  " + b);
        System.out.println("Sum is :  " + add());
    }
}

