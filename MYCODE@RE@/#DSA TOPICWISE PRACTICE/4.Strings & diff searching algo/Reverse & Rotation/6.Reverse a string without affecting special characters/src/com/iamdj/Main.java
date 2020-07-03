package com.iamdj;

class Main {
    public static void reverse(char[] chr) {

        // Initialize left and right pointers
        int r = chr.length - 1, l = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {

            // Ignore special characters
            if (!Character.isAlphabetic(chr[l]))
                l++;
            else if(!Character.isAlphabetic(chr[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {

                char temp = chr[l];
                chr[l] = chr[r];
                chr[r] = temp;
                l++;
                r--;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {

        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }
}
