package com.iamdj;

public class Main {

        // Converts a string to uppercase
        static String toUpper(char[] chr) {
            for (int i = 0; i < chr.length; i++)
                if ('a' <= chr[i] & chr[i] <= 'z')
                    chr[i]  &=  ~(1 << 5); // 2^5 = 32 (difference between lower & upper case)
            return String.valueOf(chr);
        }

        // Driver code
        public static void main(String[] args) {
            String str = "deepakForDeepak";
            System.out.println(toUpper(str.toCharArray()));
        }

}
