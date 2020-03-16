/*
#include<stdio.h>
#include<conio.h>

int length(char *Str)
{
    int len=0;

    while(*Str != '\0')
    {
        len++;
        Str++;
    }

    return len;

}
void main()
{
    char Str[100];

    puts("Enter a string\s");
    gets(Str);

    printf("Length of string : %d\n",length(Str));

    getch();

    return;
}
*/
/// Another best method to find length through POINTER concept:
#include<stdio.h>

int length(char *Str)
{
    int len=0;

    while(*Str)
    {
        len++;
        Str++; /// Terminated when last index will found.
    }

    return len;

}
void main()
{
    char Str[100];

    puts("Enter a string\s");
    gets(Str);

    printf("Length of string : %d\n",length(Str));

    getch();

    return;
}
