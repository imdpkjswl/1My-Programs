/*
    * Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared
    * and the elements are swapped if they are not in order. This algorithm is not suitable for large data sets as its average and worst case complexity
    * are of &Omicron;(n2) where n is the number of items.

    Algorithm
We assume list is an array of n elements. We further assume that swap function swaps the values of the given array elements.


begin BubbleSort(list)

   for all elements of list
      if list[i] > list[i+1]
         swap(list[i], list[i+1])
      end if
   end for

   return list

end BubbleSort

 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int n,i,j,temp;
            int []a = new int[100];

            System.out.println("Enter number of elements");
            n=in.nextInt();

        System.out.println("Enter "+n+" elements");
            for(i=0;i<n;i++)
                a[i]=in.nextInt();


            for(j=1;j<n;j++) {
                for(i=0;i<n-j;i++) {
                    if(a[i]>a[i+1]) {
                        temp = a[i+1];
                        a[i+1] = a[i];
                        a[i] = temp;
                    } }
                System.out.println("Total pass :  "+j);
            }


        System.out.println("The sorted array is :");
            for(i=0;i<n;i++)
                System.out.print(a[i]+"  ");

        }

    }
