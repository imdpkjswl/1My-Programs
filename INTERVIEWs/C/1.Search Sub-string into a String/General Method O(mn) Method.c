#include<stdio.h>
#include<conio.h>
#include<string.h>

/// Program to find substring into a string using general method.
/// It is applicable for only one string not string in file.
void main()
{
    int index;
    char Str[500],findStr[100];

    printf("Enter the string\n");
    scanf("%s",Str);
    printf("Enter the sub-string\n");
    scanf("%s",findStr);

    index = find_substring(Str,findStr);

    if(index == -1)
        printf("Sub-string not found.\n");
    else
        printf("Sub-string found at index %d .\n",index);

    getch();
}


int find_substring( char Str[] , char findStr[])
{
    int i,j,k,len;

    len = strlen(findStr);

    for(i=0;Str[i+len-1];i++)
    {
        k = i;

        for(j=0;j<=len-1;j++)
        {
            if(Str[k] != findStr[j])
                break;

            k++;
        }

        if(j==len)
            return (i);
    }

    return (-1);
}
