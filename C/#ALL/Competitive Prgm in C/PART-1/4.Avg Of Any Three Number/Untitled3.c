#include<stdio.h>

int main()

{
    double x,y,z,avg;  // here double is used bcuz it contain 0 upto 15 digits
    printf("Enter The Three Number To Finding Average\n");
    scanf("%lf%lf%lf",&x,&y,&z);
    avg=(x+y+z)/3;

    printf("Average Of %lf,%lf and %lf are : %lf\n",x,y,z,avg);
    getch();

}
