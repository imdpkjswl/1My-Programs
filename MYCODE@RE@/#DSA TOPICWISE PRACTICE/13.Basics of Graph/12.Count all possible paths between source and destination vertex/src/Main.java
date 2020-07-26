import java.util.LinkedList;

/**
 * Condition: Graph does not contain any cycle.
 *
 * Approach: Use Depth First Search(Recursion):
 1. Use DFS but we cannot use visited [] to keep track of visited vertices since we need to explore all the paths.visited[] is used
    avoid going into cycles during iteration. (That is why we have a condition in this problem that graph does not contain cycle).
 2. Start from the source vertex and make a recursive call to all it adjacent vertices.
 3. During recursive call, if reach the destination vertex, increment the result (no of paths).

 */


public class Main {

    static int paths =0;

    static class Graph {
        int vertices;
        LinkedList<Integer>[] adjList;

        Graph(int v){
            vertices = v;
            adjList = new LinkedList[v];

            for (int i = 0; i < v ; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination){
            adjList[source].addFirst(destination);
        }

        public void countPaths(int source, int destination){
            count(source, destination);
            System.out.println("No. of paths between source: " +  source + " and destination: " +  destination + " are:   " + paths);
        }

        public void count(int start, int destination){
            if(start == destination) {
                paths++;
            }else {
                for (int i = 0; i < adjList[start].size(); i++) {
                    int adjacentVertex = adjList[start].get(i);
                    count(adjacentVertex, destination);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 3);
        graph.addEdge(3, 2);
        graph.addEdge(2, 4);
        graph.addEdge(1, 4);

        int source =0;
        int destination=4;
        graph.countPaths(source,destination);
    }
}