package com.iamdj;

import java.util.Stack;

public class Main {

    static boolean isOperator(char x) {

        switch (x) {

            case '+':
            case '-':
            case '/':
            case '*':
            case '$':
            case '^':
                return true;
        }

        return false;
    }

    public static String convert(String expression) {

        Stack<String> stack = new Stack<>();

        for (int i = expression.length()-1; i >=0 ; i--) {

            char c = expression.charAt(i);

            if(isOperator(c)) {
                    String s1 = stack.pop();
                    String s2 = stack.pop();

                    String temp = "("+s1+c+s2+")";
                    stack.push(temp);
            }
            else {
                stack.push(c+"");
            }
        }

        String result = stack.pop();

        return result;
    }

    public static void main(String[] args) {

        String exp = "^*ab-cd";

        System.out.println("Prefix Expression: " + exp);
        System.out.println("Infix Expression: " + convert(exp));

    }
}