package com.iamdj;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    static void swap(ArrayList<Integer> a, int i, int j){
        int temp;
        temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

    public static void main(String[] args) {

        int[] num = {123, 234, 456, 1232, 32145,12311};
        int n = num.length;
        ArrayList<Integer> temp = new ArrayList<>();

        boolean one,two,three;
        one = two = three = false;  // check for availability of 1,2 and 3.

        for(int i=0;i<n;i++) {
            int d = num[i];

            while(d != 0){  // check each number contain 1,2 and 3 or not.
                int rem = d% 10; // remainder

                if(rem== 1){
                    one = true;
                }else if(rem == 2){
                    two = true;
                }else if(rem == 3){
                    three = true;
                }
                d = d/10;  // Remove last digit
            }
            if(one  && two && three){
                temp.add(num[i]);  // add number that contain 1,2 and 3.
            }
            one = two = three = false;

        }

        // Bubble sort
        for(int k=1;k<temp.size();k++) {
        for(int i=1;i<temp.size();i++){
            if(temp.get(i-1) > temp.get(i)){
                swap(temp,i-1,i);
            }
        }}

        // Print number in ascending order
        System.out.println("Numbers in ascending order which contain 1,2 & 3 digits:");
        for(int i=0;i<temp.size();i++){
            System.out.print(temp.get(i)+" ");
        }

    }
}
