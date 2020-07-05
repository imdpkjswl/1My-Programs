package com.iamdj;


import java.util.Arrays;

/**Method 1 (Use Sorting):
   1.     Sort both strings
   2.     Compare the sorted strings
 * Time Complexity: O(nLog(n))
*/
/*
public class Main {

    static boolean isAnagram(char[] c1, char[] c2) {

        // Sort both character array
        Arrays.sort(c1);
        Arrays.sort(c2);

        String s1 = new String(c1);
        String s2 = new String(c2);

        // Compare boh string
        if (s1.equals(s2))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        char[] str1 = { 't', 'e', 's', 't' };
        char[] str2 = { 't', 't', 'e', 'w' };

        if (isAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");

    }
}
*/

/** Method 2 (Count characters)
    Time complexity: O(n)
 */

public class Main {

    static boolean isAnagram(char[] c1, char[] c2) {
        int[] table1 = new int[127];
        int[] table2 = new int[127];

        Arrays.fill(table1,0);
        Arrays.fill(table2,0);

        for(int i=0;i<c1.length;i++) {
            table1[(int)c1[i]]++;
        }

        for(int i=0;i<c2.length;i++) {
            table2[(int)c2[i]]++;
        }

        for(int i=0;i<127;i++) {
            if(table1[i] != table2[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        char[] str1 = { 't', 'e', 's', 't' };
        char[] str2 = { 't', 't', 'e', 'w' };

        if (isAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");

    }
}
