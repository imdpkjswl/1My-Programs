#include<stdio.h>
//Program to add two matrix...
/////////////////////////////////////////////////////////////////////////////////////
void main()
{
    int a[10][10],b[10][10],sum[10][10];
    int i,j,m,n,p,q,r,s,r1,r2,c1,c2;

    printf("Enter The Number Of Rows And Columns Of First Matrix\n");
    scanf("%d%d",&r1,&c1);
    printf("Enter Elements Into Array Of Order %d * %d\n",r1,c1);

    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }


    printf("Enter The Number Of Rows And Columns Of Second Matrix\n");
    scanf("%d%d",&r2,&c2);
    printf("Enter Elements Into Array Of Order %d * %d\n",r2,c2);
    for(m=0;m<r2;m++)
    {
        for(n=0;n<c2;n++)
        {
            scanf("%d",&b[m][n]);
        }
    }

    if((r1==r2) && (c1==c2))
{
    for(p=0;p<m;p++)
    {
        for(q=0;q<n;q++)
        {
            sum[p][q]=a[p][q]+b[p][q];
        }
    }

    printf("The Resultant Matrix Is Displayed Below\n");
    for(r=0;r<r1;r++)
    {
        for(s=0;s<c1;s++)
        {
            printf(" %d ",sum[r][s]);
        }
        printf("\n");
    }
}
else
{
        printf("Matrices Of Different Order..Computation Not Possible..Please Try Again\n");
        exit(0);

}


}

