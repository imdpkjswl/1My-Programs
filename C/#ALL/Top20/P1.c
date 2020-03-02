//What is the output???

#include<stdio.h>

void main()
{


int j=0;


for(int i=0;i<100;i++)
{
       j=j++;      /*Another method:take temp variable
                                temp=j;
                                 j=j+1;
                                j=temp;   RESET */
}
printf("%d",j);

getch();

}
