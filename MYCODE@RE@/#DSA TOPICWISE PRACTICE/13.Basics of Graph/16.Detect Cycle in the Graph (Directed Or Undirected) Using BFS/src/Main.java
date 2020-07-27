import java.util.*;

// Node to store vertex and its parent info in BFS
class Node {
    int v, parent;

    Node(int v, int parent) {
        this.v = v;
        this.parent = parent;
    }
}



class Main {

    static int V;
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // For directed
        // graph.get(v).add(u); // For un-directed
    }



    // Perform BFS on graph starting from vertex src and returns true of cycle is found in the graph
    public static boolean BFSCycle(ArrayList<ArrayList<Integer>> adjList, int src, int N) {
        // stores vertex is discovered or not
        boolean[] discovered = new boolean[N];

        // mark source vertex as discovered
        discovered[src] = true;

        // create a queue used to do BFS and push source vertex into the queue
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(src, -1));

        // run till queue is not empty
        while (!q.isEmpty())
        {
            // pop front node from queue and print it
            Node node = q.poll();

            // do for every edge (v -> u)
            for (int u : adjList.get(node.v))
            {
                if (!discovered[u])
                {
                    // mark it discovered
                    discovered[u] = true;

                    // construct the queue node containing info about vertex and push it into the queue
                    q.add(new Node(u, node.v));
                }

                // u is discovered and u is not a parent
                else if (u != node.parent)
                {
                    // we found a cross-edge ie. cycle is found
                    return true;
                }
            }
        }

        // No cross-edges found in the graph
        return false;
    }







    // Check if an undirected graph contains cycle or not
    public static void main(String[] args) {

        V = 4; // No. of vertex
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(V);

        for(int i=0;i<V;i++)
            adjList.add(new ArrayList<>());  // Allocating memory for internal list

        // Example 1: For Directed Graph
        addEdge(adjList, 0, 1);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 0); // This will create cycle: normal loop
        addEdge(adjList, 0, 2);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 3); // This will create cycle: self loop


        // Example 2: For Un-Directed Graph
//        addEdge(adjList,1,2);
//        addEdge(adjList,1,7);
//        addEdge(adjList,1,8);
//        addEdge(adjList,2,3);
//        addEdge(adjList,2,6);
//        addEdge(adjList,3,4);
//        addEdge(adjList,3,5);
//        addEdge(adjList,8,9);
//        addEdge(adjList,8,12);
//        addEdge(adjList,9,10);
//        addEdge(adjList,9,11);
//        addEdge(adjList,11,12);  // This will create cycle: normal loop




        // Do BFS traversal from first vertex
        if (BFSCycle(adjList, 1 , V))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain any cycle");

    }
}