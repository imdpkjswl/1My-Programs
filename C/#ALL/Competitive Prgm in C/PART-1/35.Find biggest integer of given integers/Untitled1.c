#include<stdio.h>

int main()
{
    int r[10],i,max=0;
    printf("Enter 10 Integers\n");

    for(i=0;i<10;i++)
    {

      scanf("%d",&r[i]);

      if(r[i]>max)
      {
          max=r[i];
      }


    }

 printf("Biggest Integer :%d\n",max);
    getch();

}
