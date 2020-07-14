package com.iamdj;

import java.util.Scanner;

/**
 Algorithm:
 Time complexity : O(n)

 step1. We maintain two pointers at the start and end corners. (a, b)
 step2. In the given matrix value
    * If Matrix[A][B] = 1, then A knows B
    * Else, A doesn’t know B
 step3. Keep moving the pointers A and B such that, if A knows B move A.
        Else, move A. Do this Until A < B.

 step4. Finally check if A is celebrity or not by using two conditions:
    * For all i, i should know A, except i not equal to A
    * For all i, A shouldn’t know i
 */

class Main {

    //Number of people
    static int N;
    static int[][] matrix;



    //In this Matrix, if i knows j then Matrix[i][j] = 1, Else 0
    static int Knows(int A, int B) {
        return matrix[A][B];
    }


    //Function to find the id of celebrity
    static int FindCelebId(int n) {

        int A = 0, B = n - 1;
        //Finding celebrity
        while (A < B) {
            if (Knows(A, B) == 1) {
                A++;
            } else {
                B--;
            }
        }
        //Check celebrity conditions
        //If A is celebrity
        //All members should know A
        //A should not now anyone
        for (int i = 0; i < n; i++) {
            if ((i != A) && (Knows(A, i)==1 || Knows(i, A) != 1 )) {
                return -1;
            }
        }
        return A;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        N = in.nextInt();
        matrix = new int[N][N];
        System.out.println("Enter the input elements:");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix[i][j] = in.nextInt();
            }
        }

        int celebrityId = FindCelebId(N);

        if (celebrityId == -1)
            System.out.println("No Celebrity found");
        else
            System.out.println("Celebrity id is: "+ celebrityId);

    }
}