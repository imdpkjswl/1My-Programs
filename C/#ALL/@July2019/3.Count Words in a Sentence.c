#include<stdio.h>
#include<string.h>

int main()
{
    char str[1000];
    int i,count=1;

    printf("Enter a sentence to count there words\n");

    gets(str);

    for(i=0;i<strlen(str);i++)
    {
        if(str[i] == ' ')
            count++;

    }
    printf("%d\n",count);

}
