#include<stdio.h>

void main()
{

    int n,i,units;
    float total,cost;
    char name[20];

    printf("Enter the number of customers\n");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        printf("NAMES : "); scanf("%s",name);
        printf("UNITS : "); scanf("%d",&units);

        if(units<=200)
            cost=units*0.8;

        else if(units<=300)
            cost= 200*0.8 + (units-200)*0.9;
        else
            cost=200*0.8+100*0.9+(units-300)*1;

        total=cost+100;

        if(total>400)
            total += total*0.15;


        printf("\nTotal Due is : %.3f\n\n",total);

    }
}
