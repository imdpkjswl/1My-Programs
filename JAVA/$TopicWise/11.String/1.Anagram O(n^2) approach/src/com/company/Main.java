package com.company;

/**
 * This Program have O(n^2) complexity, The better ways is to solve this is, Sort the both string and compare them.
 */
public class Main {

    public static void main(String[] args) {

        String a = "catac";
        String b = "acta";

        boolean isAnagram = false;  // initially suppose strings are not anagram.
        boolean[] visited = new boolean[20]; // used for character frequency management of string

        if(a.length() == b.length()) {  // Anagram must have same length
                for (int i = 0; i < a.length(); i++) {
                    char c = a.charAt(i);   // taking one character from string 'a' each time
                    isAnagram = false;
                    for (int j = 0; j < b.length(); j++) {
                        if (b.charAt(j) == c && !visited[j]) {  // check string 'b' jth character is matching with ith character of string 'a'
                            visited[j] = true;
                            isAnagram = true;
                            break;
                        }
                    }
                    if (!isAnagram)  // after
                        break;
                }
        }



        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
