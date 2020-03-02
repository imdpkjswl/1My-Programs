package com.iamdj;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // initializing unsorted array
        Object[] arr = {10,2,22,69};

        System.out.println("The unsorted elements are : ");
        System.out.println(Arrays.toString(arr));

        // sorting array in ascending order
        Arrays.sort(arr);

        // let us print all the elements available
        System.out.println("The sorted array is:");

        // By this method, we can print all array elements linearly
        // without use of for loop and length of array...
        System.out.println(Arrays.toString(arr));

        // entering the value to be searched
        int searchVal = 22;

        int retVal = Arrays.binarySearch(arr,searchVal);

        System.out.println("For Verification,The index of element 22 is : " + retVal);
    }
}
