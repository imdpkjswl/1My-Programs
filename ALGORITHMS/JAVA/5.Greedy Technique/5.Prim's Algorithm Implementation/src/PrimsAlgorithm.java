import java.util.Scanner;

public class PrimsAlgorithm
{
    static Scanner in = new Scanner(System.in);
    static int n ,a[][], i ,j;

    static void read_adjacency()
    {
        System.out.println("Enter the number of vertices:");
        n=in.nextInt();

        System.out.println("Enter the adjacency matrix:");
        a=new int[n+1][n+1];

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                a[i][j]=in.nextInt();

                if((a[i][j]==0)&&(i!=j)) // make zero as infinity except forward diagonal element
                    a[i][j]=Integer.MAX_VALUE;
            }
        }


    }

    static void minCostSpanningTree()
    {
        int[] visited = new int[n+1];
        int[][] t = new int[n][3];
        int count = 0;  // why bcuz,  Edges = Vertexes -1
        int sum = 0;
        int k = 0;
        int u = 0;   // start vertex
        int v = 0;  // dest vertex
        int min=0;

        visited[1] = 1;  // by default selected first vertex
        while(count!=(n-1))
        {
            min=Integer.MAX_VALUE;

            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if((visited[i]==1) && (visited[j]==0) && (a[i][j] < min))
                    {
                        min=a[i][j];
                        u=i;
                        v=j;
                    }
                }
            }

            if(min == Integer.MAX_VALUE)
                break;

            t[k][0]= u;
            t[k][1]= v;
            t[k][2]= min;
            k++;
            count++;
            sum+=min;
            visited[v]=1;
        }

        if(count==(n-1))
        {
            System.out.println("The minimum cost spanning tree is displayed below:");
            System.out.println("Source\tDestination\tWeight");

            for(i=0;i<n-1;i++)
            {
                System.out.println(t[i][0]+"\t\t"+t[i][1]+"\t\t\t"+t[i][2]);
            }

            System.out.println("The minimum cost of spanning tree is:  "+sum);
        }
        else
        {
            System.out.println("Spanning tree does not exists.");
        }
    }

    public static void main(String[] args)
    {
        read_adjacency();
        minCostSpanningTree();
    }
}