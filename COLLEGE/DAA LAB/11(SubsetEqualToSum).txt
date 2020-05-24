import java.util.Scanner;

public class SubsetEqualToSum
{
    void subset(int num,int n, int x[])
    {
        int i;

        for(i=1;i<=n;i++)
        {
            x[i]=0;
        }

        for(i=n;num!=0;i--)
        {
            x[i]=num%2;
            num=num/2;
        }
    }

    public static void main(String[] args)
    {
        SubsetEqualToSum  sub = new SubsetEqualToSum ();

        Scanner s = new Scanner(System.in);

        int n,d,sum,present=0,a[],x[],j;

        System.out.println("Enter The Number of Elements");
        n=s.nextInt();

        a=new int[n+1];
        x=new int[n+1];

        System.out.println("Enter The Elements Of Set");
        for(int i=1;i<=n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter The Non Negative Sum Value");
        d=s.nextInt();

        if(d>0)
        {
            for(int i=1;i<=Math.pow(2,n)-1;i++)
            {
                sub.subset(i,n,x);

                sum=0;

                for(j=1;j<=n;j++)
                {
                    if(x[j]==1)
                    {
                        sum=sum+a[j];
                    }
                }

                if(d==sum)
                {
                    System.out.print("Sum Of Subset Elements {|");

                    present=1;

                    for(j=1;j<=n;j++)
                    {
                        if(x[j]==1)
                        {
                            System.out.print(a[j]+"|");
                        }
                    }

                    System.out.print("} ="+d);
                    System.out.println();
                }
            }
        }

        if(present==0)
            System.out.println("No Subsets Add Up To Give The Expected Sum "+d);
    }
}