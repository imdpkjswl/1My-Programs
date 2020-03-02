#include<stdio.h>
#include<math.h>
#include<conio.h>

void main()
{
    float a1,b1,c1,a2,b2,c2;
    float x,y;

    printf("Enter the coefficient a1,b1 and c1 of first linear equation\n");
    scanf("%f%f%f",&a1,&b1,&c1);
    printf("Enter the coefficient a2,b2 and c2 of second linear equation\n");
    scanf("%f%f%f",&a2,&b2,&c2);

/*
    Solving the given equation:

        a1x+b1y=c1  and a2x+b2y=c2   */

    x= (c1*b2-b1*c2)/(b2*a1-a2*b1);

    y= (a2*c1-a1*c2)/(b1*a2-a1*b2);


    printf(" x= %.2f  and y= %.2f",x,y);

    getch();

}
