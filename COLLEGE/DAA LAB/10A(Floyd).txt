import java.util.Scanner;

public class FloydsAlgorithm
{
    static Scanner s = new Scanner(System.in);

    static int d[][],a[][],i,j,k,n;

    static void create()
    {
        System.out.println("Enter The Number Of Vertices");
        n=s.nextInt();

        a=d=new int[n][n];

        System.out.println("Enter The Values Into The Adjacency Matrix");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = s.nextInt();

                if((a[i][j]==0)&&(i!=j))
                {
                    a[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        d=a;
    }

    static void floyds(int a[][],int n)
    {
        for (k = 0; k < n; k++)
        {
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++)
                {
                    if ((d[i][k]+d[k][j]<d[i][j])&&(d[i][k]!=Integer.MAX_VALUE)&&(d[k][j]!=Integer.MAX_VALUE))
                    {
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }
    }

    static  void display()
    {
        System.out.println("The Shortest Path Matrix Is Displayed Below");

        System.out.print("  ");

        for(i=0;i<n;i++)
        {
            System.out.print((i+1)+" ");
        }

        System.out.println();

        for(i=0;i<n;i++)
        {
            System.out.print((i+1)+" ");

            for(j=0;j<n;j++)
            {
                if(d[i][j]==Integer.MAX_VALUE)
                {
                    System.out.print("- ");
                    continue;
                }
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        create();
        floyds(a,n);
        display();
    }
}