#include<stdio.h>
#include<stdlib.h>

void diagonal_sum(int m, int n, int a[10][10])
{

    // Initialize sums of diagonals
    int sum1 = 0, sum2 = 0;
    int i,j;

    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            // finding sum of primary diagonal
            if (i == j)
            {
                sum1 += a[i][j];
                printf("Sum1 : %d\n",sum1);
            }


            // finding sum of secondary diagonal
            if (i == m - j - 1)
            {
                sum2 += a[i][j];
                printf("Sum2 :  %d\n",sum2);
            }

        }
    }

    // across the diagonals
    printf("Sum :  %d\n\n",sum1+sum2);
}


void main()
{
    int m,n,i,j,a[100][100],sum=0;

    printf("Enter the size of row and column of matrix\n");
    scanf("%d %d",&m,&n);

    printf("Enter %d elements\n",m*n);

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }

    diagonal_sum(m,n,a);

}
