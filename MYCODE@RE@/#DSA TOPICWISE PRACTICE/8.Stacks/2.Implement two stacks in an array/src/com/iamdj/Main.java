package com.iamdj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] st = new int[22];
    // Dividing space in two halves
    static int top1 = -1 , topEnd1 = 11;
    static int top2 = 11, topEnd2 = st.length;


    static void push(int stackNo, int item) {
        if(stackNo == 1){
            if(top1 == topEnd1){
                System.out.println("Stack1 overflow");
                return;
            }
            System.out.println(item+" :  pushed");
            st[++top1] = item;
        } else if(stackNo == 2){
            if(top2 == topEnd2){
                System.out.println("Stack2 overflow");
                return;
            }
            System.out.println(item+" :  pushed");
            st[++top2] = item;
        }
    }

    static void pop(int stackNo){
        if(stackNo == 1) {
            if (top1 == -1) {
                System.out.println("Stack1 underflow");
                return;
            }
            System.out.println(st[top1--] + " :  popped\n");
        } else if(stackNo == 2) {
            if (top1 == topEnd1) {
                System.out.println("Stack1 underflow");
                return;
            }
            System.out.println(st[top2--] + " :  popped\n");
        }
    }

    static void traverse(int stackNo){
        if(stackNo == 1) {
            if (top1 == -1) {
                System.out.println("Stack1 underflow");
                return;
            }
            System.out.println("Stack1 elements are:");
            for (int i = 0; i <= top1; i++) {
                System.out.print(st[i] + " ");
            }
            System.out.println();
        } else if(stackNo == 2) {
            if (top2 == 11) {
                System.out.println("Stack2 underflow");
                return;
            }
            System.out.println("Stack2 elements are:");
            for (int i = topEnd1+1; i <= top2; i++) {
                System.out.print(st[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int ch,item,stNo;

        while(true){
            System.out.println("1.Push\n2.Pop\n3.Traverse\n4.Exit");
            System.out.println("Enter the stack number:");
            stNo = Integer.parseInt(bf.readLine());
            System.out.println("Enter your choice:");
            ch = Integer.parseInt(bf.readLine());


            switch(ch) {
                case 1:
                    System.out.println("Enter item to push:");
                    item = Integer.parseInt(bf.readLine());
                    push(stNo, item);
                    break;
                case 2:
                    pop(stNo);
                    break;
                case 3:
                    traverse(stNo);
                    break;
                case 4:
                    System.exit(420);
            }
        }
    }
}
