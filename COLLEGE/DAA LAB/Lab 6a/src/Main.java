import java.util.Scanner;

class Main
{
    static Scanner s = new Scanner(System.in);

    static int wt[],val[],selected[],sol[][],i,j,W,N;

    static void solve(int wt[], int val[], int W, int N)
    {
        sol=new int[N+1][W+1];
        selected=new int[N+1];

        for(i=0;i<=N;i++)
        {
            for(j=0;j<=W;j++)
            {
                if((i==0)||(j==0))
                    sol[i][j]=0;
                else if (wt[i]>j)
                    sol[i][j]=sol[i-1][j];
                else
                    sol[i][j]=Math.max((sol[i-1][j]),(sol[i-1][j-wt[i]]+val[i]));
            }
        }

        System.out.println("The Profit Table Is Displayed Below");

        for(i=0;i<=N;i++)
        {
            for(j=0;j<=W;j++)
            {
                System.out.print(sol[i][j]+"  ");
            }
            System.out.println();
        }

        i=N;
        j=W;

        while(i>0&&j>0)
        {
            if(sol[i][j]!=sol[i-1][j])
            {
                selected[i]=1;
                j=j-wt[i];
            }
            i--;
        }

        System.out.print("The Item Selected Are ");

        for(i=0;i<=N;i++)
        {
            if(selected[i]==1)
                System.out.print(i+" ");
        }

        System.out.print(" Which Yield Optimal Profit As "+sol[N][W]);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter The Number Of Elements");
        N=s.nextInt();
        System.out.println("Enter The Capacity Of The Knapsack");
        W=s.nextInt();

        wt=new int[N+1];
        val=new int[N+1];

        System.out.println("Enter The Weights And Values Of "+N+" Objects");

        for(i=1;i<=N;i++)
        {
            System.out.println("Enter The Weight Of "+i+" Object");
            wt[i]=s.nextInt();
            System.out.println("Enter The Profit Of "+i+" Object");
            val[i]=s.nextInt();
        }

        solve(wt,val,W,N);
    }
}