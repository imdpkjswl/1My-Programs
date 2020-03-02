#include<stdio.h>

void main()
{
    int n[5],i,sum=0;

    int count = 0;
    printf("Enter the five number\n");
    for(i=0;i<5;i++)
    {
        scanf("%d",&n[i]);
        if(n[i]>100)
    {
            sum=sum+n[i];
            count++;
    }
    }

    printf("\n%f",(float)sum/count);

    return;



}
