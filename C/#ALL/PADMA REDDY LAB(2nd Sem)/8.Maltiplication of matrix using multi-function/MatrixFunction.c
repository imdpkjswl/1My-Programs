#include<stdio.h>

void multiply(int a[][10],int b[][10],int c[][10],int m ,int n,int p,int q)
{
    int i,j,k,sum;

    if(n!=p)
    {
        printf("Multiplication is not possible\n");
        exit(0);
    }

    for(i=0;i<m;i++)
    {
        for(j=0;j<q;j++)
        {
            sum=0;
            for(k=0;k<n;k++)
            {
                sum =sum + a[i][k]*b[k][j];

            }

            c[i][j]=sum;
        }
    }

}

void read(int a[][10],int m,int n)
{
    int i,j;


    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
}

void print(int a[][10],int m,int n)
{
    int i,j;

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d   ",a[i][j]);
        }

        printf("\n");
    }
}

void main()
{
    int a[10][10],b[10][10],c[10][10],m,n,p,q;

    printf("Enter the size of first matrix(m*n)\n");
    scanf("%d%d",&m,&n);

    printf("Enter the elements of first matrix\n");
    read(a,m,n);

    printf("Enter the size of second matrix(p*q)\n");
    scanf("%d %d",&p,&q);

    printf("Enter the elements of second matrix\n");
    read(b,p,q);

    multiply(a,b,c,m,n,p,q);
    printf("The Resultant Matrix are :\n");
    print(c,m,q);

}
