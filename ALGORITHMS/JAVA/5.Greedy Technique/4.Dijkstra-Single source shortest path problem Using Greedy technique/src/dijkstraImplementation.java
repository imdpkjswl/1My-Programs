import java.util.*;

public class dijkstraImplementation {
    static Scanner in = new Scanner(System.in);
    static int Infinity = 999;


    static void dijkstra(int [][]G, int n, int u) {
        int [][]cost = new int[n][n];
        int []distance = new int[n];
        int []pred = new int[n];    // previously marked distance

        Boolean []visited = new Boolean[n];
        int count, minDistance, v = 0, i,j;

        // Convert to cost matrix by making zero to Integer Max Value.
        for(i=0;i < n;i++)
            for(j=0;j < n;j++)
                if(G[i][j] == 0)
                    cost[i][j] = Infinity; // assign max value
                else
                    cost[i][j] = G[i][j];     // just copy

        // Making visit node indexes to zero except src node
        for(i=0;i< n;i++) {
            distance[i] = cost[u][i];
            pred[i] = u;
            visited[i] = false;   // First make all non-visited
        }
        // Make src node zero distance from src node
        distance[u] = 0;
        visited[u]= true;   // make it visited

        count=1;
        while(count < n-1) {
            minDistance = Infinity;
            for(i=0;i < n;i++)
                if(distance[i] < minDistance && visited[i] == false) // if not visited, then this will work.
                {
                    minDistance=distance[i];
                    v = i;
                }

            visited[v] = true;

            for(i=0;i < n;i++)
                if(!visited[i])
                    if(minDistance+cost[v][i] < distance[i])
                    {
                        distance[i]=minDistance+cost[v][i];
                        pred[i] = v;
                    }
            count++;
        }


        System.out.print("From "+u+"-->");
        for(i=0;i < n;i++)
            if(i!=u) {

                System.out.printf("\nDistance of %d = %d", i, distance[i]);
                System.out.printf("\nPath = %d", i);
                j=i;

                do
                {
                    j=pred[j];
                    System.out.printf(" <-%d", j);
                }
                while(j!=u);
            }
    }



    public static void main(String[] args) {
        int[][] G = new int[10][10];
        int i;
        int j;
        int n;
        int u;

        System.out.println("Enter the no. of vertices:: ");
        n = in.nextInt();
        System.out.println("Enter the cost adjacency matrix::\n");
        for(i=0;i < n;i++)
            for(j=0;j < n;j++)
                G[i][j]=in.nextInt();

        System.out.println("\nEnter the starting node:");
        u = in.nextInt();

        dijkstra(G,n,u);

    }


}
