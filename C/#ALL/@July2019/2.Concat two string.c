#include<stdio.h>

void main()
{
    char s1[50],s2[50];

    int i=0,j=0;
    printf("Enter first string\n");
    scanf("%s",s1);
    printf("Enter second string\n");
    scanf("%s",s2);

    while(s1[i] != '\0') i++;

    while(s2[j] != '\0')
    {
        s1[i++] = s2[j++];
    }

    s1[i] = '\0';

    printf("%s",s1);
}
