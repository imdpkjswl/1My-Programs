package com.iamdj;

public class Main {

        public static void main(String[] args) {

            String str = "   Hello    Developers .  Welcome   to   DestroSoftware   .     ";
            String temp;

            temp = str.replaceAll("\\s+"," ").trim();
            char[] chr = temp.toCharArray();
            int n = chr.length;

            temp= "";
            // removing space before dot
            for(int i = 0; i<n; i++) {
                if(i>0 && Character.isAlphabetic(chr[i-1]) && chr[i] == ' ' && chr[i+1]=='.'){
                    continue;
                }
                temp += chr[i];
            }

            System.out.println(temp);
        }
}
