package com.iamdj;

public class Main {

    public static void main(String[] args) {

        String str = "drrpakfoedrrpak";
        char[] chr = str.toCharArray();
        int n = chr.length;
        char r1 = 'r';
        char r2 = 'e';

        for(int i=0;i<n;i++) {

            if(chr[i] == r1) {
                chr[i] = r2;
            } else if(chr[i] == r2) {
                chr[i] = r1;
            }
        }

        System.out.println(new String(chr));


    }
}
