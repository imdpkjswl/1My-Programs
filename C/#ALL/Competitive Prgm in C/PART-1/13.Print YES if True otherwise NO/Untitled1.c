#include<stdio.h>
int main()

{
    double gpa;
    printf("Enter The GPA 2.00 - 5.00 :\n");
    scanf("%lf",&gpa);

    if(gpa<5.00)
    {
        printf("NO\n");

    }
    if(gpa>10.00)
    {
        printf("Invalid Input");
    }
    else

        printf("YES");


    getch();

}
