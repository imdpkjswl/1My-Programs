package com.iamdj;

import java.util.HashSet;

public class Main {

    // For getting the unique permuted string
    static HashSet<String> unique = new HashSet<>();
    static void permutations(String str, int l, int r) {
        if(l == r){
            if(unique.contains(str)) return; // check for uniqueness

            unique.add(str); // add all permuted string
            System.out.println(str);
            return;
        }

        for(int i=l; i<=r;i++) {
            // Interchanging the string characters
            str = interChangeChar(str, l, i); // interchange
            permutations(str, l+1, r);  // permute
            str = interChangeChar(str, l, i);  // get again previous string
        }
    }

    static String interChangeChar(String str, int a, int b) {
        char[] chr = str.toCharArray();

        char temp = chr[a];
        chr[a] = chr[b];
        chr[b] = temp;

        return String.valueOf(chr);
    }

    public static void main(String[] args) {

        String str= "abcd";

        permutations(str,0,str.length()-1);
    }
}
