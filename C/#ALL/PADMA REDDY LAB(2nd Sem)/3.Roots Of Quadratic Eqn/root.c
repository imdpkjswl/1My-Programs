#include<stdio.h>
void main()
{
    float a,b,c,d,r1,r2;

    printf("Enter the coefficients of quadratic equation\n");
    scanf("%f %f %f",&a,&b,&c);

    d=b*b-4*a*c;

    if(d==0)
    {
        printf("Roots are Equal\n");

        r1=r2= -b/(2*a);

        printf("\nRoots are :  R1 = %.3f and R2 = %.3f\n",r1,r2);
        return;

    }
    else if(d > 0)
    {
        printf("Roots are Real\n");

        r1= (-b+sqrt(d))/(2*a);
        r2= (-b-sqrt(d))/(2*a);

        printf("\nRoots are :  R1 = %.3f and R2 = %.3f\n",r1,r2);
        return;

    }
    else if(d < 0)
    {
        printf("Roots are Complex\n");

        r1= (-b)/(2*a);
        r2= sqrt(-d)/(2*a);

        printf("\nRoots  are :  R1 = %.3f + %.3fi and R2 = %.3f - %.3fi \n",a,b,c,r1,r2,r1,r2);
        return;
    }
}
