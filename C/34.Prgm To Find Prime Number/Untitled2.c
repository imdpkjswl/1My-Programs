#include<stdio.h>
#include<conio.h>
main()
{
    int x,i;
    printf("Enter A Number\n");
    scanf("%d",&x);
    for(i=2;i<=x-1;i++)
        if(x%i==0)
        break;

    if(i==x)

        printf("%d is a Prime Number\n",x);
    else
        printf("%d is not A  Prime Number\n",x);
        getch();
}



