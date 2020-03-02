package com.iamdj;
// This program to demonstrate the Section Sorting to arrange the element in increasing order...
public class SectionSort {

    public static void main(String[] args) {

            int[] data={23,46,37,3,18,7};
            int n = data.length; // Length of array.....
            System.out.println("Unsorted List is :");
            display(data,n);
            sort(data,n);
            System.out.println("\nSorted List is :");
            display(data,n);
        }

        // Function to display result
        private static void display(int[] num, int n)
        {
            for(int i=0; i<n;i++)
                System.out.print(num[i]+"  ");
        }

        // Function to sort element
        private static void sort ( int[] num ,int n)
        {
            int  i, j, temp;
            for(i=0; i<n-1 ;i++) {

                for(j=0; j<(n - i) -1 ; j++) {

                    if(num[j] > num[j+1]) {

                        temp = num[j];
                        num[j] = num[j+1];
                        num[j+1] = temp;

                    }
                }
            }
        }

}
