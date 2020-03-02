#include<stdio.h>
#include<string.h>

int main()
{
    char main[50], pattern[20];


    gets(main);
    gets(pattern);

    puts(main);

    int m = strlen(main), p = strlen(pattern);  // l is length of main string and r is length of sub string.

    for(int orig = 0; orig <= m-p; orig++)
    {
        int k;

        printf("%d\n", orig);
        for(k = orig; p!=k-orig; k++)
        {

            if (main[k] != pattern[k-orig]) break;
            printf("%d\n", k);
        }


        if (k-orig == p)
        {
            printf("Sub-string found\n");
            return orig;    //pattern found
        }
        else  continue;
    }

    printf("Sub string not found\n");
    return -1;

}
