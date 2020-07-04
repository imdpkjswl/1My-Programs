package com.iamdj;
/*
Given a sentence, task is to remove spaces from the sentence and rewrite in Camel case.
It is a style of writing where we don’t have spaces and all words begin with capital letters
 */
public class Main {

    // Function to remove spaces and convert into camel case
    static String convert(String s) {

        // to count spaces
        int cnt= 0;
        int n = s.length();
        char ch[] = s.toCharArray();
        int res_ind = 0;

        for (int i = 0; i < n; i++) {

            // check for spaces in the sentence
            if (ch[i] == ' ') {
                cnt++;
                // conversion into upper case
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                continue;
            }
            // If not space, copy character
            else
                ch[res_ind++] = ch[i];
        }

        // new string will be resuced by the size of spaces in the original string
        return String.valueOf(ch, 0, n - cnt);
    }

    // Driver code
    public static void main(String args[]) {

        String str = "I may get intern at MicroSoft";
        System.out.println(convert(str));
    }
}


/**
 * My method later i can use:
 * 1.First convert all letter of string into lower case.
 * 2.Then,Make Upper case of first letter of word.
 * 3.Split string by space and one by one add into new null string.
 */