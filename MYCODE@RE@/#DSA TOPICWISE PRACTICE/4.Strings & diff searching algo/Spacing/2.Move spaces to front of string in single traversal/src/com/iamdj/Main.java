package com.iamdj;

public class Main {

    public static void main(String[] args) {

        String str = "hello how are you brother?";
        char[] chr = str.toCharArray();
        int n = chr.length;

        str = "";
        for(int i=0;i<n;i++) {
            if(chr[i] == ' '){
                str += chr[i];
            }
        }

        for(int i=0;i<n;i++) {
            if(chr[i] == ' '){
                continue;
            }
            str += chr[i];
        }

        System.out.println(str);
    }
}
