import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        int i, j;
        int n,m;
        System.out.println("Enter Row and Column size of matrix:");
        n = in.nextInt();
        m=in.nextInt();
        int [][]arr = new int[m][n];

        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        System.out.println("Spiral Matrix : ");
        int rowidx =0;
        int rowSize = arr.length;

        int colidx=0;
        int colSize = arr[0].length;


        while(rowidx < rowSize && colidx< colSize){

            for(i=rowidx;i<colSize;i++)
                System.out.print(arr[rowidx][i]+" ");

            for(j=rowidx+1;j<rowSize;j++)
                System.out.print(arr[j][colSize-1]+" ");

            if(rowidx+1 < rowSize){
                int idx = colSize-2;
                for(int k=idx;k>=colidx;k--)
                    System.out.print(arr[rowSize-1][k]+" ");
            }

            if(colidx+1 < colSize){
                int idx = rowSize-2;
                for(int k=idx;k>rowidx;k--)
                    System.out.print(arr[k][colidx]+" ");
            }

            rowidx++;
            rowSize--;

            colidx++;
            rowSize--;
        }

    }
}
