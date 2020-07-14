package com.iamdj;

import java.util.Scanner;
import java.util.Stack;

public class Main {


    static double evaluate(char postfix[]) {

        double op1 = 0,op2=0;
        Stack<Double> st = new Stack<>();
        char symbol;


        for(int i=0;i<postfix.length;i++) {
            symbol = postfix[i];

            if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '^'){
                op2 = st.pop(); // always write op2 then op1.
                op1 = st.pop();
            }
            switch(symbol) {
                case '+':
                    st.push( op1 + op2);
                    break;

                case '-':
                    st.push( op1 - op2);
                    break;

                case '*':
                    st.push(op1 * op2);
                    break;

                case '/':
                    st.push( op1 / op2);
                    break;

                case '^':
                    st.push( Math.pow(op1,op2));
                    break;

                    default :   st.push((double) (symbol -48));

            }
        }

        return st.pop();
    }


    public static void main(String[] args) {

        String str;

        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a postfix expression");
        str= in.nextLine();
        char[] postfix = str.toCharArray();

        result = evaluate(postfix);

        System.out.println(result);

    }
}
