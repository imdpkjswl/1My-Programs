package com.iamdj;

public class Main {

    //A Java program to demonstrate the use of labeled for loop
    public static void main(String[] args) {
            //Using Label for outer and for loop
            Outer:
            for(int i=1;i<=3;i++){
                Inner:
                for(int j=1;j<=3;j++){
                    if( i==2 && j==2 ){
                        break Outer; // If we use here, Inner in place of Outer,then This'll works as default for loop.
                    }               // In that case,loop will break only for one time.means: 2 2 and 2 3 will not print.
                    System.out.println(i+ " " +j);
                }
            }
        }

}
