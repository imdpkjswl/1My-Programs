#include<stdio.h>

int main()
{



int i,j;
for(i=0;i<8;i++) //outer loop
{
    for(j=0;j<=i;j++) //inner loop
    {
        printf("*");

    }
    printf("\n");

}
getch();

}
