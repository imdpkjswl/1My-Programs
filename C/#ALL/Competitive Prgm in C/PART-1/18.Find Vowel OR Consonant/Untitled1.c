/* Take a small letter alphabet as input and print whether it is vowel or consonant */

#include<stdio.h>

int main()

{
    char letter;
    printf("Enter The Small Letter\n");
    scanf("%c",&letter);

    if( letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
   /* || is logical or operator and it means that if any of the operands are true,then that part will execute.  */

    {
        printf("The %c is Vowel\n",letter);

    }
    else
    {
        printf("The %c is Consonant\n",letter);

    }
    getch();


}
