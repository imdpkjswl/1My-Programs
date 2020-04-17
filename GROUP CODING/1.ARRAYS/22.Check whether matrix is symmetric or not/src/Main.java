import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i,j,n;
        int [][]mat = new int[50][50];

        System.out.println("Enter the size of matrix");
        n=in.nextInt();

        for(i=0;i<n;i++)
            for (j = 0; j < n; j++)
                mat[i][j] = in.nextInt();

            int temp =n*n;
            int counter=0;

            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(mat[i][j] == mat[j][i]){
                        counter++;
                    }
                }
            }

            if(counter == temp){
                System.out.println("Matrix is symmetric");;}
                else
                System.out.println("Matrix is not symmetric");
    }
}
