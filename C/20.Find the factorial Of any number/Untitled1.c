///Using Recursive Property To call itself.

#include<stdio.h>

int fact(int);

void main()
{
    int n,res;

    printf("ENTER THE NUMBER\n");
    scanf("%d",&n);

    res=fact(n);

    printf("The Factorial of %d is %d\n",n,res);

    getch();



}

    int fact(int x)

    {

        int f;
        if(x==1)
            return(1);
    else
        f=x*fact(x-1);
    return(f);

}

