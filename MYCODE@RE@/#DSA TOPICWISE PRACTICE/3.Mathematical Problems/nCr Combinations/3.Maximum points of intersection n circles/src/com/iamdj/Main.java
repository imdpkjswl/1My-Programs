package com.iamdj;

public class Main {

    // for the calculation of 2*(nC2)
    static int intersection(int n) {

        return n * (n - 1);
    }


    public static void main(String[] args) {

        int n = 3;
        // Print result
        int maxIntersect = intersection(n);

        System.out.println("The maximum points of intersection:  "+maxIntersect);
    }
}
