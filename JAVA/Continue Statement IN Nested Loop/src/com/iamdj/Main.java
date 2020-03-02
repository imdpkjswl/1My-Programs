package com.iamdj;

public class Main {

        //Java Program to illustrate the use of continue statement
        //inside an inner loop continue is used.
    public static void main(String[] args) {
            //outer loop
            for(int i=1;i<=3;i++){
                //inner loop
                for(int j=1;j<=3;j++){
                    if(i==2&&j==2){
                        //using continue statement inside inner loop
                        continue;
                    } // In case : Only 2 2 will not printed.it'll skipped.
                    System.out.println(i+" "+j);
                }
            }
        }

}
