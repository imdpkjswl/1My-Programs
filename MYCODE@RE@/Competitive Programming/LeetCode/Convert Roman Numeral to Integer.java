package com.deepakjaiswal2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int romanToInteger(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for(int i=0;i<roman.length();i++) {
            if(i>0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i-1))) {
                result += map.get(roman.charAt(i)) - 2*map.get(roman.charAt(i-1));
            } else {
                result += map.get(roman.charAt(i));
            }
        }

        return result;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String roman = in.next();

        int result = romanToInteger(roman);
        System.out.println(result);
    }
}
