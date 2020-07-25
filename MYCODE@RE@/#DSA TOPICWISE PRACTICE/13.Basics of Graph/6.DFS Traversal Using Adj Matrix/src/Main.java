import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[][] matrix;

    static void readMatrix(){
        System.out.println("Enter the size of matrix:");
        n = sc.nextInt();
        visited = new boolean[n];
        // Allocate matrix
        matrix = new int[n][n];
        System.out.println("Enter adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }



    static boolean[] visited;
/*
    // DFS without Recursion & using in-built stack data structure
    static void dfs(int start) {
        Stack<Integer> st = new Stack<>();

        st.push(start);   System.out.print("->  "+start);
        visited[start] = true;

        while (!st.empty()) {
            int u = st.pop();

            for(int v=0;v<n;v++) {
                if(matrix[u][v] == 1 && !visited[v]){
                    st.push(v);
                    visited[v] = true;
                    System.out.print(" ->  "+v);
                    break;
                }
            }
        }
    }
*/


    // DFS using Recursion
    static void dfsRecursive(int start) {
        System.out.print("->  "+start);
        visited[start] = true;

        for(int v=0; v < n; v++)
            if(!visited[v]  && matrix[start][v] == 1)
                dfsRecursive(v);
    }


    public static void main(String[] args) {

        readMatrix();

        System.out.println("Enter the source vertex:");
        int source = sc.nextInt();

        // dfs(source);

        dfsRecursive(source);

    }
}
