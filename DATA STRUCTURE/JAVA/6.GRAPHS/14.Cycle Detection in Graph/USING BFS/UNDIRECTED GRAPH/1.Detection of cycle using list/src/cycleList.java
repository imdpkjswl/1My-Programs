import java.util.ArrayList;
import java.util.Scanner;

public class cycleList {
    public static ArrayList<Integer> arr[] = new ArrayList[10]; // adjacency list to store graph
    public static Boolean []visited = new Boolean[20];
    public static int []parent = new int[20];               // stores parent of each node according to bfs traversal
    static {
        for (int i = 0; i < 10; i++)
            arr[i] = new ArrayList<>();
    }


    public static Boolean cycle_check() {
        parent[1] = 0;            // start bfs from any node I have started from 1
        int Q[] = new int[10], r=-1, f=-1;
        Q[++r] = 1;

        while(r != f) {
            int u = Q[++f];
            for(int i = 0 ; i<arr[u].size() ; i++){
                int arr[][] = new int[u][i];
                int v = arr[u][i];
                if(parent[v]==u)
                    continue;
                else if(visited[v]== true){
                    return true;            // there is a node v that is not parent of this node u so there is a cycle
                }
                parent[v] = u;              // set u as parent of v
                visited[v] = true;
                Q[++r] = v;              // push v in queue
            }
        }
        return false;
    }







            public static void main(String [] args) {
                Scanner in = new Scanner(System.in);
                int n, m;     // n- nodes   m-edges
                n = in.nextInt();
                m = in.nextInt();
                // nodes numbered from 0 to n-1
                for (int i = 0; i < m; i++) {
                    int u, v;
                    u = in.nextInt();
                    v = in.nextInt();
                    arr[u].add(v);
                    arr[v].add(u); // construct undirected graph
                }

                if (cycle_check()) {
                    System.out.println("Cycle present");
                } else {
                    System.out.println("Cycle not present");
                }

            }
}
