#include<stdio.h>

/// Program to check whether array elements are sorted or not.

void main()
{
    int a[100],n;
    printf("Enter the number of elements\n");
    scanf("%d",&n);
    int temp,i,j;
    int count=1;

    printf("Enter the elements\n");

    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    for(j=1;j<5;j++)
    {
        for(i=0;i<5-j;i++)
        {
            if(a[i+1]<a[i] )
            {
                count++;
            }
        }
    }

    if(count == i)
        printf("Sorted");
    else
        printf("Not sorted");

}
