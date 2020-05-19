import java.util.*;

class Main {
    static Scanner in = new Scanner(System.in);
    static int n, a[][] = new int[20][20], inDegree[] = new int[50];  // Table
    static int s[] = new int[50], top= -1;
    static int u, v, sum=0;
    static ArrayList<Integer> T = new ArrayList<Integer>(n);


    static void adjMatrix(){
        System.out.println("Enter the no. of vertex:");
        n=in.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = in.nextInt();

        for(int j=0; j<n; j++)
            inDegree[j] = 0;
    }

    // Obtaining in-degree of each node
    static void topologicalSort(){
        for(int i=0;i<n;i++){
            sum =0;
            for(int j=0;j<n;j++){
                sum = sum + a[j][i];
            }
            inDegree[i] = sum;
        }


        // Place independent jobs on the stack
        top = -1;
        for(int i=0;i<n;i++){
            if(inDegree[i] == 0){
                top = top +1;
                s[top] = i;
            }
        }

        // Find topological sequence
        while (top != -1) {
            u = s[top];
            top = top -1;

            T.add(u);

            for(int i=0; i<n; i++) {
                v = a[u][i];
                int d = inDegree[v];
                inDegree[v] = --d;

                if(inDegree[v] == 0){
                    top = top +1;
                    s[top] = v;

                }
            }

        }

        for(int i=0;i<T.size();i++){
            System.out.print(T.get(i)+"  ");
        }


    }


    /** Padma Not Working */
    public static void main(String[] args){
        adjMatrix();

        System.out.println("The topological sequence: ");
        topologicalSort();

    }
}