package com.company;

import java.util.Scanner;

/**
 * Time complexity: O(n)
 * Space complexity: O(d)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int[] temp = new int[20];
        int  d;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("How many rotation you want:");
        d = sc.nextInt();

        // Store the first d elements in temp array
        if (d >= 0) System.arraycopy(arr, 0, temp, 0, d);

        // Shift the rest of the element by d times
        for(int j=0;j<n-d;j++){
            arr[j] = arr[j+d];
        }


        // Store back the d elements into arr[]
        int j=0;
        for(int i=n-d;i<n;i++){
            arr[i] = temp[j++];
        }

        // Print the all elements
        System.out.println("The rotated elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");




    }
}
*/



/** Method 2
 * Time complexity: O(n)
 * Auxiliary space: O(1)
 */
/*
public class Main {

    static int gcd(int a, int b){
        if(b==0)
            return a;

        return gcd(b, a%b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int  d;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("How many rotation you want:");
        d = sc.nextInt();



        // To handle if d>=n
        d = d %n;
        int gcd = gcd(d,n);

        for(int i=0;i<gcd;i++){
            // Move ith value.
            int temp = arr[i];
            int j = i;

            while(true){
                int k= j+d;
                if(k>=n){
                    k = k-n;
                }

                if(k==i)
                    break;

                arr[j] = arr[k];
                j = k;

            }
            arr[j] = temp;
        }



        // Print the all elements
        System.out.println("The rotated elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");




    }
}
*/

/** Method 3
 * Time complexity: O(n*d)
 * Auxiliary space: O(1)
 */
public class Main {

    static int gcd(int a, int b){
        if(b==0)
            return a;

        return gcd(b, a%b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int  d;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("How many rotation you want:");
        d = sc.nextInt();


        for(int i=0;i<d;i++){ // Iterating d times
            int temp = arr[0];  // selecting first index item each time
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];  // // Shifting array items left by one position
            }
            arr[n-1]  = temp;  // assigning first index item to the last of array
        }


        // Print the all elements
        System.out.println("The rotated elements are:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");




    }
}
