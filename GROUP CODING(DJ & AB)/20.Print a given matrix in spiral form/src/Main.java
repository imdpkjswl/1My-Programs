import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        int i, j, k=0, l=0;
        int n,m;
        System.out.println("Enter Row and Column size of matrix:");
        n = in.nextInt();
        m=in.nextInt();
        int [][]arr = new int[n][m];

        for(i=0;i<n;i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Not Completed.................
    }
}
