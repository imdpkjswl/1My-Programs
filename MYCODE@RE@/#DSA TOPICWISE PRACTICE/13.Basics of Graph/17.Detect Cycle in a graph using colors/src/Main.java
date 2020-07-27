import java.util.*;

class Main {

    // A DFS based approach to find if there is a cycle in a directed graph.
    // This approach strictly follows the algorithm given in CLRS book.
    static int WHITE = 0, GRAY = 1, BLACK = 2;

    // Utility function to add an edge  
    static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v); // Add v to u's list.
    }



    // Recursive function to find if there is back edge in DFS subtree tree rooted with 'u'
    static boolean DFSUtil(ArrayList<ArrayList<Integer>> adjList, int u, int[] color) {

        // GRAY : This vertex is being processed (DFS
        // for this vertex has started, but not
        // ended (or this vertex is in function
        // call stack)
        color[u] = GRAY;

        // Iterate through all adjacent vertices
        for (Integer in : adjList.get(u))
        {
            // If there is
            if (color[in] == GRAY)
                return true;

            // If v is not processed and there is a back
            // edge in subtree rooted with v
            if (color[in] == WHITE && DFSUtil(adjList, in, color))
                return true;
        }

        // Mark this vertex as processed
        color[u] = BLACK;
        return false;
    }

    // Returns true if there is a cycle in graph 
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adjList) {

        // Initialize color of all vertices as WHITE
        int[] color = new int[adjList.size()];
        for (int i = 0; i < adjList.size(); i++) {
            color[i] = WHITE;
        }

        // Do a DFS traversal beginning with all vertices
        for (int i = 0; i < adjList.size(); i++)
        {
            if (color[i] == WHITE)
            {
                if(DFSUtil(adjList, i, color))
                    return true;
            }
        }
        return false;

    }


    // Driver code to test above 
    public static void main(String args[]) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<V;i++)
            adjList.add(new ArrayList<>());

        // Create a graph
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
       // addEdge(adjList, 2, 0);  // normal loop
        addEdge(adjList, 2, 3);
        //addEdge(adjList, 3, 3); // self loop


        if (isCyclic(adjList))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
} 