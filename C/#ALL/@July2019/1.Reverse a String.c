                                             #include<stdio.h>
#include<string.h>

int  main()
{
    char str[100];

    printf("Enter a String\n");
    scanf("%s",str);

    int length = strlen(str);
    // while(str[length] != '\0') length++;


    length = length-1;  // To taking out length of null by doing minus 1.


    for(int i=length;i>=0;i--)
    {
        printf("%c",str[i]);
    }
    printf("\n");

    return 0;

}
