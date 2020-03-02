#include<stdio.h>

float sine(float degree)
{
    int n,i;
    float x,term,sum;

    x=(degree*3.1416)/180;

    sum=term=x;


    for(i=3;i<=n;i+=2)
    {
        term=(-term*x*x)/(i*(i-1));

        sum += term;
    }


    return sum;

}

void main()
{
    float degree,res;

    printf("Enter the angle of sine\n");
    scanf("%f",&degree);

    res=sine(degree);

    printf("%f ",res);
}
