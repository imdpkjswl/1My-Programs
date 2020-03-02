#include<stdio.h>

int main()

{
    int i,j;
    for (i=15;i>=1;i--) // using i-- means Decrement in i continuously by 1.
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",j);

        }
        printf("\n");
        }
    getch();

}
