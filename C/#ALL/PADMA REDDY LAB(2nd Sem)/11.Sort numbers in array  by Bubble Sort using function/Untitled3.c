#include<stdio.h>

void bubble(int a[],int n)
{
    int i,j,temp;

    for(j=1;j<n;j++)
    {
        for(i=0;i<n-j;i++)
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
}

void main()
{
    int  n,i,a[20];

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    printf("Enter %d elements\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    bubble(a,n);

    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
}
