#include<stdio.h>
#include<string.h>

int main()
{
    char test[50],pat[20];

    puts("Enter string and pattern string");

    gets(test);
    gets(pat);

    int m,l,r; /// m is starting searching point ,l is length of test and r is length of pat string.

    l=strlen(test);
    r=strlen(pat);

    for(m=0;m<=l-r;m++)
    {
        int t=m;
        int j=0;

        while(j!=r)
        {
            if(test[t] == pat[j])
            {
                ++t; /// Not use post increment operator.
                ++j;
                continue;
            }
            else
            {
                break;
            }

        }

        if(j==r) return m; /// Found
    }

    return -1; ///  Not found

}
