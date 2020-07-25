
// Performing vertex & edge insertions on Bi-directional Graph
class Main {

    static int n;
    static int [][] matrix = new int[10][10]; // Initializing adjacency matrix to zero.but here no need coz it's already having static.

    public static void display(){
        System.out.println("\nThe adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void addVertex(){
        // Increasing the number of vertex
        n++;

        // Initializing by zero for further adding edges.
        for(int i=0;i<n;i++) {
            matrix[i][n-1] = 0; // row
            matrix[n-1][i] = 0; // column
        }
        System.out.println("New vertex added.");
    }

    public static void addEdge(int u, int v) {
        // Checks if the vertex exist in the graph
        if((u >= n) || (v > n) || u < 0 || v < 0){
            System.out.println("Vertex does not exist");
            ArrayIndexOutOfBoundsException indexBoundPointer = new ArrayIndexOutOfBoundsException();
            System.out.println("Array Index Out Of Bounds Exception thrown :) :)");
            throw indexBoundPointer;
        }

        if(u == v)
            System.out.println("Same vertex: ("+u+","+v+")");
        else {
            // Connecting the vertices
            matrix[u][v] = 1;
            matrix[v][u] = 1;
            System.out.println("New edge added.");
        }
    }





    public static void deleteVertex(int x) {
        // checking if the vertex is present
        if (x > n) {
            System.out.println("Vertex not present!");
        }

        else {

            // removing the vertex
            while (x < n) {
                // shifting the bottom rows to left side
                for (int i = 0; i < n; i++) {
                    matrix[i][x] = matrix[i][x + 1];
                }

                // shifting the columns upwards
                for (int i = 0; i < n; i++) {
                    matrix[x][i] = matrix[x + 1][i];
                }
                x++;
            }

            // decreasing the number of vertices after making to zero.
            n--;
        }
    }





    public static void main(String ...args) {
        n=4;  // initial size of matrix

        // add edges
        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,2);
        addEdge(2,3);
        display();

        // add vertex
        addVertex();
        addEdge(4,1);
        addEdge(4,3);
        display();

        // delete vertex
        deleteVertex(2);
        display();
    }
}
