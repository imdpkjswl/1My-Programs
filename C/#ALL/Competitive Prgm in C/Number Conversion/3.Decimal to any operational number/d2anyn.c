#include<stdio.h>

void main()
{
    int n,sum=0,digit,b;

    printf("Enter the number and base number\n");
    scanf("%d%d",&n,&b);

    while(n>0)  ///Or use n!=0
    {
        digit=n%b;
        sum=sum*10+digit;
        n=n/b;

    }
    printf("Equivalent Result:%d\n",sum);

    getch();

}
