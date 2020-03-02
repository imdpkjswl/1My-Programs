#include<stdio.h>

int binarytodec(int n, int base)
{
    if(n==0) return 0;

    return (n%10)*base + binarytodec(n/10,2*base);

}

void main()
{
    int n,base=1,res;

    printf("Enter a binary number\n");
    scanf("%d",&n);
    res = binarytodec(n,base);

    printf("Decimal number of %d is  %d\n",n,res);

    getch();
}
