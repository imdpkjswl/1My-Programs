package com.iamdj;

public class Main {

    public static void main(String[] args) {

        String str = "deePak Jaiswal";
        char[] chr = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {
            //if ('a' <= chr[i] && chr[i] <= 'z')
            if (Character.isLowerCase(chr[i])) {
                chr[i] = (char) (chr[i] - 'a' + 'A');
            }
        }

        System.out.println(new String(chr));
    }
}
