#include<stdio.h>

void main()
{
    int a,b,temp;
    printf("Enter Two Number\n");
    scanf("%d%d",&a,&b);

   /* a=a+b;
    b=a-b;
    a=a-b;
           */

           temp=a;
           a=b;
           b=temp;

    printf("Number Exchange: %d %d\n",a,b);
    getch();


}
