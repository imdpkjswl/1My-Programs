#include<stdio.h>

float sqrtf(float n)
{

    float x,root;
    int i;

    x=2;

    for(i=1;i<=12;i++)
    {
        root= (x*x + n)/(2*x);

        x=root;
    }

    return x;

}

void main()
{
    float n,res;

    printf("Enter a number\n");
    scanf("%f",&n);

    res=sqrtf(n);

    printf("Square Root of %.3f is  %.3f\n",n,res);


}
