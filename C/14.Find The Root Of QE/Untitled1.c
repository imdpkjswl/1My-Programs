#include<stdio.h>
#include<stdlib.h>

int main()

{
    float a,b,c,D;
    printf("Enter The Coefficients of Quadratic Equation In Given Format ax2+bx+c : ");
    scanf("%f %f %f",&a,&b,&c);
    printf("a=%f , b=%f , c=%f\n\n",a,b,c);
    D=b*b-4*a*c;


    if(D<0)
    {
        printf("Roots Are Imaginary of %f\n\n",D);

    }
    else
    {
        printf("Value Of Discriminant D = %f \n\n",D);

    }

    if(D==0)
    {
        float r=(-b+sqrt(D))/2*a;
        printf("Roots Are Real And Equals %f\n\n",r);
    }
    else
    {
        float r1=(-b+sqrt(D))/2*a;
        float r2=(-b-sqrt(D))/2*a;
        printf("The Roots of Entered Quadratic Equation %fX2+%fX+%f is Given Below :\n\n",a,b,c);
        printf("The First Root Is =  %f\n\n",r1);
        printf("The Second Root is = %f\n\n",r2);

    }

    getch();
}
