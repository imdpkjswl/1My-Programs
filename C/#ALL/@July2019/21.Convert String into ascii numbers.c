#include<stdio.h>
#include<stdio.h>

void main()
{
    char str[200];
    int n[200];

    printf("Enter a string\n");
    scanf("%s",str);


    int j=0;
    while(str[j]  != '\0')
    {
        n[j] = (int)str[j];
        j++;
    }

    int i=0;

    while(str[i] != '\0')
    {
            printf("%d ",n[i++]);

    }
    printf("\n");


    getch();
    return;
}
