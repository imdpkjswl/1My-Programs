import java.util.Scanner;
import java.util.Stack;


class dfs {
    static Scanner in = new Scanner(System.in);
    static int n, mat[][] = new int[20][20];

        static void adjMatrix(){
            System.out.println("Enter the no. of vertex:");
            n=in.nextInt();
            System.out.println("Enter the adjacency matrix: ");
            for(int i=1;i<=n;i++)
                for(int j=1;j<=n;j++)
                    mat[i][j] = in.nextInt();

        }




    // Perfect program for dfs non-recursive traversal
    static void dfsTraversal(int start) {

            boolean[] visited = new boolean[mat.length]; // already initialized by false
            visited[start] = true;
            Stack<Integer> st = new Stack<>();
            st.push(start);
            System.out.print(start+"  ");
            int i, x;

            while(!st.isEmpty()){
                x = st.pop();
                for(i=1; i<=n/**mat.length*/; i++){
                    if(mat[x][i] == 1 && visited[i] == false){
                        st.push(x);
                        visited[i] = true;
                        System.out.print(i+"  ");
                        x = i;
                        i = 0; // for restarting loop
                    }
                }
            }


    }

    public static void main(String[] args) {
        adjMatrix();
        int source;

        System.out.println("Enter starting vertex:");
        source = in.nextInt();

        if(source > n || source <1){
            System.out.println("Enter the correct starting vertex.");
            return;
        }
        System.out.println("The DFS Traversal: ");
        dfsTraversal(source);
    }

}