import java.util.*;

class dfs {
    static Scanner in = new Scanner(System.in);
    static int n, mat[][] = new int[20][20], visited[] = new int[50];  // Table
    static int st[] = new int[50], top= -1;

    static void adjMatrix(){
        System.out.println("Enter the no. of vertex:");
        n=in.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                mat[i][j] = in.nextInt();


            for(int j=1;j<=n;j++)
            visited[j] = 0;
    }


    static void dfsTraversal(int start)
    {
        int i;
        System.out.print(start+"  ");
        visited[start]=1;

        for(i=1; i<=n; i++)
            if(visited[i]==0  && mat[start][i] == 1)
                dfsTraversal(i);
    }

    public static void main(String[] args){
        adjMatrix();
        int start;

        System.out.println("Enter starting vertex:");
        start = in.nextInt();

        if(start > n || start <1){
            System.out.println("Enter the correct starting vertex.");
            return;
        }
        System.out.println("The DFS Traversal: ");
        dfsTraversal(start);
    }

}