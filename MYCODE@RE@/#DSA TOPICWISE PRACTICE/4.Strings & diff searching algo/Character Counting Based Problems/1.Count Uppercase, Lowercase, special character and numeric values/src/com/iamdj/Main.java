package com.iamdj;

/**
 * Approach :
 1.Scan string str from 0 to length-1.
 2.check one character at a time on the basis of ASCII values
  * if(str[i] >= 65 and str[i] <=90), then it is uppercase letter,
  * if(str[i] >= 97 and str[i] <=122), then it is lowercase letter,
  * if(str[i] >= 48 and str[i] <=57), then it is number,
  * else it is a special character
 3.Print all the counters.

 *Time Complexity: O(n)
 */

public class Main {

    public static void main(String[] args) {

        String str = "2@Deepak2YouC@n$@y4";
        char[] chr = str.toCharArray();

        int upper =0;
        int lower =0;
        int number =0;
        int special =0;
        for(int i=0;i<chr.length;i++) {

            if(chr[i] >= 'A' && chr[i] <= 'Z') {
                upper++;
            }
            else if(chr[i] >= 'a' && chr[i] <= 'z') {
                lower++;
            }
            else if(chr[i] >= '0' && chr[i] <= '9') {
                number++;
            }
            else{
                special++;
            }
        }


        System.out.println("Upper Case: "+upper);
        System.out.println("Lower Case: "+lower);
        System.out.println("Numeric value: "+number);
        System.out.println("Special Character: "+special);
    }
}

/*

Input:
"2@Deepak2YouC@n$@y4"

Output:
Upper Case: 3
Lower Case: 9
Numeric value: 3
Special Character: 4

 */