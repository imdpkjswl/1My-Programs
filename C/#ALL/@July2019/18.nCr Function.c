#include<stdio.h>
#include<conio.h>

int comb(int num)
{
    int prod=1;

    for(int i=num;i>0;i--)
    {
        prod = prod*i;

    }

    return prod;
}

void main()
{
    int n,r,res;

    printf("Enter the value of n and r\n");
    scanf("%d %d",&n,&r);

    res = (comb(n)/(comb(n-r)*comb(r)));

    printf("%d^C %d  = %d\n",n,r,res);

    getch();
}
