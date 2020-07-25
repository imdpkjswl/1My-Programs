public class Main {
    static int n;
    static int[][] matrix = new int[10][10];

    static void printAdjMatrix(){
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void addEdge(int u, int v){
        if(u >= n || v >= n || v< 0 || u<0){
            System.out.println("Cannot able to add ("+u+","+v+") edge!!!");
        }
        else{
            matrix[u][v] = 1; // for directed graph
        }
    }
    public static void main(String[] args) {

         n = 4; // Initial vertex

        addEdge(0, 2);
        addEdge(1,3);
        addEdge(4, 0);
        addEdge(3, 1);

        System.out.println("The adjacency matrix:");
        printAdjMatrix();
    }
}
