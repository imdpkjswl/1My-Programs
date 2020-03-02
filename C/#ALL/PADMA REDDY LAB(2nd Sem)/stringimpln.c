#include<stdio.h>

///Finding length of string.
int mystrlen(char s[])
{
    int i=0;

    while(s[i] != '\0') i++;

    return i;
}

///Concatenate two string .

void mystrcat(char s1[], char s2[])
{
    int i,j;
    i=0;
    j=0;

    while(s1[i] != '\0')
    {
        i++;
    }

    while(s2[j] != '\0')
    {
        s1[i++] = s2[j++];

    }

    s1[i++] ='\0';
}
///Compare two string
int mystrcmp(char s1[] , char s2[])
{
    int i=0;

    while(s1[i] == s2[i])
    {
        if(s1[i] == '\0') break;

        i++;
    }

    return s1[i] - s2[i];
}

void main()
{
    char s1[10] , s2[10];

    printf("Enter the first string\n");
    scanf("%s",s1);

    printf("Enter the second string\n");
    scanf("%s",s2);

    printf("Length of first string is : %d\n",mystrlen(s1));
    printf("Length of second string is : %d\n",mystrlen(s2));

    if(mystrcmp(s1,s2)> 0)
            printf("String S1 > S2\n");
    else if(mystrcmp(s1,s2) < 0)
            printf("String S1 < S2\n");
    else
            printf("String S1 = S2\n");

    mystrcat(s1,s2);

    printf("%s",s1);

}
