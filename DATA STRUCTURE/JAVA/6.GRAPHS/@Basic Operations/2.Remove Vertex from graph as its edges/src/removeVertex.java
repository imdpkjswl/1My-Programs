import java.util.*;

public class removeVertex {
    static int n;
    static int [][] mat = new int[10][10];
    // Initializing adjacency matrix to zero.
    public removeVertex(int n){
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = 0; }

    public static void display(){
        System.out.println("The adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println(); } }

    public static void addEdge(int u, int v) {
        // Checks if the vertex exist in the graph
        if((u >= n) || (v > n)){
            System.out.println("Vertex does not exist"); }

        if(u == v)
            System.out.println("Same vertex");
        else {
            // Connecting the vertices
            mat[u][v] = 1;
            mat[v][u] = 1; }
    }

    public static void deleteVertex(int x) {
        // checking if the vertex is present
        if (x > n) {
            System.out.println("Vertex not present!");
            return;
        }
        else {
            int i;
            // removing the vertex
            while (x < n) {
                // shifting the rows to left side
                for (i = 0; i < n; ++i) {
                    mat[i][x] = mat[i][x + 1];
                }

                // shifting the columns upwards
                for (i = 0; i < n; ++i)
                {
                    mat[x][i] = mat[x + 1][i];
                }
                x++;
            }

            // decreasing the number of vertices after making to zero.
            n--;
        }
    }



    public static void main(String ...args) {
        n=5;  // initial size of matrix

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(4,1);
        addEdge(4,3);
        display();

        deleteVertex(4);
        display();
    }
}
