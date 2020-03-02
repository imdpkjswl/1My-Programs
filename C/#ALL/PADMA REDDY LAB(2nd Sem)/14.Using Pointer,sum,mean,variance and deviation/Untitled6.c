#include<stdio.h>

void main()
{
    int n,i;
    float a[20],sum,sum1,mean,var,dev;

    printf("Enter the value of n\n");
    scanf("%d",&n);

    printf("Enter %d numbers\n");
    for(i=0;i<n;i++)
    {
        scanf("%f",(a+i));
    }

    sum=0;

    for(i=0;i<n;i++)
    {
        sum=sum+ *(a+i);
    }
    sum1=sum;
    mean = sum/n;

    sum=0;

    for(i=0;i<n;i++)
    {
        sum=sum + (*(a+i)-mean)*(*(a+i)-mean);

    }
    var=sum/n;

    dev= (float)sqrt(var);

    printf("SUM =  %f\n",sum1);
    printf("MEAN =  %f\n",mean);
    printf("Variance  =  %f\n",var);
    printf("Deviation =  %f\n",dev);
}
