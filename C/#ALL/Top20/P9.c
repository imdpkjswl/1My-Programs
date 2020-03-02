#include<stdio.h>

int main()
{
    int x=5, y=10;

    if(!(!x) && x) /// Same as NOT(Operator) gate.
        printf("%d",x);

    else
        printf("%d",y);

    getch();

}
