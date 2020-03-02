
#include<stdio.h>
#include<string.h>
/*
Problem to replace any specific letter by any specific letter or symbol in the given string.
Example:  Replace e --> *         ,  deepak to d**pak

*/
void main()
{
    char a[50];

    puts("Enter any string\n\n");
    gets(a);
    char rep = '*';
    int len = strlen(a);

    int i;
    for(i=0;i<len;i++)
    {
        if(a[i] == 'e' || a[i] == 'E')
        {
            a[i] = rep;
            i+1;;
        }
    }

    puts("After replaced :");
    puts(a);

    return;

}
