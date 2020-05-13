import java.util.*;

public class addVertexEdge {
    static int n;
    static int [][] mat = new int[10][10];
    // Initializing adjacency matrix to zero.
    public addVertexEdge(int n){
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = 0;
    }

    public static void display(){
        System.out.println("The adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void addVertex(){
        // Increasing the number of vertex
        n++;
        // Initializing by zero.
        for(int i=0;i<n;i++) {
            mat[i][n-1] = 0;
            mat[n-1][i] = 0;
        }
    }

    public static void addEdge(int u, int v) {
        // Checks if the vertex exist in the graph
        if((u >= n) || (v > n)){
            System.out.println("Vertex does not exist");
        }

        if(u == v)
            System.out.println("Same vertex");
        else {
            // Connecting the vertices
            mat[u][v] = 1;
            mat[v][u] = 1;
        }
    }




    public static void main(String ...args) {
        n=4;  // initial size of matrix
        addVertexEdge obj = new addVertexEdge(n);

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,2);
        addEdge(2,3);
        display();

        addVertex();
        addEdge(4,1);
        addEdge(4,3);
        display();
    }
}
