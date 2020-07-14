package com.iamdj;

import java.util.Scanner;
import java.util.Stack;

public class Main {


    static double evaluate(char prefix[]) {

        double op1 = 0,op2=0;
        Stack<Double> st = new Stack<>();
        char symbol;

        // No difference in prefix & postfix code, Just reverse the for loop Only.
        for(int i=prefix.length-1;i>=0;i--) {
            symbol = prefix[i];

//            // NOTE: IMPORTANT STATEMENT TO SOLVING LARGE EXPRESSION,BUT HAVE TO USE STRING INSTEAD OF CHARACTER.
//            if(symbol ==' ')
//                continue;

            // If the scanned character is an operand (number here), push it to the stack.
            if(Character.isDigit(symbol)){
                st.push((double) (symbol -48));  // convert character into number.
            }
            else {
                //  If the scanned character is an operator, pop two elements from stack apply the operator
                op1 = st.pop(); // always write op1 then op2.
                op2 = st.pop();

                switch (symbol) {
                    case '+':
                        st.push(op1 + op2);
                        break;

                    case '-':
                        st.push(op1 - op2);
                        break;

                    case '*':
                        st.push(op1 * op2);
                        break;

                    case '/':
                        st.push(op1 / op2);
                        break;

                    case '^':
                        st.push(Math.pow(op1, op2));
                        break;
                }
            }
        }

        return st.pop();
    }


    public static void main(String[] args) {

        String str;

        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a prefix expression");
        str= in.nextLine();
        char[] prefix = str.toCharArray();

        result = evaluate(prefix);

        System.out.println(result);

    }
}
