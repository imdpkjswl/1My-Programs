package com.iamdj;

public class Main {
    //Java Program to demonstrate the use of continue statement
//inside the for loop.
    public static void main(String[] args) {
            //for loop
            for(int i=1;i<=10;i++){
                if(i==5){
                    //using continue statement.In case: Only 5 will not printed on screen.
                    continue;//it will skip the rest statement
                }
                System.out.println(i);
            }
        }

}
