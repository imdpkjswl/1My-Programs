import java.util.*;

// A Dynamic Programming based solution for 0-1 Knapsack problem
class knapSackProblem {

    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSackMethod(int n, int[] wt, int[] val, int m) {
        int i, j;
        int[][] v = new int[n + 1][m + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= m; j++) {
                if (i == 0 || j == 0)
                    v[i][j] = 0;
                else if (wt[i - 1] <= j)
                    v[i][j] = Math.max(val[i - 1] + v[i - 1][j - wt[i - 1]], v[i - 1][j]); //Note: wt[i-1], not same as formula
                else
                    v[i][j] = v[i - 1][j];
            }
        }
        return v[n][m];
    }

    // Driver program to test above function
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of objects:");
        int n= in.nextInt();
        int []p = new int[n+1];
        int []wt = new int[n+1];
        int m, i;

        System.out.println("Enter the weights:");
        for(i=0;i<n;i++)
            wt[i] = in.nextInt();
        System.out.println("Enter the profits:");
        for(i=0;i<n;i++)
            p[i] = in.nextInt();
        System.out.println("Enter the knapsack capacity:");
        m = in.nextInt();

        System.out.println("The maximum profit:   "+knapSackMethod(n, wt, p, m));
    }
}


