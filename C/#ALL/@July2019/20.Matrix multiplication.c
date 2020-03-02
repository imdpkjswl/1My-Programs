#include<stdio.h>
#include<conio.h>

void main()
{
    int a[100][100],b[100][100],c[100][100],m,n,p,q;
    int i,j,k;

    printf("Enter the size of first matrix\n");
    scanf("%d %d",&m,&n);

    printf("Enter the elements of first matrix\n");

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }

    printf("Enter the size of second matrix\n");
    scanf("%d %d",&p,&q);

    if(n != p)
    {
        printf("Multiplication is not possible\n");
        return;
    }

    printf("Enter the elements of second matrix\n");

    for(i=0;i<p;i++)
    {
        for(j=0;j<q;j++)
        {
            scanf("%d",&b[i][j]);
        }
    }

     for(i=0;i<m;i++)
    {
        for(j=0;j<q;j++)
        {
            int sum=0;
            for(k=0;k<n;k++)
            {
                sum = sum + a[i][k]*b[k][j];
            }

            c[i][j] = sum;
        }
    }

    printf("The resultant matrix is :\n");

    for(i=0;i<m;i++)
    {
        for(j=0;j<q;j++)
        {
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }

    return;

}
