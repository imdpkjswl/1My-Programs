package com.iamdj;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static Queue<Integer> reverse(Queue<Integer> q) {
        if (q.size() == 0)
            return q;

        // Dequeue current item from front
        int temp = q.poll();

        // Reverse remaining queue by calling itself
        q = reverse(q);

        // Enqueue current item to rear
        q.add(temp);

        return q;
    }


    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        // reverse the queue
        q = reverse(q);

        System.out.println(q);

    }
}
