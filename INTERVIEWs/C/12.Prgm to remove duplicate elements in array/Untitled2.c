#include<stdio.h>
#include<math.h>

void main()
{
    int a[200];
    int i,j;
    int n;

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    printf("Enter %d elements with duplicates\n",n);

    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {

            if(a[i] == a[j])
            {
                a[i]=0;
            }
        }
    }

    printf("After removing duplicate elements :\n");
    for(i=0;i<n;i++)
    {
        if(a[i] != 0)
            printf("%d\t",a[i]);
    }

        return;
}
