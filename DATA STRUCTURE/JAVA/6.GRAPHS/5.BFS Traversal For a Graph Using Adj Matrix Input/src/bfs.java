import java.util.*;

class bfs {
    static Scanner in = new Scanner(System.in);
    static int n, mat[][] = new int[20][20], visited[] = new int[50];  // Table
    static int que[]= new int[50], front= 0, rear= 0;    // Queue

    static void adjMatrix(){
        System.out.println("Enter the no. of vertex:");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                mat[i][j] = in.nextInt();
    }

    static void bfsTraversal(int start){
        int i, cur;
        visited[start] = 1;
        que[++rear] = start;
        System.out.print("The BFS Traversal: \n"+start+"  ");

        while(front!=rear){
            cur = que[++front]; // cur contain row of matrix

            for(i=1;i<=n;i++){
                if(mat[cur][i] == 1 && (visited[i] == 0)){
                    que[++rear] = i;
                    visited[i] = 1;
                    System.out.print(que[rear]+"  ");
                }
            }
        }
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
        bfsTraversal(start);
    }

}