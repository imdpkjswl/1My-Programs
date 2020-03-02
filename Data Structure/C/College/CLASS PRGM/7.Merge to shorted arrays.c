#include<stdio.h>

void simple_merge(int a[],int m,int b[],int n,int c[])
{
    int i,j,k;
    i=j=k=0;

    while(i<m || j<n)
    {

        if(a[i] < b[j])
        {
            c[k++] = a[i++];
        }
        else
        {
            c[k++] = b[j++];
        }
    }
}

void main()
{
    int a[100],b[100],c[200];

    int m,n,i,k;

    printf("Enter the number of elements in array\n");
    scanf("%d",&m);
    printf("Enter %d elements\n",m);

    for(i=0;i<m;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the number of elements in array\n");
    scanf("%d",&n);
    printf("Enter %d elements\n",n);

    for(i=0;i<n;i++)
    {
        scanf("%d",&b[i]);
    }

    simple_merge(a,m,b,n,c);

    for(i=0;i<(m+n);i++)
    {
        printf("%d ",c[i]);
    }

    return ;
}
