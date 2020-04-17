import java.util.*;

class dfs {
    static Scanner in = new Scanner(System.in);
    static int n, mat[][] = new int[20][20], visited[] = new int[50];  // Table
    static int st[] = new int[50], top= -1;

    static void adjMatrix(){
        System.out.println("Enter the no. of vertex:");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                mat[i][j] = in.nextInt();


            for(int j=1;j<=n;j++)
            visited[j] = 0;
    }

    /*
    static void dfsTraversal(int start){
        int i, cur, flag=0;
        visited[start] = 1;
        st[++top] = start;
        System.out.print("The DFS Traversal: \n"+start+"  ");

        while(st[top] != -1){
            cur = st[top--]; // cur contain row of matrix, pop()

            for(i=1;i<=n;i++){
                if(mat[cur][i] == 1 && (visited[i] == 0)){
                    st[++top] = i;
                    if(flag==0){
                        System.out.print(st[top]+"  ");
                        flag=1;
                    }

                    visited[i] = 1;
                }
            }
            flag = 0;
        }
    }*/

    static void dfsTraversal(int start)
    {
        int j;
        System.out.print(start+"  ");
        visited[start]=1;

        for(j=1; j<=n; j++)
            if(visited[j]==0  && mat[start][j] == 1)
                dfsTraversal(j);
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