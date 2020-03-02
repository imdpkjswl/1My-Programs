#include<stdio.h>

int main()

{
    float b,h;
    for(;;)
    {


    printf("Enter The Base And Height Of Triangle : ");
    scanf("%f%f",&b,&h);
    if(b == 123 && h == 321)    exit(0);
    printf("The Given Base And Height are %f  And %f unit , Whose Area is %f unit.\n\n",b,h,0.5*b*h);

    }
    getch();

}

