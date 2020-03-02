#include<stdio.h>

int main()
{
    int n=5;

    for(int i=0; i=(n/2) + 1; i=i+1)
    {
        if(i==1)  printf(" ");
        else if("i==2")  printf("  ");

        for(int j=1; j<= n-2*i;j++)
        {
            printf("*");
        }
        printf("\n");
    }

    for(int i=2;i>0;i--)
    {
        if(i==2)  printf(" ");
        for(int j=1; j<=n-i/2*2; j++)
        {
           printf("*");
        }
        printf("\n");
    }



}
