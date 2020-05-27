import java.util.*;

public class BellmanFord {
    static Scanner in = new Scanner(System.in);

    static int Bellman_Ford(int cost[][] , int n, int edge[][], int E) {

        int i, u, v, k, src, flag=1;
        int[] distance = new int[20];
        int[] parent = new int[20];
        for(i=0;i<n;i++){
            distance[i] = 9999 ;  // make every node cost infinity
            parent[i] = -1;

            if(i==0)
                parent[i] = 0;

        }

        System.out.printf("Enter source: ");
        src = in.nextInt();
        distance[src-1]=0 ;  // node starts from 1.

        for(i=0;i<n-1;i++) // (vertex -1) times iteration
        {
            for(k=0;k<E;k++)
            {
                u = edge[k][0] ; v = edge[k][1] ; // taking one edge for comparison
                if(distance[u]+cost[u][v] < distance[v]) {
                    distance[v] = distance[u] + cost[u][v] ;
                    parent[v]=u ;
                }
            }
        }
        for(k=0;k<E;k++)
        {
            u = edge[k][0] ;
            v = edge[k][1] ;
            if(distance[u]+cost[u][v] < distance[v])
                flag = 0 ;//check if negative cycle exist,node cost will reduce after n-1 iteration.set flag =0
        }

        if(flag == 1) {  // if negative cycle exist, print
            for(i=0;i<n;i++)
                System.out.printf("Vertex %d -> cost = %d parent = %d\n",i+1,distance[i],parent[i]+1);
        }

        return flag; // show negative cycle or not
    }

    public  static void main(String[] args) {

        int V,i,j,k=0;
        int[][] cost = new int[20][20];
        int[][] edge = new int[20][20];  // will use to store starting and end vertex at 0 and 1 columns.

        System.out.println("Enter no. of vertices: ");
        V = in.nextInt();
        System.out.println("Enter cost matrix:\n");
        for(i=0;i<V;i++) {
            for (j = 0; j < V; j++) {
                cost[i][j] = in.nextInt();
                if (cost[i][j] != 0) {
                    edge[k][0] = i;
                    edge[k++][1] = j;
                }
            }
        }

        // this show all pair of edges(k show no. of edges).
        for(i=0;i<k;i++){
            for(j=0;j<k;j++){
                System.out.print(edge[i][j]+ "  ");
            }
            System.out.println();
        }

        // Check negative cycle existing or not
        if(Bellman_Ford(cost, V, edge, k) == 1)
            System.out.println("No negative weight cycle");
        else
            System.out.println("Negative weight cycle exists");
    }
}
