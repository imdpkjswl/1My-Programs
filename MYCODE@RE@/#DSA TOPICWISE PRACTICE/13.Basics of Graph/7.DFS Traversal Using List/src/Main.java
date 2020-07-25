import java.util.*;

public class Main {
    static int V;
    static boolean enable = false;

    static void enableUndirected(ArrayList<ArrayList<Integer>> graph, int u, int v){
        graph.get(v).add(u); // for un-directed
    }
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // for directed
        if(enable)
            enableUndirected(graph, u, v);
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


    static void dfsList(ArrayList<ArrayList<Integer>> graph, int start) {
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];
        st.push(start);
        visited[start] = true;
        System.out.print("->  "+start);

        while(!st.empty()) {
            int u = st.pop();
            for(int v =0; v <graph.get(u).size();v++){
                int x = graph.get(u).get(v);
                if(!visited[x]) {
                    st.push(x);
                    visited[x] = true;
                    System.out.print(" ->  "+x);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        V = 5; // No. of vertex
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());  // Allocating memory for internal list

        enable = true; // enable un-directed graph

        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,2,3);
        addEdge(graph,2,4);
        addEdge(graph,3,4);
        printList(graph);


        int source = 0;
        System.out.println("The DFS Traversal:");
        dfsList(graph, source);

    }
}
