package com.iamdj;

// Applying Linear Search: O(n)
public class Main {

    public static void main(String[] args) {

        String[] str = {"hello","","i","am","deepak"};
        String key = "am";

        for(int i=0; i<str.length; i++) {
            if(key.equals(str[i])) {
                System.out.println("String found");
                return;
            }
        }

        System.out.println("String not found");
    }
}
