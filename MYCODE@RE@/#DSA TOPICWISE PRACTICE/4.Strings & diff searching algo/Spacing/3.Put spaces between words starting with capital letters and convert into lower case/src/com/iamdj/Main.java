package com.iamdj;

public class Main {

    public static void main(String[] args) {

        String str = "HelloIAmDeepakJaiswal";
        char[] chr = str.toCharArray();
        int n = chr.length;

        str = "";
        for(int i=0;i<n;i++) {
            if(Character.isUpperCase(chr[i])) {
             str += " ";  // add space before upper case
            }
            str += chr[i]; // add all characters int string.
        }

        System.out.println(str);
    }
}
