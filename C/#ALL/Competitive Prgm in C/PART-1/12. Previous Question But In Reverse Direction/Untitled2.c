#include<stdio.h>

int main()


{


    char letter;
    printf("Enter The Letter :\n");
    scanf("%c",&letter);
    printf("The Small Letter Of Entered Letter :%c\n",letter+32);

    /*
     difference of the ASCII value between every upper and lower case is 32.
     */

    getch();
}
