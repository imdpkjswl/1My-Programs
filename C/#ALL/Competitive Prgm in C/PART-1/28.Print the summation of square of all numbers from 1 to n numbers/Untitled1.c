//program the summation of square from 1 to entered number.
//eg: 1^2 + 2^2 + 3^2 + 4^2 + 5^2 .......

#include<stdio.h>

int main()

{
    int i,j,sum=0;
    printf("Enter Number Till Wants Summation of Square from 1 to : ");
    scanf("%d",&j);

    for(i=1;i<=j;i++)
    {
        sum=sum+(i*i);

    }
    printf("%d\n",sum);
  getch();
}
