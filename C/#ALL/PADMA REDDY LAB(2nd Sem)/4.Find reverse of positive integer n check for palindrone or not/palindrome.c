#include<stdio.h>

///Without function...
/*
void main()
{
    int n,digit,rev=0,temp;

    printf("Enter a number to check for palindrome\n");
    scanf("%d",&n);

    temp=n;

    while(n!=0)
    {
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }

    printf("Reverse of %d is  %d\n",temp,rev);

    if(rev==temp)
        printf("%d is a palindrome number\n",temp);
    else
        printf("%d is not a palindrome\n",temp);
}
*/
///With function...
int is_palindrome(int n)
{
    int digit,rev=0,temp;

    while(n!=0)
    {
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }

    return rev;

}

void main()
{
    int n,res;

    printf("Enter a number to check for palindrome\n");
    scanf("%d",&n);

    res = is_palindrome(n);

    printf("Reverse of %d is  %d\n",n,res);


    if(res==n)
        printf("%d is a palindrome number\n",n);
    else
        printf("%d is not a palindrome\n",n);
}
