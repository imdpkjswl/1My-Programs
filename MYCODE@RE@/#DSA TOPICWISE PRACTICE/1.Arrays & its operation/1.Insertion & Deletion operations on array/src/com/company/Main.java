package com.company;

import java.util.*;

public class Main {

    public static int insertAtPos(int[] arr, int n, int item, int pos){

        if(pos<0 || pos>n){
            System.out.println("Invalid position entered");
            return n;
        }
        if(n==0 && pos == 0){
            arr[pos] = item;
            System.out.println(arr[pos] + " is inserted.");
            return (n+1);
        }

        for(int i=n-1;i>=pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = item;
        System.out.println(arr[pos]+" is inserted.");
        return (n+1);
    }

    public static int deleteAtPos(int[] arr, int n, int pos){
        if(pos<0 || pos>n){
            System.out.println("Invalid position entered");
            return n;
        }
        System.out.println(arr[pos]+" is deleted.");
        for(int i=pos;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        return (n-1);
    }

    public static void displayArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[20];
        int item;
        int pos;
        byte ch;

        System.out.println("Enter the initially no. of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        while(true){
            System.out.println("1.Insert at any position:");
            System.out.println("2.Delete at any position:");
            System.out.println("3.Display the array elements:");
            System.out.println("4.Exit\nEnter your choice:");
            ch = sc.nextByte();

            switch (ch){
                case 1:
                    System.out.println("Enter the item to be inserted:");
                    item = sc.nextInt();
                    System.out.println("Enter the valid position:");
                    pos = sc.nextInt();
                    pos = pos-1;
                    n = insertAtPos(arr, n, item, pos);
                    break;

                case 2:
                    System.out.println("Enter the valid position to delete element:");
                    pos = sc.nextInt();
                    pos = pos-1;
                    if(n==0){
                        System.out.println("Array is empty");
                        break;
                    }
                    n = deleteAtPos(arr, n, pos);
                    break;

                case 3:
                    System.out.println("The array elements are:");
                    displayArray(arr,n);
                    break;

                case 4:
                    System.exit(0);

            }

        }
        
    }
}
