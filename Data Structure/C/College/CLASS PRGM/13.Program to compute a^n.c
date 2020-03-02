#include<stdio.h>

int power(int a, int n)
{
    if(n == 0) return 1;

    return a*power(a,n-1);

}

void main()
{
    int a,n,sum;

    printf("Enter the base and power value\n");
    scanf("%d %d",&a,&n);

    sum = power(a,n);

    printf("RESULT :  %d^%d  is  %d\n",a,n,sum);

    return;
}
