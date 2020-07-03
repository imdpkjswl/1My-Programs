package com.iamdj;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] str = {"India", "I", "from", "am"};

        // Apply bubble sort
        for(int j=1;j<str.length;j++) {
            for(int i=0;i<str.length-j;i++) {
                if(str[i].length() > str[i+1].length()) {
                    String temp;
                    temp = str[i];
                    str[i] = str[i+1];
                    str[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(str));
    }
}
