#include<stdio.h>

int main()
{
    int a,b,res;

    printf("Enter two number\n");
    scanf("%d %d",&a,&b);

    res = gcd(a,b);

    printf("GCD of %d and %d is  %d\n",a,b,res);

    return 0;
}

int gcd(int a, int b)
{
    if(a==b)
        return (a);
    if(a%b==0)
        return (b);
    if(b%a==0)
        return (a);

    if(a>b)
        return gcd(a%b,b);
    else
        return gcd(a,b%a);

}
