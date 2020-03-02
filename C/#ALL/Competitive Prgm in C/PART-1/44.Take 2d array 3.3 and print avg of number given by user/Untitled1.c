#include<stdio.h>

void main()
{
    int n[2][2];
    int i,j,sum=0;
    float avg;

    printf("Enter The four number\n");

    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            scanf("%d",&n[i][j]);

            sum=sum+n[i][j];


        }


    }

    avg=sum/(2*2);
    printf("Average is %.2f",avg);

    getch();



}
