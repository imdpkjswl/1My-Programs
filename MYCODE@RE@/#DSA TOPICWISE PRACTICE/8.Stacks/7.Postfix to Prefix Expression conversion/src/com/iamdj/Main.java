package com.iamdj;

import java.util.Stack;
public class Main {

    static boolean isOperator(char x){

        switch (x){
            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
                return true;
        }
        return false;
    }

    public static String convert(String expression){

        Stack<String> stack = new Stack<>();

        for (int i = 0; i <expression.length() ; i++) {

            char c = expression.charAt(i);

            if(isOperator(c)){
                String s1 = stack.pop();
                String s2 = stack.pop();

                String temp = c + s2 + s1;
                stack.push(temp);
            }else{
                stack.push(c+"");
            }
        }
        String result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String postfix = "ab+";
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + convert(postfix));
    }
}