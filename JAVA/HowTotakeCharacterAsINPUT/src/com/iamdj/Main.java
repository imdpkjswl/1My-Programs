package com.iamdj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

            public static void main(String[] args) throws IOException {
            // code to take character from User as input and print
            String character;

            InputStreamReader read = new InputStreamReader(System.in); //Creating input object
            BufferedReader in = new BufferedReader(read); //Creating Object reading object
            System.out.println("Enter your name");
            character = in.readLine(); //this line(Function) to read string and store in n variable

            System.out.println("Your name is "+character);  //using concatenation to print result.
        }
}
