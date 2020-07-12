package com.iamdj;

import java.util.Stack;

public class Main {

        static int precedence(char symbol){

                switch (symbol){
                        case '+':
                        case '-':
                                return 1;
                        case '*':
                        case '/':
                                return 2;
                        case '^':
                        case '$':
                                return 3;
                }
                return -1;
        }

        static String infixToPostFix(String infix){

                String postfix = "";
                Stack<Character> stack = new Stack<>();

                for (int i = 0; i <infix.length() ; i++) {

                        char symbol = infix.charAt(i);

                        //check if char is operator
                        if(precedence(symbol)>0) {

                                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(symbol)) {
                                        postfix += stack.pop();
                                }
                                stack.push(symbol);

                        }
                        else if(symbol == ')') {

                                char temp = stack.pop();

                                while(temp != '(') {
                                        postfix += temp;
                                        temp = stack.pop();
                                } // End for

                        }
                        else if(symbol == '(') {
                                stack.push(symbol);
                        }
                        else{
                                //character is neither operator nor (
                                postfix += symbol;
                        }
                }  // End for

                for (int i = 0; i <=stack.size() ; i++) {
                        postfix += stack.pop();
                }

                return postfix;
        }

        public static void main(String[] args) {
                String infix = "a+(b*c-(d/e^f)*g)*h";   // Input string

                System.out.println("Infix Expression:    " + infix);
                System.out.println("Postfix Expression:  " + infixToPostFix(infix));
        }
}
