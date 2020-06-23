package com.iamdj;

import java.util.Scanner;

/**
 * Time complexity: O(n)
 * Auxiliary space: O(1)
 */
public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter value of n:");
	    int n = in.nextInt();

	    System.out.println("The all divisor of "+n+" is:  ");
	    for(int i=1;i<=n;i++){
	        if(n%i == 0){
	            System.out.print(i+" ");
            }
        }



    }
}
