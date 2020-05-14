/// check-undirected-graph-contains-cycle-not


//Here is simple code for BFS  just check this condition
// For every visited vertex ‘v’, if there is an adjacent ‘u’ such that u is already visited and u is not a parent of v, then there is a cycle in the graph. If we don’t find such an adjacent for any vertex, we say that there is no cycle.

import java.util.ArrayList;
import java.util.Scanner;


class cycleList {
    static int n;
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(20);// adjacency list to store graph

    static int parent[] = new int[20];   // stores parent of each node according to bfs traversal
    static int visited[] = new int [20];

    static Boolean cycle_check() {
        parent[1] = 0;            // start bfs from any node I have started from 1
        int Q[] = new int[20] , r = -1, f = -1;
        Q[++r] = 1;

        while (r != f) {
            int u = Q[++f];

            for (int i = 0; i < arr.get(u).size(); i++) {
                int v = arr.get(u).get(i);

                if (parent[v] == u)
                    continue;
                else if (visited[v] == 1) {
                    return true;            // there is a node v that is not parent of this node u so there is a cycle
                }

                parent[v] = u;              // set u as parent of v
                visited[v] = 1;
                Q[++r]  = v;             // push v in queue
            }
        }
        return false;  // this represent no cycle found
    }

    public static void  main(String [] args) {
        Scanner in = new Scanner(System.in);
        int m;     // n- vertex   m-edges

        System.out.println("Enter vertex:");
        n = in.nextInt();
        for (int i = 0; i < n; i++)
            arr.add(new ArrayList<>());    // Allocating memory for sub-list array.

        System.out.println("Enter edges:");
        m = in.nextInt();
        // nodes numbered from 1 to n
        for (int i = 0; i < m; i++) {
            int u, v;
            u = in.nextInt();
            v = in.nextInt();
            arr.get(u).add(v);       // construct undirected graph
            arr.get(v).add(u);
        }
        if (cycle_check()) {
            System.out.println("Cycle present");
        } else {
            System.out.println("Cycle not present");
        }
    }
}