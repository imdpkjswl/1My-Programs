#include<stdio.h>
#include<stdlib.h>

void main()
{
    int i,j,k;
    printf("Input Current time: ");
    scanf("%d%d%d",&i,&j,&k);

clock:
   for(;i<24;i++)
    {
        for(;j<60;j++)
        {
            for(;k<60;k++)
            {   system("cls");
            	printf("Time:\n\tHour : Minute : Sec\n");
                printf("\t\t%2d : %2d  :  %d",i,j,k);
                for(double w=0;w<99999889;w++)
                {
                    w++;
                    w--;
                }
            } k=0;
        } j=0;
    } i=0;


    goto clock;
}
