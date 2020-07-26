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



    // Finding mother vertex in graph using bfs
    static boolean motherVertexUsingBfs(int start) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);

        Queue<Integer> q = new LinkedList<>();

        q.add(start); // System.out.print(" ->  "+start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for(int v=0;v<n;v++) {
                if(matrix[u][v] == 1 && !visited[v]){
                    q.add(v);
                    visited[v] = true;
                    //System.out.print(" ->  "+v);
                }
            } // end for
        } // end while

        // check for visited
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false; // not able to visit all vertex.
            }
        }
        return true; // able to visit all vertex.
    }




    public static void main(String[] args) {

        readMatrix();

        // here 'i' is the source vertex
        for (int i=0;i<n;i++) {
            if(motherVertexUsingBfs(i)) {
                System.out.println("Mother vertex :  "+i);
            }
        }

    }
}


/*
Output:

Enter the size of matrix:
7
Enter adjacency matrix:
0 1 1 0 0 0 0
0 0 0 1 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 1 0 0 0 0 0
0 0 1 0 0 0 1
1 0 0 0 1 0 0

Mother vertex :  5
 */