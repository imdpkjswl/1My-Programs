package com.iamdj;
import java.lang.*;

/**
 * Time complexity: O(n)
 */
public class Main {

    public static void main(String[] args) {
	    String str = "Deepak kumar Jaiswal";
	    char[] chr = str.toCharArray(); // convert string into character array.



	    int i=0;
	    if(chr[i] != ' ')
            System.out.println(chr[0]);  // first character may be Letter.

	    while(i < chr.length){
            if(chr[i] == ' ' && chr[i+1] != ' '){
                System.out.println(chr[i+1]);
            }
            i++;
        }

    }
}
