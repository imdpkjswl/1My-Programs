package com.iamdj;

import java.io.*;

public class ADD {

    public static void main(String[] args) throws IOException {
        // Code to display integer values on screen
        float a,b,sum;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter two number to add them");
        a=Float.parseFloat(in.readLine());
        b=Float.parseFloat(in.readLine());
        sum=a+b;
        System.out.println("The addition is " +sum);


    }
}
