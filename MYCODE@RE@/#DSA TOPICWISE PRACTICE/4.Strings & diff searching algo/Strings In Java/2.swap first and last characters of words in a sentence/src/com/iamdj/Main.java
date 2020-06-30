package com.iamdj;


/**
 * My Method:
 * Time complexity: O(n), where n is size of string.
 * Auxiliary Space : O(1)
 */
public class Main {

    public static void main(String[] args) {

        String str = "Java program to swap first and last characters of words in a sentence";
        char[] chr = str.toCharArray();

       int k = 0; // k store first character of words
       for(int i=0;i< chr.length;i++) {

           if(i == 0) {
               k = 0; continue;
           }

           if(chr[i] == ' ') {
               char temp = chr[i-1];   // temp store last character of words
               chr[i-1] = chr[k];
               chr[k] = temp;
               k = i+1;  // again store first character of words
           }

           if( i == chr.length-1){  // This code help to swap last character of last word to first character of last word.
               char temp = chr[i];
               chr[i] = chr[k];
               chr[k] = temp;
           }
       }

        str = new String(chr); // again, converting character array to string.

        System.out.println(str);

        
    }
}
