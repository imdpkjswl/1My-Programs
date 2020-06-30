package com.iamdj;

// NOTE: Not working for float value for example: 12e8 but it shows string.
public class Main {

    static boolean isValid(char[] chr) {

        for(int i=0;i<chr.length;i++){

            if(!Character.isDigit(chr[i]) && chr[i] != '.') {
                return  false;// String
            }
        }
        return true; // Integer
    }

    public static void main(String[] args) {

        String str;
        str = "12e38.7";
        char[] chr = str.toCharArray();

        boolean flag = isValid(chr);
        if(!flag)
            System.out.println("String- False"); // Invalid- String
        else
            System.out.println("Integer- True"); // Valid- Integer or Floating


    }
}
