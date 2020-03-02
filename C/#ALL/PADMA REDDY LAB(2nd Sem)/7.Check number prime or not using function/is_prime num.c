#include<stdio.h>

int is_prime(int n)
{
    int i;

    if(n==0 || n==1) return 0;

    for(i=2;i<=n/2;i++)
    {
        if(n%i == 0) return 0;
    }

    return 1;
}

void main()
{
    int n,res;

    printf("Enter a number to check for prime or not\n");
    scanf("%d",&n);

    res=is_prime(n);

    if(res == 1)
        printf("%d is a prime number\n",n);
    else
        printf("%d is not a prime number\n",n);
}
