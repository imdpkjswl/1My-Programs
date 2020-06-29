package com.iamdj;

public class Main {

    public static void main(String[] args) {

        String strPool = "HelloWorld"; // create string only in string pool
        String strObject = new String("HelloWorld"); // create string in both string object area and string pool

        // Returns the number of characters in the String
        int strLength = strObject.length();
        System.out.println(strLength);

        // Returns the character at ith index
        char chr = strObject.charAt(5);
        System.out.println(chr);

        // Return the substring from the ith index character to end
        String subStr = strObject.substring(5);
        System.out.println(subStr);

        // Returns the substring from i to j-1 index
        subStr = strObject.substring(0,5);
        System.out.println(subStr);

        // return Concatenates specified string to the end of the string
        String s1 = "Deepak";
        String s2 = "Jaiswal";
        String conStr = s1.concat(s2);
        System.out.println(conStr);

        // Returns the index within the string of the first occurrence of the specified string
        int index = conStr.indexOf("Jai");
        System.out.println("String index: "+index);

        // Returns the index within the string of the last occurrence of the specified string
        int lastIndex = conStr.lastIndexOf("a");
        System.out.println(lastIndex);

        // Compares the string to the specified object
        boolean ans = "Deepak".equals("deepak");
        System.out.println(ans);
        ans = "Deepak".equals("Deepak");
        System.out.println(ans);

        // Compares string to another string, ignoring case considerations
        ans = "Deepak".equalsIgnoreCase("deepak");
        System.out.println(ans);

        // Compares two string lexicographically
        s1  = "Deepak";
        s2  = "deepak";
        int out = s1.compareTo(s2);
        System.out.println(out);
        /*
            This returns difference s1-s2. If :
                out < 0  // s1 comes before s2
                out = 0  // s1 and s2 are equal.
                out > 0   // s1 comes after s2.
         */

        // Compares two string lexicographically, ignoring case considerations
        out = s1.compareToIgnoreCase(s2);
        System.out.println(out);

        // Converts all the characters in the String to lower case
        String lower = s1.toLowerCase();
        System.out.println(lower);

        // Converts all the characters in the String to lower case
        String upper = s1.toUpperCase();
        System.out.println(upper);

        // Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        String s = "  Deepak Jaiswal   ";
        s = s.trim();
        System.out.println(s);

        // Returns new string by replacing all occurrences of oldChar with newChar.
        s = "Jeepak Jaiswal";
        s = s.replace('J', 'D'); // replace character J by D.
        System.out.println(s);
        s = s.replace("Daiswal","Jaiswal"); // replace string Daiswal to Jaiswal.
        System.out.println(s);

        // return true if Sub string in original string
        boolean result = s.contains("Swal");
        System.out.println(result);
        result = s.contains("swal");
        System.out.println(result);

    }
}
