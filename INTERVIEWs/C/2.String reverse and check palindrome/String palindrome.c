#include<stdio.h>
#include<conio.h>


void main()
{
    int i,j;
    char str[500] ,cmp[500];

    printf("Enter sting\n");
    scanf("%s",str);

    for( i=0;str[i]!='\0';i++); // Length of string.

    for(j=0;str[j] != '\0';j++)
    {
        cmp[j] = str[i - 1 -j];

    }
    printf("%s\n",cmp);


    for(int k=0; k < i ; k++)
    {
        if(str[k] != cmp[k]) {
            printf("galti ho gaya, palindrome nahi9 hai\n");
            getch();
            return;
        }
    }
    printf("palindrome hai\n");
    getch();
    return;


}
