#include<stdio.h>
#include<string.h>
/*
Input string:
MADAM

Output:
MM
MAAM
MADDAM
MADAADAM
MADAMMADAM
*/
void main()
{

    char a[50];
    int i,j;

    printf("Enter a string\n");
    scanf("%s",a);

    int len = strlen(a);

    for(i=0;i<len;i++)
    {

        for(j=0;j<=i;j++)
        {
            printf("%c",a[j]);
        }

        for(j=len-1-i;j<len;j++)
        {
            printf("%c",a[j]);
        }
        printf("\n");
    }
}
