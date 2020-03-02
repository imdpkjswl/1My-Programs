#include<stdio.h>
#include<conio.h>

void main()
{
    int num,remd,sum=0;

    printf("Enter any number\n");
    scanf("%d",&num);

    while(num!=0) // whjle(n>0)
    {
        remd = num%10; /// Find last digit of number.
        sum = sum+remd;
        num = num/10;  /// To remove used last digit.
    }

    printf("%d\n",sum);

    getch();
    return;
}
