import java.io.*;
import java.util.*;

class Main
{
    // A utility function to add an edge in an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer> > graph, int u, int v) {
        graph.get(u).add(v); // For directed graph: Only inserting directed edges.,Here u is starting node and v is ending edge.
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

    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer> > graph = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());    // Allocating memory for list array.

        addEdge(graph,0,1);
        addEdge(graph,1,3);
        addEdge(graph,1,4);
        addEdge(graph,2,0);
        addEdge(graph,2,1);
        addEdge(graph,2,3);
        addEdge(graph,3,0);
        addEdge(graph,3,4);

        printGraph(graph);
    }
}