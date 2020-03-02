#include<stdio.h>

int main()

{

    char letter;
    printf("Enter The Letter : \n");
    scanf("%c",&letter);
    printf("The Capital Letter Of The Entered Letter : %c\n",letter-32);

     /*
     difference of the ASCII value between every lower and upper case is 32.
     */

    return 0;

}
