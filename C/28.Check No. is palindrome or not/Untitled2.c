#include<stdio.h>

int main()
{
    int n,r,sum=0,temp;

    printf("Enter the numbers : ");
    scanf("%d",&n);
    temp=n;
    while(n>0)
    {
        r%10;
        sum=(sum*10)+r;
        n=n/10;
    }

    if(temp==sum)
        printf("Palindrome number\n");

    else
            printf("Not Palindrome number\n");

    getch();



}
