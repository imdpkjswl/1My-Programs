#include<stdio.h>

void main()
{
    int x,y,temp,gcd;

    printf("Enter any two number\n");
    scanf("%d%d",&x,&y);

    while(y!=0)
    {
            temp=y;
            y=x%y;
            x=temp;

    }

    gcd=x;

    printf("GCD of %d And %d :  %d\n",x,y,gcd);

    getch();

}
