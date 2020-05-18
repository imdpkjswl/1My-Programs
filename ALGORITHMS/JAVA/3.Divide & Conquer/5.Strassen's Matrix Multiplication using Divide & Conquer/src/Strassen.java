import java.util.*;

public class Strassen {

        public  static int[][] multiply(int[][] a, int[][] b) {

            int n=a.length;
            int[][] ans =new int[n][n];

            if(n==1){
                ans[0][0]=a[0][0]*b[0][0];
            }
            else{
                int[][] a11 =new int[n/2][n/2];
                int[][] a12 =new int[n/2][n/2];
                int[][] a21 =new int[n/2][n/2];
                int[][] a22 =new int[n/2][n/2];
                int[][] b11 =new int[n/2][n/2];
                int[][] b12 =new int[n/2][n/2];
                int[][] b21 =new int[n/2][n/2];
                int[][] b22 =new int[n/2][n/2];

                //dividing subMatrices a
                divideArr(a,a11,0,0);
                divideArr(a,a12,0,n/2);
                divideArr(a,a21,n/2,0);
                divideArr(a,a22,n/2,n/2);
                divideArr(b,b11,0,0);
                divideArr(b,b12,0,n/2);
                divideArr(b,b21,n/2,0);
                divideArr(b,b22,n/2,n/2);

                // Performing addition & Subtraction
                int[][] s1 =sub(b12,b22);
                int[][] s2 =add(a11,a12);
                int[][] s3 =add(a21,a22);
                int[][] s4 =sub(b21,b11);
                int[][] s5 =add(a11,a22);
                int[][] s6 =add(b11,b22);
                int[][] s7 =sub(a12,a22);
                int[][] s8 =add(b21,b22);
                int[][] s9 =sub(a11,a21);
                int[][] s10 =add(b11,b12);

                // Recursive calls
                int[][] m1 =multiply(a11,s1);
                int[][] m2 =multiply(s2,b22);
                int[][] m3 =multiply(s3,b11);
                int[][] m4 =multiply(a22,s4);
                int[][] m5 =multiply(s5,s6);
                int[][] m6 =multiply(s7,s8);
                int[][] m7 =multiply(s9,s10);

                // Calculating the required elements of resultant matrix
                int[][] c11 =sub(add(m5,m4),sub(m2,m6));
                int[][] c12 =add(m1,m2);
                int[][] c21 =add(m3,m4);
                int[][] c22 =sub(add(m1,m5),add(m3,m7));

                //combining values
                combineArr(c11,ans,0,0);
                combineArr(c12,ans,0,n/2);
                combineArr(c21,ans,n/2,0);
                combineArr(c22,ans,n/2,n/2);

            }

            return ans;  // After merging, returning resultant matrix

        }

        // Utility function for addition
        public static int[][] add(int[][] a, int[][] b) {
            int n=a.length;
            int[][] c =new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    c[i][j]=a[i][j]+b[i][j];
            return c;
        }

        // Utility function for Subtraction
        public static int[][] sub(int[][] a, int[][] b) {
            int n=a.length;
            int[][] c =new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    c[i][j]=a[i][j]-b[i][j];
            return c;
        }

        // Utility function for dividing the matrix into sub-matrices
        public static void divideArr(int[][] x, int[][] y, int bi, int bj) {
            for(int i1=0,i2=bi;i1<y.length;i1++,i2++)
                for(int j1=0,j2=bj;j1<y.length;j1++,j2++)
                    y[i1][j1]=x[i2][j2];
        }

        // Utility function for merging two sub-matrices
        public static void combineArr(int[][] y, int[][] x, int bi, int bj) {
            for(int i1=0,i2=bi;i1<y.length;i1++,i2++)
                for(int j1=0,j2=bj;j1<y.length;j1++,j2++)
                    x[i2][j2]=y[i1][j1];
        }


        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter order:");
            int n=sc.nextInt();
            int[][] A =new int[n][n];
            int[][] B =new int[n][n];

            System.out.println("Enter 1 st matrix's "+n*n+" elements");
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    A[i][j]=sc.nextInt();

            System.out.println("Enter 2 nd matrix's "+n*n+" elements");
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    B[i][j]=sc.nextInt();


            int[][] c;
            c= multiply(A,B);
            System.out.println();

            System.out.println("The Matrix Multiplication is:");
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.print(c[i][j] + "\t");
                }   System.out.println();
            }
            System.out.println();

        }
}