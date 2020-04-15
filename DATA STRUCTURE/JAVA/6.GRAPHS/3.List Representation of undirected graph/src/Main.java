import java.io.*;
import java.util.*;

class Main
{
    // A utility function to add an edge in an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v) {
        adj.get(u).add(v); // For directed graph
        adj.get(v).add(u); // For undirected graph
    }


    public static void main(String[] args) throws IOException
    {
        // size of ArrayList
        int n = 6;

        // Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>()); // Allocating memory for list array.
    }
}