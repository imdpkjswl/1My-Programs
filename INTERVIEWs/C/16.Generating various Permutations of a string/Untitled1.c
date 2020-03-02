/// DisAdvantage: The input string letters must not be repeated.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define SWAP(x,y,temp) (temp = x,x = y,y = temp)

void fun(char a[],int i,int n)
{
    int j;
    char temp,d="deekap";

    if(i==n)
    {
        printf("%s ",a);
    }

    else
        for(j=i;j<=n;j++)
        {
            SWAP(a[i],a[j],temp);
            fun(a,i+1,n);
            SWAP(a[i],a[j],temp);
        }
}


void main()
{
    char a[20];
    printf("Enter a string: ");
    scanf("%s",a);

    printf("Permutations\n");
    fun(a,0,strlen(a)-1);
}
