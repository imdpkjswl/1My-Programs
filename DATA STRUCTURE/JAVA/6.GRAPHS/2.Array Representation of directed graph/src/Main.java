import java.util.Scanner;

class DirectedGraph {
    int[][] mat;
    public DirectedGraph(int n){
        mat = new int[n+1][n+1];
    }
    void init(int n) {
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                mat[i][j] = 0;
    }

    void addEdge(int src, int dest) {
        mat[src][dest] = 1;
    }

    void printMat(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Matrix:");
        int n = in.nextInt();
        DirectedGraph ob = new DirectedGraph(n);
        ob.init(n);

        int src, dest;
        while(true) {
            System.out.println("Enter src and dest or enter 100 for quit");
            src = in.nextInt();
            if(src == 100){ break;}
            dest = in.nextInt();

            if(src < 1 || src > n || dest < 1 || dest > n){
                System.out.println("Enter the correct data");
                continue;
            }

            ob.addEdge(src, dest);
        }
        System.out.println("The Adjacency Matrix: ");
        ob.printMat(n);
    }
}