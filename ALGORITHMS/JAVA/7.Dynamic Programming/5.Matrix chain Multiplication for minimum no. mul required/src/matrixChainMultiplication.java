public class matrixChainMultiplication {
    static int n =5;
    static int[] p = {5,4,6,2,7};
    static int [][]m = new int[n][n];
    static int [][]s = new int[n][n];
    public static void  main(String[] args)
    {

        int j,min,q;

        for(int d =1;d<n-1;d++)
        {
            for(int i=1;i<n-d;i++)
            {
                j = i+d;
                min = 999;
                for(int k=i;k<=j-1;k++)
                {
                    q = m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                    if(q < min)
                    {
                        min = q;
                        s[i][j] = k;
                    }
                }
                m[i][j] = min;

            }

        }

        System.out.println("Minimum number of multiplications is:  "+m[1][n-1]);

    }

}
