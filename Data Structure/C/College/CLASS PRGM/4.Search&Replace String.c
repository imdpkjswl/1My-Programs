#include<stdio.h>
#include<conio.h>

void main()
{
    int i,j,k,l,pi,flag=0;
    char t[100],f[100],p[50],r[50];

    printf("Enter the text string\n");
    gets(t);//scanf("%[^\n]",t);

    printf("Enter the pattern string\n");
    gets(p);//scanf("%[^\n]",p);

    printf("Enter the replace string\n");
    gets(r);//scanf("%[^\n]",r);

    for(i=j=k=0;t[i]!='\0';j=0)
    {
        /// Partial string not found.

        if(t[i]!=p[j])
        {
            f[k++] = t[i++];
            continue;
        }

        /// Partial string found.

        pi=i;

        while(p[j]!= '\0' && t[i++] == p[j++]);

        if(p[j] != '\0')
        {
            i = pi;

            f[k++] = t[i++];
            continue;
        }

        l=0;

        while(r[l]!= '\0')
        {
            f[k++] = r[l++];

        }

        flag =1;

    }

    f[k]= '\0';

    if(flag == 0)
        printf("Pattern string is not found\n");

    printf("Result string :\n");
    puts(f);

    getch();

}
