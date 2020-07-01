package com.iamdj;

// Java program to calculate sum of all numbers present in a string containing alphanumeric characters
class Main {

    // Function to calculate sum of all numbers present in a string containing alphanumeric characters
    static int findSum(String str) {
        // A temporary string
        String temp = "";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Treating string as a character array.

            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;

                // if current character is an alphabet
            else
            {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }

        // atoi(temp.c_str()) takes care of trailing number
        return sum + Integer.parseInt(temp);
    }

    // Driver code
    public static void main (String[] args) {

        // input alphanumeric string
        String str = "1d2abc30yz68";

        System.out.println(findSum(str));
    }
}