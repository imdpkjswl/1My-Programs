import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// It's a Naive Method (Not an efficient Program)
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[][] matrix;

    static void readMatrix(){
        System.out.println("Enter the size of matrix:");
        n = sc.nextInt();
        // Allocate matrix
        matrix = new int[n][n];
        System.out.println("Enter adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }



    // Finding Reachable matrix of graph using bfs
    static void transitiveClosureMatrixUsingBfs(int start, int[][] transitiveClosureMatrix) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for(int v=0;v<n;v++) {
                if(matrix[u][v] == 1 && !visited[v]){
                    q.add(v);
                    visited[v] = true;
                }
            } // end for
        } // end while

        // assign reachable vertexes(col) from start(row).
        for(int i=0;i<n;i++){
            if(visited[i]){
                transitiveClosureMatrix[start][i] = 1;
            }
        }
    }




    public static void main(String[] args) {

        readMatrix();

        int[][] transitiveClosureMatrix = new int[n][n];  // reachable matrix
        // here 'i' is the source vertex
        for (int i=0;i<n;i++) {
            transitiveClosureMatrixUsingBfs(i, transitiveClosureMatrix);
        }

        System.out.println("The Transitive Closure of Graph:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(transitiveClosureMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}

