#include <stdio.h>



int main()
{
        int n,result, count = 1;

    printf("Enter the Row\n");

        scanf("%d",&n);

        for(int i = 1; i<=n; i++)
        {
            for( int j = 1; j <= i; j++)
            {
                result=count++;  ///another prgm replace one + by Any no.(eg: 1)
                printf("%d  ",result); ///or use printf("%d ",count++);
            }
            printf("\n");
        }
        getch();
}







