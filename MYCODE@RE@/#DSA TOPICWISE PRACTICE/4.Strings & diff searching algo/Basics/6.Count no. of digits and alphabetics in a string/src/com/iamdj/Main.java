package com.iamdj;

public class Main {

    // Returns true if s is a number else false
    static void countDigitAndAlpha(String str) {

        int countDigit = 0;
        int countAlpha = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                countDigit++;


        for (int i = 0; i < str.length(); i++)
            if (Character.isAlphabetic(str.charAt(i)))
                countAlpha++;


        System.out.println("Total digits: "+countDigit);
        System.out.println("Total alpha: "+countAlpha);

    }

    // Driver code
    static public void main (String[] args) {

        // Saving the input in a string
        String str = "Deepak2020";

        System.out.println("\""  +str+  "\""+" string contains");
        countDigitAndAlpha(str);

    }

}
