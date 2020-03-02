/* Write A program that takes an integer an input 1 to 12 and print corresponding month name.[for example,if user enter 1 then print month january */

#include<stdio.h>

int main()

{
    int month;
    printf("Enter The Integer Between 1 to 12\n");
    scanf("%d",&month);

    if(month==1)
        printf("Month is January\n");  // here not used parenthesis bcuz the code written in only one line.

      else  if(month==2)
        printf("Month is February\n");

       else  if(month==3)
        printf("Month is March\n");

        else if(month==4)
        printf("Month is April\n");

       else  if(month==5)
        printf("Month is May\n");

        else if(month==6)
        printf("Month is June\n");

        else if(month==7)
        printf("Month is July\n");

      else  if(month==8)
        printf("Month is August\n");

       else  if(month==9)
        printf("Month is September\n");

        else if(month==10)
        printf("Month is October\n");

       else  if(month==11)
        printf("Month is November\n");

        else if(month==12)
        printf("Month is December\n");
    else
        printf("Invalid Input\n");




}
