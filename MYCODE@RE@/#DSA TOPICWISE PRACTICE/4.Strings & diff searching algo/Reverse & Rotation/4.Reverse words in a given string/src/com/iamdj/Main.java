package com.iamdj;

public class Main {

        public static void main(String[] args) {

            String[] str = "i like coding very much".split(" "); // dividing string into substring
            String ans = ""; // store reversed string

            for (int i = str.length - 1; i >= 0; i--)  // starting from last index of string array.
                ans += str[i] + " "; // this statement will add an extra space at the last of string.(Avoid later)


            System.out.println("Reversed String:");
            System.out.println(ans);

            //System.out.println(ans.substring(0, ans.length() - 1));
        }

}
