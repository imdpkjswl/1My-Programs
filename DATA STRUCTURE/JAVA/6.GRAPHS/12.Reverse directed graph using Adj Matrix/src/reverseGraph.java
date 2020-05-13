public class reverseGraph {

    static int n;
    reverseGraph(int[][] mat, int[][] reverse){ // Initialized all by zero.
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
                reverse[i][j] = 0;
            }
        }
    }

    public static void addEdge(int[][] mat, int u, int v) {
        // Checks if the vertex exist in the graph
        if ((u >= n) || (v > n))
            System.out.println("Vertex does not exist");


        if (u == v) System.out.println("Same vertex");
        else mat[u][v] = 1;
    }

    public static void printMatrix(int[][] mat){
        System.out.println("Adjacency Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }


    public static void printConnection(int[][] mat){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != 0){
                    System.out.println("vertex-> "+i+"  is connected to vertex->  "+j);
                }
            }
        }
    }



    public static void Reverse(int[][] mat, int[][] reverse) {
        /**
         * Transpose of matrix will give reversed directed graph.
         */
         for(int j=0;j<n;j++)
            for(int i=0;i<n;i++)
                reverse[j][i] = mat[i][j];

    }


    public static void main(String []args){
        //System.out.println("Enter the no. of vertices:");
        n = 5;  //new Scanner(System.in).nextInt();

        int [][]mat = new int[10][10];
        int [][]reverse = new int[10][10];

        addEdge(mat,0,4);
        addEdge(mat,1,0);
        addEdge(mat,2,1);
        addEdge(mat,3,1);
        addEdge(mat,3,2);
        addEdge(mat,4,0);
        printMatrix(mat);
        printConnection(mat);

        Reverse(mat,reverse);
        System.out.println("\nReversed Matrix:");
        printMatrix(reverse);
        System.out.println("Reversed graph:");
        printConnection(reverse);

    }
}
