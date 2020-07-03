package com.iamdj;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    // Function for alternate sorting of string
    public static void alternateSort(String str) {
        int n = str.length();

        char[] chr = str.toCharArray();

        // Count occurrences of individual lower case and upper case characters
        char[] lCount = new char[20];
        char[] uCount = new char[10];

        int l = 0, u = 0;
        for (int i = 0; i < n; i++) {

            if (Character.isUpperCase(chr[i]))
                uCount[u++] = chr[i];
            else
                lCount[l++] = chr[i];
        }

        // Bubble sort for lower case
        for(int j=1;j<l;j++){
            for(int i=0;i<l-j;i++){
                if(lCount[i] > lCount[i+1]){
                    char temp;
                    temp = lCount[i];
                    lCount[i] = lCount[i+1];
                    lCount[i+1] = temp;
                }
            }
        }

        // Bubble sort for Upper case
        for(int j=1;j<u;j++){
            for(int i=0;i<u-j;i++){
                if(uCount[i] > uCount[i+1]){
                    char temp;
                    temp = uCount[i];
                    uCount[i] = uCount[i+1];
                    uCount[i+1] = temp;
                }
            }
        }

        int a =0, b=0;
        // Print alternatively
        while( a < l || b < u) {
            if(a<l)
                System.out.print(lCount[a++]);

            if(b<u)
                System.out.print(uCount[b++]);
        }
    }

        public static void main(String argc[]){

            String str = "bAwutndekWEdkd";

            alternateSort(str);
        }

}
