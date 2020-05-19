import java.util.ArrayList;
import java.util.Stack;


public class topologicalSortDAG {

    private int E, V;
    private ArrayList<ArrayList<Integer>> al;
    private boolean marked[];
    private Stack<Integer> stack;

    topologicalSortDAG(int V) {
        this.V = V;
        al = new ArrayList<>();
        marked = new boolean[V];
        stack = new Stack<>();
        for(int i=0;i<V;++i){
            al.add(new ArrayList<>());
        }
    }


    public void dfs(int vertex) {
        if(!marked[vertex]) {
            marked[vertex] = true;
            for(int v:al.get(vertex)) {
                dfs(v);
            }
            stack.push(vertex);
        }
    }

    public void addEdge(int from, int to){
        al.get(from).add(to);
    }

    public static void main(String[] args){
        //7 vertices in example digraph
        topologicalSortDAG ts = new topologicalSortDAG(5);
        ts.addEdge(0, 1);
        ts.addEdge(0, 2);
        ts.addEdge(1, 2);

        ts.addEdge(1, 3);
        ts.addEdge(2, 3);
        ts.addEdge(2, 4);

        for(int i=0;i<ts.V;++i) ts.dfs(i);

        System.out.println("Topological Order : ");
        while(!ts.stack.isEmpty()){
            System.out.print(ts.stack.pop()+" ");
        }
    }
}

/**
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(2, 3);
            g.addEdge(2, 4);
 */