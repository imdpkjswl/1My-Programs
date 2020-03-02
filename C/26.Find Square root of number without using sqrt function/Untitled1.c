#include<stdio.h>

int main()
{
    float n,i;

    printf("Enter Any Number\n");
    scanf("%f",&n);

    for(i=0.001;i*i<n;i=i+0.001); ///here only comparing the i*i to n with approx value 0.001.
    printf("%0.2f",i);

    getch();

}
