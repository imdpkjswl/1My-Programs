package com.iamdj;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static int Insert_at_pos(int a[],int n,int item,int pos)
    {
        int i;

        if(pos>=n || pos<0) // Checking valid position or not
        {
            System.out.println("Invalid Position\n");
            return n; // return same length due to no change occurs.
        }

        for(i=n-1;i>=pos;i--) // Shifting elements from left to right
        {
            a[i+1]=a[i];
        }

        a[pos] = item; // Assigned item.

        return (n+1); // Length incremented by 1 due to insertion.
    }

    static int Delete_at_pos(int a[],int n,int item,int pos)
    {
        int i;

        if(pos>=n || pos<0) // Checking valid position or not
        {
            System.out.println("Invalid Position\n");
            return n; // return same length due to no change occurs.
        }

        System.out.println("Item is Deleted :  "+a[pos]);

        for(i=pos;i<=n-2;i++) // Shifting elements from right to left
        {
            a[i]=a[i+1];
        }

        return (n-1); // Length incremented by 1 due to insertion.
    }

    static void  read_array(int a[] , int n) // scanning and storing elements into an array.
    {
        int i;
        Scanner obj1 = new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            a[i] = obj1.nextInt();
        }
    }

    static void print_array(int a[] , int n) // displaying an elements from an array.
    {
        int i;

        Scanner obj2 = new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            System.out.println("  " +a[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[] a = new int[20];
        int choice,n=0,item = 0,pos;

        // Item is not inserted at any point than 0th position due to initialization item =0.

        Scanner obj = new Scanner(System.in);


        for(;;)
        {

            System.out.println("1.Read array\n");
            System.out.println("2.Print array\n");
            System.out.println("3.Insert array at pos\n");
            System.out.println("4.Delete array at pos\n");
            System.out.println("5.Exit\n");

            System.out.println("ENTER YOUR CHOICE\n");
            choice = obj.nextInt();

            switch(choice)
            {

                case 1: System.out.println("Enter the number of elements\n");
                    n = obj.nextInt();

                    System.out.println("Enter " +n+" elements\n");

                    read_array(a,n);
                    break;

                case 2: if (n == 0) // Check array is empty or not.
                    System.out.println("Array is empty\n");
                else
                {
                    System.out.println("The elements of arrays are :\n");
                    print_array(a,n);
                }
                    break;

                case 3: System.out.println("Enter the item to be inserted\n");
                    System.out.println(item);

                    System.out.println("Enter the position of array where the item insert\n");
                    pos= obj.nextInt();
                    n=Insert_at_pos(a,n,item,pos);
                    break;

                case 4: System.out.println("Enter the position to delete an element\n");
                        pos = obj.nextInt();

                    if (n == 0) // Check array is empty or not.
                        System.out.println("Array is empty,First insert or read array\n");
                    else
                        n=Delete_at_pos(a,n,item,pos);

                    break;

                default : exit(0);


            }

        }


    }
}
