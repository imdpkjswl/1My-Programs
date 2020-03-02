#include<stdio.h>


void main()
{
    int a,b,min,i;

    printf("Enter a number to check numbers are co-prime or not\n");
    scanf("%d %d",&a,&b);

    min=a<b?a:b;

    for(i=2;i<=min;i++)
    {
        if(a%i==0 && b%i==0) /// Logic for co-prime.
           {
             break;
           }
    }

    if(i==min+1)
        printf("%d and %d are co-prime numbers\n",a,b);
    else
        printf("%d and %d are not co-prime numbers\n",a,b);

}
