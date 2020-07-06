package com.iamdj;

public class Main {

    static final int max = 100;

    // Function to make a cross in the matrix
    static void carveCross(String str) {
        int n = str.length();
        if (n % 2 == 0) {
            System.out.println("Not possible. Please enter odd length string.");
        }
        else {

            // declaring a 2D array i.e a matrix
            char[][] arr = new char[max][max];
            int m = n / 2;


            // Now, we will fill all the elements of the array with 'X'
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    arr[i][j] = 'X';
                }
            }

            // Now, we will place the characters of the string in the matrix, such that a cross is formed in it.
            for (int i = 0; i < n; i++) {
                // here the characters of the string will be added in the middle column of array.
                arr[i][m] = str.charAt(i);
            }

            for (int i = 0; i < n; i++) {

                // here the characters of the string will be added in the middle row of array.
                arr[m][i] = str.charAt(i);
            }

            // Now finally, we will print the array
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Driver code
    public static void main(String[] args) {

        String str = "PICTURE";
        carveCross(str);
    }
}
