import java.util.*;

public class NearestNeighbourTechnique {
    static Scanner in = new Scanner(System.in);
    static int src, sum;
    static int[][] cost = new int[50][50];
    static void nearest_neighbour(int n) {
        int min,p=0,i,j,from;
        int[] visited = new int[20];

        for(i=1;i<=n;i++)
            visited[i]=0;

        visited[src] = 1;
        from=src;
        sum=0;

        for(j=1;j<n;j++) {
            min=999;
            for(i=1;i<=n;i++) {
                if(visited[i] !=1 &&cost[from][i]<min && cost[from][i] !=0 ) {
                    min= cost[from][i];
                    p=i;
                }
            }
            visited[p]=1;
            from=p;
            sum=sum+min;
        }
        sum=sum+cost[from][src];
    }


    public static void main (String[] args) {

        int n;
        int[] v = new int[50];

        System.out.println("Enter the no. of node: ");
        n = in.nextInt();
        for (int i=0; i<n; i++)
            v[i] = i+1;
        System.out.println("Enter cost matrix: ");
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                cost[i][j] = in.nextInt();
        System.out.println("Enter source: ");
        src = in.nextInt();

        nearest_neighbour(n);
        System.out.println("Solution with nearest neighbour technique is=  "+sum);

    }
}