package com.iamdj;

public class Main {
    static boolean isReversible(String str) {
        char[] chr = str.toCharArray(); // convert string into character array.
        char[] revChr = new char[chr.length]; // used to store reverse of character array.

        int k =0;
        for(int i = chr.length-1;i>=0;i--)
            revChr[k++] = chr[i]; // copying from last index to revChr

        String revStr = new String(revChr); // again,converting character array to string.

        if(str.equals(revStr)) // compare both strings
            return true;  // reversible or palindromic
        else
            return false; // not reversible
    }
    public static void main(String[] args) {

        String str = "ababA";
        if(isReversible(str))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
