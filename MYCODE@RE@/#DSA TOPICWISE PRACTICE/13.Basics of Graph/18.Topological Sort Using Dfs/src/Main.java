import java.util.ArrayList;
import java.util.Stack;


public class Main {

    private static Stack<Integer> st = new Stack<>();

    public static void dfs(int vertex, boolean[] marked, ArrayList<ArrayList<Integer>> adjList) {
        if(!marked[vertex]) {
            marked[vertex] = true;
            for(int v: adjList.get(vertex)) {
                dfs(v, marked, adjList);
            }
            st.push(vertex);
        }
    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int from, int to){
        adjList.get(from).add(to);
    }


    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 6;
        for(int i=0;i<V;++i)
            adjList.add(new ArrayList<>());

        addEdge(adjList,5, 0);
        addEdge(adjList,4, 0);
        addEdge(adjList,5, 2);
        addEdge(adjList,4, 1);
        addEdge(adjList,2, 3);
        addEdge(adjList,3, 1);

        boolean[] marked = new boolean[V];
        for(int i=0; i<V;i++)
                dfs(i, marked, adjList);

        System.out.println("Topological Order : ");
        while(!st.isEmpty())
            System.out.print(st.pop()+" ");

        
    }
}

