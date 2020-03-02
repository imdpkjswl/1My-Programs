#include<stdio.h>
#include<process.h>

void main()

{
    int a;
    printf("1 for Monday,2 for Tuesday,3 for Wednesday,4 for Thrusday,5 for Friday,6 for Saturday,7 for Sunday\n");
    scanf("%d",&a);
    switch(a)

    {
        case 1 : printf("You have chosen MONDAY");
        break;
        case 2 : printf("You hvae chosen TUESDAY");
        break;
        case 3 : printf("You have chosen WEDNESDAY");
        break;
        case 4 : printf("You have chosen THRUSDAY");
        break;
        case 5 : printf("You have chosen FRIDAY");
        break;
        case 6 : printf("You have chosen SATURDAY");
        break;
        case 7 : printf("You have chosen SUNDAY");
        break;

    default : printf(" You have entered Invalid Input");
    break;

    }

getch();


}

