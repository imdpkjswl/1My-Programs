package com.iamdj;

class Main {

    static int findCount(String str) {
        char[] chr = str.toCharArray();
        int result = 0;

        char j = 'A';
        char i = 'a';
        // Traverse input string
        for (int k = 0; k < chr.length; k++) {
            if (i == chr[k] || j == chr[k])
            {
                result++;
            }
            j++;
            i++;
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "AbgdeF";
        System.out.print(findCount(str));
    }
}