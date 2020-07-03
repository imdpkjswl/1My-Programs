package com.iamdj;

class Main {

    // function that rotates s towards left by d
    static String leftRotate(String str, int d) {

        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    // function that rotates s towards right by d
    static String rightRotate(String str, int d) {

        return leftRotate(str, str.length() - d);
    }

    // Driver code
    public static void main(String args[]) {

        String str1 = "YouForMe";
        System.out.println(leftRotate(str1, 2));

        String str2 = "MeForYou";
        System.out.println(rightRotate(str2, 2));
    }
}