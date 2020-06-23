package com.iamdj;

import java.util.Scanner;

/**
 * Definition: A Smith Number is a composite number whose sum of digits is equal to the sum of digits in its prime factorization.
 * Note: Prime factors must be more the one due to composite number property.that's why , we used counter over there.
 * Time complexity: O(n^2), due to double for loop.
 * Auxiliary space : O(1)
 */
public class Main {

    static boolean isPrime(int n) {
        if(n <= 1)return false;

        for (int i=2;i<n;i++){
            if(n % i == 0)
                return false; // not prime
        }
        return  true;  // prime
    }


    static int digitSum(int n) {
        if(n < 10)
            return n;

        int sum = 0;
        while(n!=0){
            int t = n % 10;
            sum += t;
            n = n/10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();
        int nSum = digitSum(n);
        System.out.println("The sum digits of n is:  "+nSum);

        int counter = 0; // Used to check to composite number or not
        int temp = n;

        System.out.print("The prime factors are:   ");
        int primeSum = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                if(temp % i == 0) {  // check divisibility of given n by i prime number.
                    temp = temp / i;
                    System.out.print(i+"  ");
                    int s = digitSum(i);  // method to find the sum of digits.
                    primeSum += s;

                    counter++;
                    i = i - 1; // used to check that i can also divide the new value of n or not.
                }
            }
        }
        System.out.println("\nThe sum of prime factors: "+primeSum);

        if(nSum == primeSum && counter != 1)  // counter != 1 shows that answer must be composite number.
            System.out.println("\nYES, "+n+" is a Smith Number");
        else
            System.out.println("\nNO, "+n+" is not a Smith Number");

    }
}
