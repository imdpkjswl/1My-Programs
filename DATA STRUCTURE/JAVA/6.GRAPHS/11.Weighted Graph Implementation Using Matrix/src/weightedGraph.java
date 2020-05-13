import java.util.*;
public class weightedGraph {
    static int [][]mat = new int[10][10];
    static int n;
    weightedGraph(){
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = 0;
    }

    public static void addEdge(int u,int v, int weight) {
        // Checks if the vertex exist in the graph
        if ((u >= n) || (v > n))
            System.out.println("Vertex does not exist");


        if (u == v) System.out.println("Same vertex");
        else mat[u][v] = weight;
    }

    public static void printMatrix(){
        System.out.println("Adjacency Weight Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }


        public static void printConnection(){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j] != 0){
                        System.out.println("vertex-> "+i+" is connected to vertex-> "+j+ " with weight:  "+  mat[i][j]);
                    }
                }
            }
        }

        public static void main(String []args){
            //System.out.println("Enter the no. of vertices:");
            n = 5;  //new Scanner(System.in).nextInt();

            addEdge(0,1,1);
            addEdge(0,2,4);
            addEdge(2,4,7);
            addEdge(3,1,5);
            addEdge(4,3,8);

            printMatrix();
            printConnection();
    }
}
