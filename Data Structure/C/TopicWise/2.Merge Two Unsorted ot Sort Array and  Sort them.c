#include<stdio.h>
#include<stdlib.h>


void simple_merge(int a[],int m, int b[], int n,int c[])
{
    int i=0,j=0,k=0;

    printf("First sorted array\n");
    sort(a,m);
    printf("Second sorted array\n");
    sort(b,n);

    while(i<m)
    {
        c[k++] = a[i++];
    }

    while(j<n)
    {
        c[k++] = b[j++];
    }

    printf("Third sorted array\n");
    sort(c,k);

}

void sort(int arr[],int size)
{
    int i,j,temp;

    for(j=1;j<size;j++)
    {
        for(i=0;i<size-j;i++)
        {
            if(arr[i+1] < arr[i])
            {
                temp= arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
    }

    for(i=0;i<size;i++)
    {
        printf("%d  ",arr[i]);
    }
    printf("\n");

}


void main()
{
    int a[1000],b[1000],c[2000];
    int m,n,i;

    printf("Enter the no. of elements in array A\n");
    scanf("%d",&m);

    printf("Enter %d elements\n",m);
    for(i=0;i<m;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the no. of elements in array B\n");
    scanf("%d",&n);

    printf("Enter %d elements\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&b[i]);
    }

    simple_merge(a,m,b,n,c);

    printf("\nFinal sorted array:\n");
    for(i=0;i<m+n;i++)
    {
        printf("%d  ",c[i]);
    }

}

