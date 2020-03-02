#include<stdio.h>

int main()
{
    int i,sum=0;
    for(i=101;i>=1;i-=2 )  // -=2 means at  2-1==1 loop will be off.
    {
        sum= sum+i;
    }
    printf("%d\n",sum);

  getch();
}
