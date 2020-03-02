#include<stdio.h>

int add(int *m , int *n)
{

    int addition;

    addition = *m + *n ;

    return addition;

}

void main()
{

    int a, b , res;
    int *m,*n;

    printf("Enter two number\n");
    scanf("%d %d",&a,&b);

    m = &a;
    n = &b;

    res = add(m,n);

    printf("Sum of %d and %d is :  %d",a,b,res);
}
