import java.util.*;

public class KruskalAlgorithm {
    static Scanner in = new Scanner(System.in);
    static int i,j;


    static int find(int i, int []parent)
    {
        while(parent[i] != 0)
            i=parent[i];
        return i;
    }
    static boolean union(int i, int j, int []parent)
    {
        if(i!=j)
        {
            parent[j]=i;
            return true;
        }
        return false;
    }

    static void kruskal(int[][] cost, int n, int []parent){
        int a,b,u,v,count;
        a= b= u= v= 0;
        count = 1;
        int min, sum=0;

        System.out.println("The edges of Minimum Cost Spanning Tree are:");
        while(count < n)
        {
            for(i=1,min=999;i<=n;i++)
            {
                for(j=1;j <= n;j++)
                {
                    if(cost[i][j] < min)
                    {
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;
                    }
                }
            }
            u=find(u,parent);
            v=find(v,parent);

            if(union(u,v,parent))
            {
                System.out.println((count++) +". Edge ("+a+","+b+") =   "+min);
                sum  +=min;
            }

            cost[a][b]=cost[b][a]=999;
        }
        System.out.println("The Minimum cost =   "+sum);
    }


    public static void main(String [] args) {
        System.out.println("Enter the no. of vertices:");
        int n = in.nextInt();
        System.out.println("Enter the cost adjacency matrix:\n");
        int [][]cost = new int[n+1][n+1];
        int []parent= new int[n+1];

        for(i=1;i<=n;i++) {
            for(j=1;j<=n;j++) {
                cost[i][j] = in.nextInt();
                    if(cost[i][j]==0)
                        cost[i][j]=999;
            }
        }

        kruskal(cost,n,parent);


    }

}
