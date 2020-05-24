import java.util.Scanner;

public class dijkstra {

    static void dijkstraMethod(int[][] cost, int n, int[] visited, int[] distance, int src){
        int min, v = 0;

        for(int i=1;i<=n;i++){
            visited[i] = 0;
            distance[i] = cost[src][i];
        }
        visited[src] = 1;
        distance[src] = 0;


        for(int i =2;i<=n;i++)
        {
            min = 999;
            for(int j =1;j<=n;j++) {
                if (distance[j] < min && visited[j] == 0) {
                    min = distance[j];
                    v = j;
                }
            }
            visited[v] = 1;

            for(int j=1;j<=n;j++){
                if(distance[v]+cost[v][j] < distance[j]){
                    distance[j] = cost[v][j] + distance[v];
                }
            }

        }

        System.out.println("Shortest path from:");
        for(int i=1;i<=n;i++){
            if(i != src){
                System.out.printf("%d --> %d  = %d\n",src, i, distance[i]);
            }
        }
    }


    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int n, src;
        int[][] cost = new int[10][10];
        int[] visited = new int[10];
        int[] distance = new int[10];

        System.out.println("Enter the no. of vertices: ");
        n = in.nextInt();

        System.out.println("Enter the cost matrix:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                cost[i][j] = in.nextInt();
                if(cost[i][j] == 0)
                    cost[i][j] = 999; // make as infinity
            }
        }

        System.out.println("Enter the source vertex:");
        src = in.nextInt();

        dijkstraMethod(cost,n,visited,distance,src);


    }
}
