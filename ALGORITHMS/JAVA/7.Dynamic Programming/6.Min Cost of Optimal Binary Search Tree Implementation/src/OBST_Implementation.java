import java.util.*;

// Dynamic Programming Java code for Optimal Binary Search Tree Problem
public class OBST_Implementation {

    /* A Dynamic Programming based function that calculates
        minimum cost of a Binary Search Tree.  */

    static int optimalSearchTree(int keys[], int freq[], int n) {

        /* Create an auxiliary 2D matrix to store results of subproblems */
        int cost[][] = new int[n + 1][n + 1];

        /* cost[i][j] = Optimal cost of binary search tree that can be formed from
            keys[i] to keys[j]. cost[0][n-1] will store the resultant cost */

        // For a single key, cost is equal to frequency of the key
        for (int i = 0; i < n; i++)
            cost[i][i] = freq[i];

        // Now we need to consider chains of length 2, 3, ... .
        // L is chain length.
        for (int L = 2; L <= n; L++) {  // difference between j and i

            // i is row number in cost[][]
            for (int i = 0; i <= n - L + 1; i++) {

                // Get column number j from row number i and chain length L
                int j = i + L - 1;
                cost[i][j] = Integer.MAX_VALUE;

                // Try making all keys in interval keys[i..j] as root
                for (int r = i; r <= j; r++) {

                    // c = cost when keys[r] becomes root of this subtree
                    int c = ((r > i) ? cost[i][r - 1] : 0) + ((r < j) ? cost[r + 1][j] : 0) + sum(freq, i, j); // Ternary operators used
                    if (c < cost[i][j])
                        cost[i][j] = c;
                }
            }
        }
        return cost[0][n - 1];  // resultant store at 0th row and (n-1)th column
    }

    // A utility function to get sum of array elements freq[i] to freq[j]
    static int sum(int freq[], int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            if (k >= freq.length)
                continue;
            sum += freq[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no. of keys:");
        int n = in.nextInt();
        int keys[] = new int[n];
        int freq[] = new int[n];

        System.out.println("Enter the keys:");
        for(int i=0;i<n;i++)
            keys[i] = in.nextInt();

        System.out.println("Enter the Frequencies::");
        for(int i=0;i<n;i++)
            freq[i] = in.nextInt();

        System.out.println("Cost of Optimal BST is " + optimalSearchTree(keys, freq, n));
    }

}










/**
public class OBST_Implementation {
    static int[][] c  = new int[20][20];
    static int[][] r  = new int[20][20];

    static void OBST(int []p, int n){

        for(int i=1;i<=n;i++){
            c[i][i-1] = 0;
            c[i][i] = p[i];
            r[i][i] = i;
        }
        c[n+1][n] = 0;

        int j,min,sum =0,pos = 0;

        for(int d=1; d<n;d++){
            for(int i=1;i<n;i++){
                j = i+d;
                min = 999;

                for(int k=0;k<=j;k++){
                    if(c[i][k-1] + c[k+1][j] < min){
                        min = c[i][k-1] + c[k+1][j];
                        pos = k;
                    }
                }

                r[i][j] = pos;

                sum = 0;
                for(int s=0;s<=j;s++){
                    sum = sum + p[s];
                }

                c[i][j] = sum + min;
            }
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int n;
        System.out.println("Enter the items:");
        n = in.nextInt();
        int[] p = new int[n];
        System.out.println("Enter the "+n+" probabilities:");
        for(int i=0;i<n;i++)
            p[i] = in.nextInt();

        OBST(p, n);

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
*/