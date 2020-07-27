import java.util.ArrayList;

class Main {

    static int V;
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // For directed
        // graph.get(v).add(u); // For un-directed
    }


    // Function to perform DFS Traversal to detect cycle in graph
    public static boolean DFSCycle(ArrayList<ArrayList<Integer>> adjList, int u, boolean[] discovered, int parent) {
        // mark current node as discovered
        discovered[u] = true;

        // do for every edge (u -> v)
        for (int v : adjList.get(u))  // enhanced loop
        {
            // v is not discovered
            if (!discovered[v])
            {
                if (DFSCycle(adjList, v, discovered, u))   // Recursive call by making: u --> v and u --> parent .
                    return true;
            }

            // v is discovered and v is not a parent
            else if (v != parent)
            {
                // we found a back-edge (cycle)
                return true;
            }
        }

        // No back-edges found in the graph
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



        // stores vertex is discovered or not
        boolean[] discovered = new boolean[V];

        // Do DFS traversal from first vertex: initially parent null,then starts from -1.
        if (DFSCycle(adjList, 1, discovered, -1))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain any cycle");

    }
}