///Program to compute sum of 10 integer

#include<stdio.h>

int main()
{
    int r[10],i,sum=0;
     printf("Enter the 10 integer to compute Sum\n");
    for(i=0;i<10;i++)
    {

        scanf("%d",&r[i]);
        sum=sum+r[i];

    }

    printf("Sum of entered Integers :%d",sum);

    getch();

}
