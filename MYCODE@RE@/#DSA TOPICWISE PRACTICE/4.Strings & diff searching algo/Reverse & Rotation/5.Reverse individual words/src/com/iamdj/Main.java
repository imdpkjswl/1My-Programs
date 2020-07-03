package com.iamdj;

/**
 * Time complexity: O(n^2)
 * Space complexity: O(n)
 */
public class Main {

    public static void main(String[] args) {

        String[] str = "Hello World".split(" "); // dividing string into substring
        int n = str.length;
        String ans = ""; // store reversed string

        for (int i = 0; i < n; i++) {
            char[] chr = str[i].toCharArray(); // converting each substring into character array.

            for(int j=chr.length-1; j>=0; j--)
                ans += chr[j];  // reversing substring.

            if(i != n-1)  // remove extra space to adding at last.
                ans += " ";
        }

        System.out.println("Reversed individual substring:");
        System.out.println(ans);
    }

}
