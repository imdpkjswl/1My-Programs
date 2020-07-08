package com.iamdj;

// Given condition is To move only right or down in grid.
public class Main {

    static int path(int n, int m) {
        if(n == 1 || m == 1)  // base case for reached at last row or last column.
            return 1;

        return path(n,m-1) + path(m,n-1);
    }


    public static void main(String[] args) {

        int n = 3;
        int m = 4;

        System.out.println(path(n,m));
    }
}
