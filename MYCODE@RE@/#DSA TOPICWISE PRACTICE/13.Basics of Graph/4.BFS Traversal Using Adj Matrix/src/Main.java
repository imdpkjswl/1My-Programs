import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

/*
    // BFS without using in-built queue data structure
    static void bfs(int start) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        int[] queue = new int[n*n];
        int front = 0;
        int rear = 0;

        queue[++rear] = start;  System.out.print(" ->  "+start);
        visited[start] = true;

        while (front != rear) {
            int u = queue[++front];

            for(int v=0;v<n;v++) {
                if(matrix[u][v] == 1 && !visited[v]){
                    queue[++rear] = v;
                    visited[v] = true;
                    System.out.print(" ->  "+queue[rear]);
                }
            } // end for
        } // end while
    }
*/


    // BFS with using in-built queue data structure
    static void bfs(int start) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        Queue<Integer> q = new LinkedList<>();

        q.add(start);  System.out.print(" ->  "+start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for(int v=0;v<n;v++) {
                if(matrix[u][v] == 1 && !visited[v]){
                    q.add(v);
                    visited[v] = true;
                    System.out.print(" ->  "+v);
                }
            } // end for
        } // end while
    }




    public static void main(String[] args) {

        readMatrix();

        System.out.println("Enter the source vertex:");
        int source = sc.nextInt();

        bfs(source);


    }
}
