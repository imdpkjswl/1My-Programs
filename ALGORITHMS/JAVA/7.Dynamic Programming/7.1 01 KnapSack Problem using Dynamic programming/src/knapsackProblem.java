import java.util.Scanner;

/* A Naive recursive implementation of 0-1 Knapsack problem using recursion */
class knapsackProblem {


    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int n, int wt[], int p[], int m) {
        // Base Case 
        if (n == 0 || m == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W,
        // then this item cannot be included in the optimal solution
        if (wt[n - 1] > m)
            return knapSack(n-1, wt, p, m);

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else
            return Math.max(p[n - 1] + knapSack(n-1, wt, p, m- wt[n - 1]),knapSack(n-1, wt, p, m));
    }

    // Driver function
    public static void main(String args[])
    {
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

        System.out.println("The maximum profit:  "+knapSack(n,wt,p,m));
    }
} 