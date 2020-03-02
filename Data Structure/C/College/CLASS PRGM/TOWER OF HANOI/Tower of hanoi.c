#include<stdio.h>

void Tower(int n, char source,char temp,char dest)
{

        if(n==0) return;

        Tower(n-1,source,dest,temp);

        printf("Move %d disk from %c to %c\n",n,source,dest);

        Tower(n-1,temp,source,dest);
}

void main()
{
    int n;

    printf("Enter the number of desk\n");
    scanf("%d",&n);

    Tower(n,'A','B','C');

    return;

}
