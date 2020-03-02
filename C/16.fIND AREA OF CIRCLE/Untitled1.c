#include<stdio.h>
int main()

{
    float r,a;
    printf("Enter The Radius Of Circle : ");
    scanf("%f",&r);
    a=3.142*r*r;
    printf("The Given Circle Radius %f unit , Whose Area is %f unit. ",r,a);
    getch();
}
