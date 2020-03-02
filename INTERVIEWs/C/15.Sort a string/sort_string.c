#include<stdio.h>
#include<string.h>

int main()
{
    char string[100];
    char temp;
    printf("Enter a string\n");
    scanf("%s",string);


    int i,j;
    int n=strlen(string);

    printf("Before : %s\n",string);

    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(string[i]>string[j])  /// Comparing ascii value of characters.
            {
                temp = string[i];
                string[i] = string[j];
                string[j] = temp;
            }
        }
    }

    printf("After : %s\n",string);

}
