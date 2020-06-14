package com.company;

import java.util.*;

/**
 * Using Collection Framework:
 * Time Complexity: O(nLog(n))
 * Space complexity: O(n)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the total number of elements:");
        n = sc.nextInt();
        //List<String> numbers = Arrays.asList("10", "68", "97", "9", "21", "12"); // For array.

        List<String> numbers = new LinkedList<>(); // using list.
        for(int i=0;i<n;i++)
            numbers.add(sc.next());

        // sort using a custom function object
        Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        // print the sorted sequence
        numbers.stream().forEach(System.out::print);
    }
}
*/

/**
 * time complexity: O(n^2)  // Bubble sort Approach
 * space complexity: O(1)
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the total number of elements:");
        n = sc.nextInt();
        String[] a = new String[n];

        for(int i=0;i<n;i++) a[i] = sc.next();

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                // Converting string into integer by xy and yx format.
                if(Integer.parseInt(a[j] + a[j+1]) < Integer.parseInt(a[j+1] + a[j])){
                    // Perform swapping
                    String t = a[j];
                        a[j] = a[j+1];
                        a[j+1] = t;
                }
            }
        }

        System.out.println("Below combination form the Biggest number:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }
}




// SAME QUESTION CAN BE SOLVED USING BRUTE FORCE
/** Brute Force Approach: Generating all possible arrangement
 * time complexity: O(n!)
 * space complexity: O(1)
 */