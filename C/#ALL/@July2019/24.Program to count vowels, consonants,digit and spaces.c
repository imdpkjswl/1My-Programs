#include<stdio.h>
#include<conio.h>

int main()
{
    int i,consonants,vowels,digits,spaces;
    char str[100];

    printf("Enter a string\n");
    scanf("%[^\n]",str);

    consonants=vowels=digits=spaces=0;

    for(i=0;str[i] != '\0';i++)
    {
        if(str[i]== 'a' || str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U')
        {
            vowels++;

        }
        else if(str[i]>='a' && str[i]<='z' || str[i]>='A' && str[i]<='Z')
        {
            consonants++;
        }

        else if(str[i]>='0' && str[i]<='9')
        {
            digits++;
        }

        else if(str[i]== ' ' || str[i]== '  ')
        {
            spaces++;
        }

    }


        printf("Consonants = %d\n",consonants);
        printf("Vowels = %d\n",vowels);
        printf("Digits = %d\n",digits);
        printf("Spaces = %d\n",spaces);

        getch();
        return 0;
}
