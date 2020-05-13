import java.util.LinkedList;

public class weightedGraph {

    static class Edge { // Edge type data member
        int source;
        int dest;
        int weight;
        // Constructor to initialized data members.
        public Edge(int source, int dest, int weight) { // Creating box
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        int v;
        LinkedList<Edge> [] adjacencyList;

        Graph(int v) {
            this.v = v;
            adjacencyList = new LinkedList[v];  // Creating 'v' rows (v is total vertices).
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <v ; i++) {
                adjacencyList[i] = new LinkedList<>();  // Creating columns
            }
        }

        // Assigning edges between two vertices with their weights.
        public void addEdge(int source, int dest, int weight) {
            Edge edge = new Edge(source, dest, weight);
            adjacencyList[source].addFirst(edge); //for directed graph-> !!! IMPORTANT !!!
        }

        public void printGraph(){
            for (int i = 0; i <v ; i++) {
                LinkedList<Edge> list = adjacencyList[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex->" + i + " is connected to " +
                            list.get(j).dest + " with weight " +  list.get(j).weight);
                }
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        graph.printGraph();
    }
}