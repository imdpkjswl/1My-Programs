///Program To Find Real And Complex Roots Of Quadratic Equation.

#include<stdio.h>
#include<math.h>

void main()
{
    float a,b,c,D,Root1,Root2,Real,Img;

    printf("Enter Coefficients a,b and c :  ");
    scanf("%f%f%f",&a,&b,&c);

    D=b*b-4*a*c;

    if(D>0)
    {
        Root1=(-b+sqrt(D))/(2*a);
        Root2=(-b-sqrt(D))/(2*a);
      printf("\nThe Roots are Real And Distinct \nRoot1= %.2f And Root2= %.2f\n",Root1,Root2);

    }
    else if(D==0)
    {
        Root1=Root2=-b/(2*a);
        printf("\nThe Roots are Real And Same \nRoot1 = Root2= %.2f\n",Root1);

}
else if(D<0)
{
    Real= -b/(2*a);
    Img= sqrt(-D)/(2*a);
    printf("\nThe Roots are Complex And Conjugate \nRoot1= %.2f+%.2fi And Root2= %.2f-%.2fi\n",Real,Img,Real,Img);


}


    getch();



}
