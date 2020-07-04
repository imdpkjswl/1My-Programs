package com.iamdj;

/**
 * Time complexity: O(n)
 */
public class Main {

    public static void main(String[] args) {

        String str = "deePak JaiSwal";
        char[] chr = str.toCharArray();

        for(int i=0;i<chr.length;i++) {

            if(chr[i] >= 'a' && chr[i] <= 'z'){
                chr[i] = (char)(chr[i] - 'a' + 'A');
            }
            else if(chr[i] >= 'A' && chr[i] <= 'Z'){
                chr[i] = (char)(chr[i] - 'A' + 'a');
            }
        }

        System.out.println(new String(chr));

    }
}
