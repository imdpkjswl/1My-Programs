import java.util.*;

// Dynamic programming with the help of top down approach(memory function).
//This method uses Memoization Technique (an extension of recursive approach)top down approach.
public class MemoizationTopDownApproach {

    // Returns the value of maximum profit
    static int knapSackRecur(int n, int[] wt, int[] p, int[][] dp, int m)
    {
        // base condition
        if (n < 0)
            return 0;
        if (dp[n][m] != -1)
            return dp[n][m];

        if (wt[n] > m) {
            // Store the value of function call stack in table before return
            dp[n][m] = knapSackRecur(n-1, wt, p, dp, m);
            return dp[n][m];
        }
        else {
            // Store value in a table before return
            dp[n][m] = Math.max(p[n] + knapSackRecur(n-1, wt, p, dp, m - wt[n]), knapSackRecur(n-1, wt, p , dp,m));

            // Return value of table after storing
            return dp[n][m];
        }
    }

    static int knapSack(int n, int[] wt, int[] val, int m) {
        // declare the table
        int[][] dp = new int[n][m+1];

        // loop to initially filled the table with -1
        for (int i = 0; i < n; i++)
            for (int j = 0; j <=m; j++)
                dp[i][j] = -1;  // this helps to be avoid by recalculating the same sub-problem.
        return knapSackRecur(n-1, wt, val, dp, m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of objects:");
        int n = in.nextInt();
        int[] wt = new int[n];
        int[] p = new int[n];
        int m;
        System.out.println("Enter the no. of weights:");
        for(int i=0;i<n;i++)
            wt[i] = in.nextInt();
        System.out.println("Enter the profits:");
        for(int i=0;i<n;i++)
            p[i] = in.nextInt();
        System.out.println("Enter the knapsack capacity:");
        m = in.nextInt();

        System.out.println("The maximum profit:  "+knapSack(n, wt, p, m));
    }
}
