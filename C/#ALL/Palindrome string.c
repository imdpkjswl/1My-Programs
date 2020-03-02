#include<stdio.h>
#include<string.h>


void main()
{
    char str1[100],str2[100];
    int i=0,j=0,len=0;

    printf("Enter a string\n");
    scanf("%s",str1);

    while(str1[len] != '\0') len++;

    for(i=len-1;i>=0;i--)
    {
        str2[j] = str1[i];
        j++;
    }
    str2[j] = '\0';

    printf("\nEntered string :  %s\n",str1);
    printf("Reversed string :  %s\n",str2);



        if(strcmp(str1,str2)==0)
            printf("String is a Palindrome\n");
        else
            printf("String is not a Palindrome\n");

}

