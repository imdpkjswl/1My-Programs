package com.iamdj;

/**
 * Time Complexity:  O(n^2)
 * Auxiliary Space:  O(1)
 */
/*
public class Main {

    static int countSubStringWithEqualEnds(String s) {
        int result = 0;
        int n = s.length();

        // Iterating through all substrings in way so that we can find first and last character easily
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (s.charAt(i) == s.charAt(j))  // starting index and ending index of of sub string must be same including individual characters.
                    result++;

        return result;
    }

    // Driver function
    public static void main(String args[]) {

        String str = "abcab";
        System.out.println(countSubStringWithEqualEnds(str));
    }
}
*/

/**
Best approach: Now if we carefully observe then we can realize that the answer just depends on frequencies of characters
               in the original string. For example in string abcab, frequency of ‘a’ is 2 and substrings contributing to
               answer are a, abca and a respectively, a total of 3, which is calculated by (frequency of ‘a’+1)C2.

 *Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Main {

    // assuming lower case only
    static final int MAX_CHAR = 26;

    static int countSubStringWithEqualEnds(String s) {
        int result = 0;
        int n = s.length();

        // Calculating frequency of each character in the string.
        int[] count =  new int[MAX_CHAR]; // Using as a Hash Table
        for (int i = 0; i < n; i++)
            count[s.charAt(i)-'a']++;   // Storing integer value of difference of ith character minus 'a'.

        // Computing result using counts
        for (int i = 0; i < MAX_CHAR; i++)
            result += (count[i] * (count[i] + 1) / 2); // Applying formula

        return result;
    }

    // Driver function
    public static void main(String args[]) {
        String s = "abcab";
        System.out.println(countSubStringWithEqualEnds(s));
    }
}
