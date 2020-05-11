import java.io.*;
import java.util.*;

class bfsUsingList {
    // A utility function to add an edge in an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // For directed graph
        graph.get(v).add(u); // For undirected graph
    }


    // A utility function to print the adjacency list
    static void printGraph(ArrayList<ArrayList<Integer> > graph)
    {
        for (int i = 0; i < graph.size(); i++) {  // Row of list
            System.out.print(i+":  ");

            for (int j = 0; j < graph.get(i).size(); j++) { // Column of list
                System.out.print(" -> "+graph.get(i).get(j));  // get() is to access the indexes of list.
            }
            System.out.println();
        }
    }


    static void bfs(ArrayList<ArrayList<Integer>> graph, int start){
        int []q  = new int[20];
        boolean []visited = new boolean[20];


        int x, r = -1, f = -1;
        q[++r] = start;
        visited[start] = true;
        //System.out.print(start+"  ");

        while(r != f) {  // only for printing queue items
            for(int i = 0; i < graph.size(); i++) {
                x = q[++f]; // row index of list
                System.out.print(q[f]+"  ");
                for (int j = 0; j < graph.get(x).size(); j++) { // x index sub-list size
                    if(!visited[graph.get(x).get(j)]) {
                        q[++r] = graph.get(x).get(j);  //  Assigning sub-list values into queue.
                        visited[graph.get(x).get(j)] = true;// making list values to be visited.
                    }
                }
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Creating a graph with 5 vertices
        System.out.println("Enter the number of vertices:");
        int V = in.nextInt();
        // ArrayList<ArrayList<Integer> > graph = new ArrayList<ArrayList<Integer>>(V); Normal definition.
        ArrayList<ArrayList<Integer> > graph = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());    // Allocating memory for list array.

        System.out.println("Enter the number of edges:");
        int e = in.nextInt();
        for(int i=1;i<=e;i++){
            System.out.println("Enter starting vertex:");
            int u = in.nextInt();
            System.out.println("Enter ending vertex:");
            int v = in.nextInt();
            addEdge(graph,u,v);
        }
 /**
        addEdge(graph,0,2);
        addEdge(graph,0,3);
        addEdge(graph,1,4);
        addEdge(graph,4,3);
        addEdge(graph,3,2);
*/
        System.out.println("The Adjacency List For Undirected Graph: ");
        printGraph(graph);

        System.out.println("Enter the starting vertex:");
        int start = in.nextInt();
        System.out.println("The BFS Traversal is:");
        bfs(graph, start);
    }
}