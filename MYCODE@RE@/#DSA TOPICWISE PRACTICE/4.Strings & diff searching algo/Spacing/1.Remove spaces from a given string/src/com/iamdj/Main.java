package com.iamdj;

//Expected time complexity is O(n) and only one traversal of string
public class Main {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder(" hello  who     are y ou ");
        char[] chr = str.toString().toCharArray();
        int n = chr.length;
        str = new StringBuilder();
        for(int i=0;i<n;i++) {
            if(chr[i] == ' ')
                continue;
            str.append(chr[i]);
        }

        System.out.println(str);


    }
}
