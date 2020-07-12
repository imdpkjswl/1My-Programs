package com.iamdj;


import java.util.Scanner;

class stack {

        char arr[];
        int top = -1;

        public stack(String s) {

           arr = new char[s.length()];
        }

        public boolean isempty() {

        return top==-1?true:false;
        }

        public void push(char c) {

            arr[++top] = c;
        }

        public char pop() {

            return arr[top--];
        }

        public char peek() {
        return arr[top];
        }
}

public class Main {

        public static int check_prec(char c) {

            if(c=='+'||c=='-')
                return 1;
            else if(c=='*'||c=='/'||c=='%'||c=='^')
                return 2;
            return 0;
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the infix string");
            String s = sc.next();
            stack st = new stack(s);
            String sb = "" ;

            char symbol;

        for(int i=s.length()-1;i>=0;i--) {

            symbol = s.charAt(i);

            if(Character.isLetter(symbol))
                sb = sb + symbol;

            else if(symbol==')') {

                st.push(symbol);
            }

            else if(symbol=='(') {

                while(st.peek()!=')') {

                    sb =   sb + st.pop();
                }
                st.pop();
            }
            else {

                if(!st.isempty() && !(st.peek()==')') && check_prec(symbol)<=check_prec(st.peek())) {

                    sb =  sb + st.pop();
                }
                st.push(symbol);
            }
        }

        while(!st.isempty()) {

            sb =  sb + st.pop();
        }
        String t = "";
        for(int i=sb.length()-1;i>=0;i--) {

            t = t + sb.charAt(i);

        }
        System.out.print("prefix expression:  " + t);
    }

}