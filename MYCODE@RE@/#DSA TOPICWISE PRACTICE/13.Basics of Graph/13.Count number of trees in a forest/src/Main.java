import java.util.Iterator;
import java.util.LinkedList;

class Main {

    private int V; // No. of vertices

    // Array of lists for Adjacency List Representation  
    private LinkedList<Integer> adj[];

    // Constructor  
    Main(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i <  v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph  
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS  
    void DFSUtil(int v, boolean[] visited)
    {
        // Mark the current node as visited and print it  
        visited[v] = true;

        // Recur for all the vertices adjacent to this vertex  
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
            {
                DFSUtil(n,visited);
            }
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()  
    int countTrees()
    {
        // Mark all the vertices as not visited(set as  
        // false by default in java)  
        boolean[] visited = new boolean[V];
        int res = 0;

        // Call the recursive helper function to print DFS traversal  
        // starting from all vertices one by one  
        for (int i = 0; i < V; ++i)
        {
            if (visited[i] == false)
            {
                DFSUtil(i, visited);
                res ++;
            }
        }
        return res;
    }

    // Driver code 
    public static void main(String[] args)
    {
        Main graph = new Main(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(3, 4);

        System.out.println(graph.countTrees());
    }
}  