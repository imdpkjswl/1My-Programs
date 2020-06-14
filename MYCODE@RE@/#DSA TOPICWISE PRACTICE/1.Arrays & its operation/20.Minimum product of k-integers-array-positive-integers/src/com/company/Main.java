package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;


/**
 * Note:
 *          element(): return top element But not remove from the PriorityQueue Container.
 *          peek():    return top element from priority queue But Not remove.
 *          poll():    return top element from priority queue and removing it from the PriorityQueue container.
 *          remove():  doesn't return anything, just remove top element from PriorityQueue container.
 */
public class Main {

    public static int minProduct(int[] arr, int n, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
            pq.add(arr[i]);

        int count = 0, ans = 1;

        // One by one extract items
        while(pq.isEmpty() == false && count < k)
        {
            //ans = ans * pq.element();
            //pq.remove();
            ans = ans*pq.poll();
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[]  arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int result = minProduct(arr, n, k);

        System.out.println("The minimum product is:  "+result);
    }
}
