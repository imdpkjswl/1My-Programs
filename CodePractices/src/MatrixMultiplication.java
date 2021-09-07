import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplication {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void multiply(int[][] mat1, int m, int n,
                         int[][] mat2, int p, int q, int[][] res){
        if(n!=p){
            System.out.println("Multiplication is not possible");
            System.exit(0);
        }

        // Logic
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                int sum = 0;
                for(int k=0;k<n;k++){
                    sum += mat1[i][k]*mat2[k][j];
                }
                res[i][j] = sum;
            }
        }
    }


    static void readMatrix(int[][] mat, int m, int n) throws IOException {
        for(int i=0;i<m;i++){
            String str = br.readLine();
            String[] s = str.split(" ");

            for(int j=0;j<n;j++){
                mat[i][j] = Integer.parseInt(s[j]);
            }
        }
    }

    static void printMatrix(int[][] mat, int m, int n) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        int m, n;
        System.out.println("Enter first matrix mxn separated by commas:");
        String tmp1 = br.readLine();
        String[] s1 = tmp1.split(" ");
        m = Integer.parseInt(s1[0]);
        n = Integer.parseInt(s1[1]);
        int[][] mat1 = new int[m][n];
        readMatrix(mat1,m,n);
        printMatrix(mat1,m,n);

        int p, q;
        System.out.println("Enter second matrix pxq separated by commas:");
        String tmp2 = br.readLine();
        String[] s2 = tmp2.split(" ");
        p = Integer.parseInt(s2[0]);
        q = Integer.parseInt(s2[1]);
        int[][] mat2 = new int[p][q];
        readMatrix(mat2,p,q);
        printMatrix(mat2,p,q);


        int[][] res = new int[m][q];
        multiply(mat1,m,n, mat2,p,q, res);
        System.out.println("Resultant matrix is:");
        printMatrix(res, m, q);

    }
}
