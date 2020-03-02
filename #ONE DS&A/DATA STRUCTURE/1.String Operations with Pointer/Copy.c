#include<stdio.h>
#include<stdlib.h>

void strCopy(char *dest , char *source)
{
    char *i,*j;// Here i and j will act as pointer type array.

    i=source;// store address of first index of source.
    j=dest;  // // store address of first index of dest.

    while(*i) ///Iterate till the last index without considering null.
    {
        *j = *i;
         i++;
         j++;
    }

    *j = '\0';
}

void main()
{
    char str1[] ="deepak jaiswal";
    char str2[50];

    strCopy(str2,str1);

    printf("Copied string : %s",str2);
}
