import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int V;

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // for directed
    }

    static void printList(ArrayList<ArrayList<Integer> > graph)
    {
        for (int i = 0; i < graph.size(); i++) {  // expanding Row
            System.out.print(i+":  ");
            for(int j=0;j<graph.get(i).size();j++){ // expanding column
                System.out.print("  -> "+graph.get(i).get(j));
            }
            System.out.println();
        }
    }


    static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(start);
        visited[start] = true;
        System.out.print("->  "+start);

        while(!q.isEmpty()) {
            int u = q.poll();
            for(int v =0; v <graph.get(u).size();v++){
                int x = graph.get(u).get(v);
                if(!visited[graph.get(u).get(v)]) {
                    q.add(x);
                    visited[x] = true;
                    System.out.print(" ->  "+x);
                }
            }
        }
    }

    public static void main(String[] args) {

        V = 5; // No. of vertex
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());  // Allocating memory for internal list


        addEdge(graph,0,2);
        addEdge(graph,1,0);
        addEdge(graph,2,3);
        addEdge(graph,3,1);
        addEdge(graph,4,2);
        addEdge(graph,3,4);
        printList(graph);


        int source = 0;
        System.out.println("The BFS Traversal:");
        bfs(graph, source);

        String bfsText = "    ____                      ____  __       _______           __     _____                      __  \r\n" +
                "   / __ )________  ____ _____/ / /_/ /_     / ____(_)_________/ /_   / ___/___  ____ ___________/ /_ \r\n" +
                "  / __  / ___/ _ \\/ __ `/ __  / __/ __ \\   / /_  / / ___/ ___/ __/   \\__ \\/ _ \\/ __ `/ ___/ ___/ __ \\\r\n" +
                " / /_/ / /  /  __/ /_/ / /_/ / /_/ / / /  / __/ / / /  (__  ) /_    ___/ /  __/ /_/ / /  / /__/ / / /\r\n" +
                "/_____/_/   \\___/\\__,_/\\__,_/\\__/_/ /_/  /_/   /_/_/  /____/\\__/   /____/\\___/\\__,_/_/   \\___/_/ /_/ \n";

        System.out.println("\n\n"+bfsText);


    }
}
