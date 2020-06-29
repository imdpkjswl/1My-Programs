package com.iamdj;

public class Main {

        // Returns true if s is a number else false
        static boolean isNumber(String str) {

            for (int i = 0; i < str.length(); i++)
                if (!Character.isDigit(str.charAt(i))) // check string contain at least one character or not.
                    return false;

            return true;
        }

        // Driver code
        static public void main (String[] args) {

            // Saving the input in a string
            String str = "g820G";

            // Function returns 1 if all elements are in range '0 - 9'
            if (isNumber(str))
                System.out.println("Integer");

                // Function returns 0 if the input is not an integer
            else
                System.out.println("String");

        }

}
