package com.iamdj;

public class Main {

    static boolean primalityTest(int n) {

        if( n == 2 || n == 3)
            return true;
        // Apply Formula:  a^(n-1) % n == 1 and (a+1)^n-1 % n == 1
        for(int a = 2;a<n;a++) {
            if(Math.pow(a,n-1) % n == 1 && Math.pow(a+1,n-1) % n == 1){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        int n = 20;

        for(int i=1;i<=n;i++){
            if(primalityTest(i)){
                System.out.print(i+" ");
            }
        }
    }
}
