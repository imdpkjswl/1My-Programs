#include"stdio.h"
#include<conio.h>

/*
void main()
{
    int n1,n2,n3,num,i;

    n1=0;
    n2=1;


    printf("Enter the value of n\n");
    scanf("%d",&num);

    printf("%d\n%d\n",n1,n2);

    for(i=2;i<num;i++)
    {
        n3 = n1+n2;
        printf("%d\n",n3);
        n1 = n2;
        n2 = n3;

    }

    getch();
}
*/

int fib(int n)
{
    if(n==1) return 0;
    if(n==2) return 1;

    return fib(n-1)+fib(n-2);

}

void main()
{
    int num,res,i;
    printf("Enter the value of n\n");
    scanf("%d",&num);

    printf("%d fibonacci numbers are :\n",num);

    /// printf("%d",fib(num));   // Fibonacci tern at n place.

    for(i=1;i<=num;i++)
    {
        res = fib(i);
        printf("%d\t",res);

    }

}
