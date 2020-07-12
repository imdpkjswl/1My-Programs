package com.iamdj;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int st[] = new int[10];
    static int top = -1;

    static void push(int item) {
        if(top == st.length-1){
            System.out.println("Stack overflow");
            return;
        }
        System.out.println(item+" :  pushed");
        st[++top] = item;
    }

    static void pop(){
        if(top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(st[top--]+" :  popped\n");
    }

    static void traverse(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Stack elements are:");
        for(int i=0;i<=top;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }

    static void  findMiddle(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        } else if(top  <=2) {
            System.out.println("Can't found middle coz element less than 2");
            return;
        }
        System.out.println("Middle element:");
        System.out.println(st[top/2]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int ch,item;

        while(true){
            System.out.println("1.Push\n2.Pop\n3.Traverse\n4.findMiddle\n5.Exit");
            System.out.println("Enter your choice:");
            ch = Integer.parseInt(bf.readLine());

            switch(ch) {
                case 1:
                    System.out.println("Enter item to push:");
                    item = Integer.parseInt(bf.readLine());
                    push(item);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    traverse();
                    break;
                case 4:
                    findMiddle();
                    break;
                case 5:
                    System.exit(420);
            }
        }
    }
}
