#include<stdio.h>

int main()

{
    int i=0;
    int j=0;
    j=i++ + ++i; //i++ means pre increment and i++ means post increment
    printf("%d%d",i,j);  //output : 22
    getch();
}
