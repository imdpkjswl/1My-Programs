#include <stdio.h>

void  main () {

   int m,n,c;

   printf("Enter two numbers\n");
   scanf("%d %d",&m,&n);

   c=sum(&m,&n);

   printf("Sum =  %d",c);


   return;

}

int sum(int *a,int *b)
{
    int res;

    res=*a + *b;
    return res;
}

