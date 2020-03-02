#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void main(void)
{

    int count=0,len,i,index=0,j=0;
    char str[200],word[200],Temp[300];

    printf("Enter a sentence :\n");
    scanf("%[^\n]",str);

    printf("Input Sentence : %s\n",str);

    len = strlen(str);
    printf("Length of sentence : %d\n\n",len);

    for(i=0;i<len;i++)
    {
        if(str[index] != ' ')
        {
             word[j++] = str[index];

        }
        else
        {
            strcpy(Temp,word);
            strrev(Temp);
            if(strcmp(Temp,word) == 0)
            {
                count++;
                printf("Palindrome\n");
            }
            j=0;

        }
        ++index;


    }

    word[j] = '\0';

    printf("\nWord Sentence : %s",word);
    printf("\nTemp Sentence : %s",Temp);
    //printf("\n%d palindrome\n",count);

}
