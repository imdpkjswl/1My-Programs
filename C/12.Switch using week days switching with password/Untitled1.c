#include<stdio.h>
#include<stdlib.h>


void main()

{
    int a;
    for(;;) {
    printf("1 for Monday,2 for Tuesday,3 for Wednesday,4 for Thrusday,5 for Friday,6 for Saturday,7 for Sunday\n");
    scanf("%d",&a);
    switch(a)
    {
        case 1 : printf("You have chosen MONDAY\n");
        break;
        case 2 : printf("You hvae chosen TUESDAY\n");
        break;
        case 3 : printf("You have chosen WEDNESDAY\n");
        break;
        case 4 : printf("You have chosen THRUSDAY\n");
        break;
        case 5 : printf("You have chosen FRIDAY\n");
        break;
        case 6 : printf("You have chosen SATURDAY\n");
        break;
        case 7 : printf("You have chosen SUNDAY\n");  break;
        case 9648103058 : exit(0);


       default    : printf("Invalid Input\n");    break;

    }
    }

getch();


}

