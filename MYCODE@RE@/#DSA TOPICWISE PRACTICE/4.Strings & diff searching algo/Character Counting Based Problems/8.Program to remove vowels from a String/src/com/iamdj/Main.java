package com.iamdj;
/*
public class Main {

    public static void main(String[] args) {
        String str = "what is your name ?";
        char[] chr = str.toCharArray();

        for(int i=0;i<chr.length;i++){
            if(chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u' ||
               chr[i] == 'A' || chr[i] == 'E' || chr[i] == 'I' || chr[i] == 'O' || chr[i] == 'U')
            {
                chr[i] = '#';
            }
        }

        for(int i=0;i<chr.length;i++) {
            if(chr[i] != '#')
                System.out.print(chr[i]);
        }
    }
}
*/

class Main {

    static String remVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "what is your name ?";
        System.out.println(remVowel(str));
    }
}