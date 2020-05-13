import java.util.*;

class dfsUsingList {
    // A utility function to add an edge in an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // For directed graph
        graph.get(v).add(u); // For undirected graph -->  Bidirectional edges
    }


    // A utility function to print the adjacency list
    static void printGraph(ArrayList<ArrayList<Integer> > graph) {
        for (int i = 0; i < graph.size(); i++) {  // Row of list
            System.out.print(i+":  ");

            for (int j = 0; j < graph.get(i).size(); j++) { // Column of list
                System.out.print(" -> "+graph.get(i).get(j));  // get() is to access the indexes of list.
            }
            System.out.println();
        }
    }


    static void dfs(ArrayList<ArrayList<Integer>> graph, int start){
        boolean []visited = new boolean[20];
        Stack<Integer> st = new Stack<>();
        st.push(start);
        System.out.print(st.peek()+"  ");
        visited[start] = true;
        int x;

        while(!st.isEmpty()) {  // only for printing queue items
            x = st.pop(); // row index of list

                for (int j = 0; j < graph.get(x).size(); j++) { // x index sub-list size
                    if (!visited[graph.get(x).get(j)]) {
                        st.push(graph.get(x).get(j));   //  Assigning sub-list values into stack.
                        visited[graph.get(x).get(j)] = true;// making list values to be visited.
                        x =st.peek();
                        System.out.print(x + "  ");
                        j = -1;

                    }
                }

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Creating a graph with 'V' vertices
        System.out.println("Enter the number of vertices:");
        int V = in.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(V); // initialized only main list of V size

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());    // Allocating memory for sub-list array.
/**
        System.out.println("Enter the number of edges:");
        int e = in.nextInt();
        for(int i=1;i<=e;i++){
            System.out.println("Enter starting vertex:");
            int u = in.nextInt();
            System.out.println("Enter ending vertex:");
            int v = in.nextInt();
            addEdge(graph,u,v);
        }
*/


        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,2,3);
        addEdge(graph,2,4);
        addEdge(graph,3,4);

        System.out.println("The Adjacency List For Undirected Graph: ");
        printGraph(graph);

        System.out.println("Enter the starting vertex:");
        int start = in.nextInt();
        System.out.println("The DFS Traversal is:");
        dfs(graph, start);
    }
}