package com.iamdj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
/*
public class Main {

    public static void main(String[] args) {

        String str = "Hello World";
        char[] chr = str.toCharArray();

        char [] result = new char [str.length()];

        // Store result in reverse order into the result.
        for (int i = 0; i<chr.length; i++)
            result[i] = chr[chr.length-i-1];

        System.out.println(result);

    }
}
*/

// In-Built method for reversing string:
class Main {
    public static void main(String[] args) {
        String str = "deepak for deepak";

        StringBuilder input = new StringBuilder();

        // append a string into StringBuilder input1
        input.append(str);

        // reverse StringBuilder input1
        input = input.reverse();

        // print reversed String
        System.out.println(input);
    }
}