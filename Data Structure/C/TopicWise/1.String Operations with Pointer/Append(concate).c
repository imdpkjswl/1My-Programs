#include <stdio.h> #include<string.h>

int main()
{

    char str1[100], str2[100];

    printf("Enter the first string: ");
    gets(str1);   // inputting first string

    printf("\nEnter the second string to be concatenated: ");
    gets(str2);   // inputting second string

    char *a = str1;
    char *b = str2;

    // pointing to the end of the 1st string
    while(*a)   // till it doesn't point to NULL-till string is not empty
    {
        a++;    // point to the next letter of the string
    }

    while(*b)   // till second string is not empty
    {
        *a = *b;
        b++;
        a++;
    }
    *a = '\0';  // string must end with '\0'
    printf("Concatenated string is : %s ", str1);

    return 0;
}
