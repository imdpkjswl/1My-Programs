#include<stdio.h>

void main()
{
    int n,i;
    float degree,x,term,sum;

    printf("Enter angle of sine \n");
    scanf("%f%d",&degree,&n);

    x=(degree*3.1416)/180;

    sum=term=x;

    for(i=3;i<n;i+=2)
    {
        term=(-term*x*x)/(i*(i-1));
        sum+=term;
    }

    printf("Sine value of %f is  %f\n",degree,sum);

}





