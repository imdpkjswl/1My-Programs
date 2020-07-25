import java.util.LinkedList;

public class Main {

    static class Edge {
        int source;
        int dest;
        int weight;

        public Edge(int source, int dest, int weight) { // Creating box
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        int v;
        LinkedList<Edge> [] list;

        Graph(int v) {
            this.v = v;
            list = new LinkedList[v];

            for (int i = 0; i <v ; i++) {
                list[i] = new LinkedList<>();  // Creating columns
            }
        }


        public void addEdge(int source, int dest, int weight) {
            Edge edge = new Edge(source, dest, weight);
            list[source].addFirst(edge); //for directed graph-> !!! IMPORTANT !!!
        }

        public void printGraph(){
            for (int i = 0; i <v ; i++) {
                LinkedList<Edge> listc = list[i];
                for (int j = 0; j <listc.size() ; j++) {
                    System.out.println("vertex->" + i + " is connected to " +
                            listc.get(j).dest + " with weight " +  listc.get(j).weight);
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