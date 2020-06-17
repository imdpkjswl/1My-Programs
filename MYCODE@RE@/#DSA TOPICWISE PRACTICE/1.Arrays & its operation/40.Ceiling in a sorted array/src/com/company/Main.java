package com.company;

import java.util.Scanner;

/**
 * Naive method:
 * Must Satisfy these conditions:
 * 1. floor <= x , where x is any arbitrary value.
 * 2. x <= ceil i.e.   floor <= x <= ceil
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();
        System.out.println("Enter the value of x:");
        int x = in.nextByte();

        int i;
        for(i=0;i<n;i++){
            if(x <= arr[i]){
                break;    // break and ith index will be ceil value iff x in range.
            }
        }
        if(i == n) {  // if x doesn't lies(beyond range) in array value range.
            i--;
        }


        int ceil = arr[i];  // x lies in array value range.
        int floor = -1;  // just initialized.
        boolean flag1 = false;   // Both flags are used to differentiate between beyond range and undergo range.

        if(x > ceil){  // used bcuz x beyond the value range But floor exist.
            System.out.println("Ceiling of "+x+" doesn't exist.");
            floor = arr[i];
            flag1 = true;  // used to know ceil exist or not. and also used for judging floor value.
        }else
            System.out.println("Ceiling of "+x+" is: "+ceil);  // If it is executing means x in range.


        boolean flag2 = false;
        if(i ==0){
            floor = arr[i];
            flag2 = true;   // used to know floor exist or not.
            if(x >=floor ){
                System.out.println("Floor value of "+x+" is: "+floor);
            }else {
                System.out.println("Floor value of "+x+" doesn't exist.");
            }

        }else {
            if(!flag1) {   // used to d find floor and x in range.
                floor = arr[i - 1];
            }
        }

        if(!flag2){
            System.out.println("Floor value of "+x+" is: "+floor);
        }





    }
}