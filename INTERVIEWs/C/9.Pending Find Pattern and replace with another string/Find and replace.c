/*
I takes different kind of thinking to solve a problem than a kind of thinking to produced the problem.
*/
#include<stdio.h>
#include<string.h>

/// Only work for same f=r condition..........

int main()
{
    char test[200],pat[50],rep[50],fin[200];
    gets(test);
    gets(pat);
    gets(rep);
    int l ,r , f ,i,j,k;

    l=strlen(test);
    r=strlen(pat);
    f=strlen(rep);

    int m=0;
    int n=0;

   for(i=0;i<=l-r;i++)
   {
       k=i;
       j=0;
       while(j!=r)
       {
           if(test[k]==pat[j])
           {
               test[k]=rep[m];
               ++m;
               ++j;
               ++k;
               continue;
           }
           break;
       }


        if(j==r)
        {

            puts(test);
            printf("Found at %d position\n",i);
            return i;
        }
   }

    return -1;

}




