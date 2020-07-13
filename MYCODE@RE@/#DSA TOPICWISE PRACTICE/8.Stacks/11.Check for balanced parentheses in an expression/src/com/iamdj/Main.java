package com.iamdj;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<n;i++) {
            char temp = str.charAt(i);
            // Push open parenthesis equivalent opposite symbol for compare purpose.
                if(temp == '{')
                    stack.push('}');
                else if(temp == '[')
                    stack.push(']');
                else if( temp == '(')
                    stack.push(')');


             // Check for closed parenthesis
            if(temp == '}' || temp == ']' || temp == ')'){
                if(!stack.empty()) {  // Before compare check for stack emptiness
                    if( stack.pop() != temp){ // pop when compare made.
                        System.out.println("Not Balanced.");
                        System.exit(1);
                    }

                }else{  // in case of only closed parenthesis input.
                    System.out.println("Not Balanced.");
                    System.exit(1);
                }

            }
        }

        if(stack.empty())  // in case of only open parenthesis input.
            System.out.println("Balanced.");
        else
            System.out.println("Not Balanced.");

    }
}
