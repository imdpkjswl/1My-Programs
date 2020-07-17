package com.iamdj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
        System.out.println(q);
        int k =3;

        if(k > q.size()){
            System.out.println("K is greater than size of queue");
            return;
        }


        Queue<Integer> temp = new LinkedList<>();
        Stack<Integer> st = new Stack<>();


        // Push k item into stack from queue
        for(int i=0;i<k;i++) {
            st.push(q.poll());
        }

        // Dequeue remaining item and add into temp queue
        while (!q.isEmpty()){
            temp.add(q.poll());
        }

        // Again add item from stack into original queue.
        while (!st.empty()){
            q.add(st.pop());
        }

        // add remaining un-reversed item into original queue
        while (!temp.isEmpty()){
            q.add(temp.poll());
        }

        System.out.println(q);




    }
}
