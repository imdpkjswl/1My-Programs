package com.iamdj;

/*
Given a sentence, task is to rewrite in Google Case. It is a style of writing where we replace
all lower case letters into upper case letters leaving the initial of all the words.
 */
class Main {

    // Function to remove spaces and convert into camel case
    static String convert(String s) {

        int n = s.length();
        String s1 = "";

        s1 = s1 + Character.toLowerCase(s.charAt(0));

        for (int i = 1; i < n; i++) {

            // check for spaces in the sentence
            if (s.charAt(i) == ' ') {
                // conversion into upper case
                s1 = s1 + " " + Character.toLowerCase
                        (s.charAt(i + 1));
                i++;

            }
            // If not space, copy character
            else
                s1= s1 + Character.toUpperCase(s.charAt(i));

        }

        // return string to main
        return s1;

    }

    // Driver code
    public static void main (String[] args) {

        String str = "I may get intern at MicroSoft";
        System.out.println(convert(str));
    }
}