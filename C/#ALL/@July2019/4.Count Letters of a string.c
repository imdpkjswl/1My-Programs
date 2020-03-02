#include<stdio.h>
#include<string.h>

void main()
{
    char str[100];
    int len=0;
    puts("Enter a string");
    gets(str);

    len = strlen(str);

    int i,count;

    for( i=0;i<=len-1;i++)
    {

        if(str[i] == ' ') len--;

    }

    printf("\nLetter in a string : %d",i);

}
