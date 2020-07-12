package com.iamdj;

import java.util.Stack;

public class Main {

    static boolean isOperator(char symbol){

        switch (symbol){

            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
            case '$':
                return true;
        }
        return false;
    }

    public static String convert(String expression){

        Stack<String> stack = new Stack<String>();

        for (int i = expression.length()-1; i >=0 ; i--) {

            char symbol = expression.charAt(i);

            if(isOperator(symbol)){
                String s1 = stack.pop();
                String s2 = stack.pop();

                String temp = s1 + s2 + symbol;

                stack.push(temp);
            }else{
                stack.push(symbol+"");
            }
        }

        String result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String prefix = "+ab";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Postfix Expression: " + convert(prefix));
    }
}