package com.iamdj;

/*
public class Main {

    static void copyCharacters(char[] s1, char[] s2) {

        for(int i=0;i< s1.length ;i++) {
            s2[i] = s1[i];
        }

    }

    public static void main(String[] args) {

        char[] s1 = "HelloWorld".toCharArray();
        char[] s2 = new char[50];

        copyCharacters(s1, s2);
        System.out.println(String.valueOf(s2));


    }
}
*/


class Main {

    // Function to copy one string in to other using recursion
    static void myCopy(char[] s1, char[] s2, int index) {

        // copying each character from s1 to s2
        s2[index] = s1[index];

        // if string reach to end then stop
        if (index == s1.length - 1) {
            return;
        }

        // increase character index by one
        myCopy(s1, s2, index + 1);
    }

    // Driver Code
    public static void main(String[] args) {

        char s1[] = "HelloWorld".toCharArray();
        char s2[] = new char[s1.length];
        int index = 0;
        myCopy(s1, s2, index);
        System.out.println(String.valueOf(s2));
    }
}