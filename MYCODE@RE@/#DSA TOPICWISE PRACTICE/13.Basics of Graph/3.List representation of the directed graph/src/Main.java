import java.util.ArrayList;

public class Main {

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v); // for directed
        // graph.get(v).add(u); // for un-directed
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

    public static void main(String[] args) {

        int V = 6; // No. of vertex
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());  // Allocating memory for internal list


        addEdge(graph,0,2);
        addEdge(graph,0,1);
        addEdge(graph,0,4);
        addEdge(graph,1,3);
        addEdge(graph,4,3);
        addEdge(graph,4,1);
        addEdge(graph,3,2);
        addEdge(graph,5,8); // here 8 can be added at 5.But in case of Un-directed, it not gonna worked.


        printList(graph);



    }
}
