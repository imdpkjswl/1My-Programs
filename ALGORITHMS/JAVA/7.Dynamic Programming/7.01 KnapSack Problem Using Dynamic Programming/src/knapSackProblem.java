import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;


/**
 * Drawback of this program:
 * 1.Weight must be in ascending order
 * 2.Weight must not be duplicates.
 */
public class knapSackProblem {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no. of objects:");
        int n= in.nextInt();
        int []p = new int[n+1];
        int []wt = new int[n+1];
        int m, i, w=0;


        System.out.println("Enter the weights:");
        for(i=0;i<n;i++)
            wt[i] = in.nextInt();
        System.out.println("Enter the profits:");
        for(i=0;i<n;i++)
            p[i] = in.nextInt();
        System.out.println("Enter the knapsack capacity:");
        m = in.nextInt();
        int[][] v = new int[n+1][m+1];

        for(i=0;i<=n;i++){
            for(w=0;w<=m;w++){
                if(i==0 || w==0)
                    v[i][w] = 0;
                else if(wt[i] <=w){
                    v[i][w] = Math.max(v[i-1][w], v[i-1][w-wt[i]]+p[i]);
                    }
                else
                    v[i][w] = v[i-1][w];
                }
            }

        System.out.print("The maximum profit :  "+v[n][m]);

        }

    }
