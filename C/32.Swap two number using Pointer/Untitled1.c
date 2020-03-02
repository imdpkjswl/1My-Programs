#include<stdio.h>

void  main()
{
    int a,b,t;

    printf("Enter two number\n");
    scanf("%d%d",&a,&b);

    t=a;
    a = b;
    b=t;

    printf("SWAPPED: %d AND %d\n",a,b);

    return;
}
