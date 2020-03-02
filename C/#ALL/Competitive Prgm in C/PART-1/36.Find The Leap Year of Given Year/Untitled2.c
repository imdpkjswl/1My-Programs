#include<stdio.h>

int main()
{
    int year;
    printf("Enter The year to check whether it is a leap year or not\n");
    scanf("%d",&year);

    if(year%400==0 || year%100!=0 && year%4==0 )
        printf("%d is a leap year\n",year);
    else
        printf("%d is not a leap year\n",year);
    getch();

}
