#include<stdio.h>

void main()
{
   int n,r,sum=0;

   printf("Enter the number\n");
   scanf("%d",&n);

   while(n>0)
   {
       r = n%10;
       sum=sum+r;
       n=(n/10);
   }

   printf("Sum of digits : \n %d\n",sum);

   getch();


}
