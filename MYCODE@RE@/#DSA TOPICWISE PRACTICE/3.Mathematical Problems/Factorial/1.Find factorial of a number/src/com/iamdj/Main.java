package com.iamdj;

/*
// Solve using recursion:
public class Main {
    static int fact(int n){
        if(n==0) return 1;

        return n*fact(n-1);
    }

    public static void main(String[] args) {

        int n = 4;
        int result = fact(n);

        System.out.println(result);
    }
}
*/



// Solve using recursion:
public class Main {
    static int fact(int n){
        int res = 1;

        for(int i=1;i<=n;i++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 4;
        int result = fact(n);

        System.out.println(result);
    }
}
