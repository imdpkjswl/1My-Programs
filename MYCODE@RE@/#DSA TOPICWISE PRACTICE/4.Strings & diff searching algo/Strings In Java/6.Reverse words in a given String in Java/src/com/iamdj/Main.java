package com.iamdj;

public class Main {

    public static void main(String[] args) {

        String str = "Hello my name is deepak jaiswal";
        char[] chr = str.toCharArray();

        int n = chr.length;
        char[] res = new char[n];
        int r=0;

        int i,j =0;
        boolean flag = true;
        for(int k=n-1;k>=0;k--) {

            if(chr[k] == ' ') {

                if(flag){
                    j = n-1;  flag = false; // end
                }

                i = k+1;  // start
                for(int l = i;l<=j;l++) {
                    res[r++] = chr[l];
                }
                res[r++] = ' ';
                j = k-1; // end
            }

            if(k == 0){
                i = k;
                for(int l = i;l<=j;l++) {
                    res[r++] = chr[l];
                }
            }
        }

        System.out.println(res);


    }
}
