
#include<stdio.h>

int main()
{
    float n,i;

    printf("Enter any number:  ");
    scanf("%f",&n);

    for(i=0.001;(i*i*i)<n;i=i+0.001); /// Equating (i*i*i) to n with difference of 0.001.

        printf("Cube Root of %0.2f is  %0.2f",n,i);


        getch();

}
