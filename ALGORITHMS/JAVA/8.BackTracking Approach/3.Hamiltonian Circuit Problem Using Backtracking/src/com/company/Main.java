package com.company;

import java.util.*;

class hamiltoniamCycleDetection {
    private int a[][] = new int[10][10];
    int x[] = new int[10];
    int n;

    public hamiltoniamCycleDetection() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        n = src.nextInt();

        x[1] = 1;  // the cycle starts from vertex 1

        for (int i = 2; i <= n; i++)
            x[i] = 0;

        System.out.println("Enter the adjacency matrix");
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                a[i][j] = src.nextInt();
    }



    public void nextVertex(int k) {
        int j = 1;

        while (true) {

            x[k] = (x[k] + 1) % (n + 1);

            if (x[k] == 0)
                return;


            if (a[x[k - 1]][x[k]] == 1)  //there exists a edge between k and (k-1) vertex
                for (j = 1; j < k; j++)  // check whether the vertices are distinct
                    if (x[j] == x[k])
                        break;

            if (j == k) // if there is distinction
                if (k < n || (k == n && a[x[n]][1] == 1))
                    return;
        }//end of while
    }// end of the method



        public void getCycle(int k) {

            while (true) {
                nextVertex(k);

                if (x[k] == 0)
                    return;

                if (k == n) {

                    System.out.println("\nSolution : ");
                    for (int i = 1; i <= n; i++)
                        System.out.print(x[i] + " ");
                    System.out.println(1);
                } else
                    getCycle(k + 1);

            }//end of while
        }//end of getCycle
}// end of hamiltonianCycleDetection



public class Main {
        public static void main(String args[]) {
            hamiltoniamCycleDetection obj=new hamiltoniamCycleDetection();
            obj.getCycle(2);
        }
}

