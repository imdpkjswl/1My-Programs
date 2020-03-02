#include<stdio.h>
#include<stdlib.h>

void main()
{

    int n,a[20],i,j,temp;

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    printf("Enter %d elements\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }


    i=0;
    int k;
    while(i<n)
    {
        j=i+1;

        while(j<n)
        {
            if(a[i] == a[j])
            {
                    for(k=j;k<n;k++)
                    {
                        a[k] = a[k+1];
                    }
                    n--; // For printing purpose doing this.
            }
            j++;
        }
        i++;
    }

    int sum=0;
    printf("Sum of  ");
    for(i=0;i<n;i++)
    {

        sum = sum + a[i];
        printf("%d  ",a[i]);
    }

    printf( "is :  %d\n",sum);




}
