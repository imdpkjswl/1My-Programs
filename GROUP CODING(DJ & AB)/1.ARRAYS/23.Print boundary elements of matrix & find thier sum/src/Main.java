/*
Enter the size of matrix row X column

        3 4
        1 2 3 4
        4 3 2 3
        6 5 5 4
        sum = 37
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m, n, i, j, sum=0;
        int [][]mat = new int[50][50];

        System.out.println("Enter the size of matrix row X column");
        m=in.nextInt();
        n=in.nextInt();

        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                mat[i][j]=in.nextInt();


        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==0){
                    System.out.print(mat[i][j]+"+");
                    sum+= mat[i][j];
                }

                if(i!= 0 && j==n-1){
                    System.out.print(mat[i][j]+"+");
                    sum+= mat[i][j];
                }

                if(j!=n-1 && i== m-1){
                    sum+= mat[i][j];
                    System.out.print(mat[i][j]+"+");

                }


                if(j==0 && i!=0 && i != m-1){
                    System.out.print(mat[i][j]+"+");
                    sum+=mat[i][j];
                }

            }
        }


        System.out.println("\nSum :  "+sum);
    }
}
