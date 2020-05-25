import java.util.*;

/**
 * Best Program for multistage graph using forward approach.
 * Time complexity : O(n^2)
 */
public class MultiStageForwardApproach {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int stage,n, min;
        System.out.println("Enter the no. of stage:");
        stage = in.nextInt();
        System.out.println("Enter the no. of vertices:");
        n = in.nextInt();
        int [][]c = new int[n+1][n+1];
        int []cost = new int[n+1];
        int []d = new int[n+1];
        int []path = new int[n+1];
        System.out.println("Enter the cost adjacency matrix:");
        for(int i=1;i<=n;i++)
            for (int j = 1; j <= n; j++)
                c[i][j] = in.nextInt();



        cost[n] = 0;
        for(int i=n-1;i>=1;i--){
            min = 999;
            for(int k=i+1;k<=n;k++){

                if(c[i][k] != 0 && c[i][k] + cost[k] < min) {
                    min = c[i][k] + cost[k];
                    d[i] = k;
                }
            }
            cost[i] = min;
        }

        path[1] = 1;  // Initial node
        path[stage] = n;  // Sink node
        for(int i=2;i<stage;i++)
            path[i] = d[path[i-1]];

        System.out.println("The shortest path is:");
        for(int i=1;i<=stage;i++) {
            System.out.print(path[i]+ "  ");
        }
    }
}
