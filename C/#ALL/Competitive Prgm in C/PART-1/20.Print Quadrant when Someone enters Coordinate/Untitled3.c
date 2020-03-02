#include<stdio.h>

int main()

{
    int x,y;
    printf("Enter the value of x and y coordinate :\n");
    scanf("%d%d",&x,&y);

    if(x>0 && y>0)
        printf("First Quadrant\n");

    else if(x<0 && y>0)
        printf("Second Quadrant\n");

    else if(x<0 && y<0)
        printf("Third Quadrant\n");

    else
        printf("Fourth Quadrant\n");
    getch();



}
