#include<stdio.h>

int main()
{

   int i,j;
   for(i=1;i<=6;i++)

   {
      for(j=i;j<=(i*i);j=i+j)
	  {

	     printf("%d ",j);
		 }

		 printf("\n");
		 }

		 getch();
		 }
