package com.iamdj;

public class Main {

    static  int min(int x , int y) {

        return y +((x-y) & ((x-y) >> 31));  // Easy method 

        //return y ^ ((x ^ y) & -((x < y) ? 1:0)); // quite difficult
    }

    static  int max(int x , int y) {

        return x -((x-y) & ((x-y) >>31));

        //return x ^ ((x ^ y) & -((x < y) ? 1:0));
    }
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;

        System.out.println("Min is: "+min(num1,num2));
        System.out.println("Max is: "+max(num1,num2));


    }
}
