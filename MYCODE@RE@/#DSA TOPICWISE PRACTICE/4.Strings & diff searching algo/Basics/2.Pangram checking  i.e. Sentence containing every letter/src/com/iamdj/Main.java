package com.iamdj;
/* Definition:
Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]

 */

/**
 * My method to compare ascii value to a to z is avail in given sequence of characters,
 * Time complexity: O(n*a) , where a in range [for upper case] 60 to 90 && [for lower case] 97 to 123 inclusive.
 * Space Complexity: O(1)
 */
/*
public class Main {

    public static void main(String[] args) {

        char[] given = "The Quick Brown Fox Jumps Over The Lazy Dog".toCharArray();
        int n = given.length;

        int cmp, count=0;

        int k = 65;
        for(int i =97;i<=123;i++){
            for(int j=0;j<n;j++){
                cmp = ((int) given[j]);
                if(i == cmp || k == cmp){
                    count++;
                    break;
                }
            }
            k++;
        }

        if(count == 26){
            System.out.println("PanGram");
        }
        else
            System.out.println("Not PanGram");

    }
}
 */


/**
 * Time complexity: O(n)
 * Space Complexity: O(1)
 */
// Java Program to illustrate Pangram
class Main {

    // Returns true if the string is pangram else false
    public static boolean checkPangram(String str) {

        // Create a hash table to mark the characters present in the string
        // By default all the elements of mark would be false.
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

                // If lowercase character, subtract 'a' to find index.
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

                index = str.charAt(i) - 'a';

                // If this character is other than english lowercase and uppercase characters.
            else
                continue;

            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return (false);

        // If all characters were present
        return (true);
    }

    // Driver Code
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";

        if (checkPangram(str))
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }
}
