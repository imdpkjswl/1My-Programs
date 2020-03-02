///What will be result???


#include<stdio.h>

int main()
{
    int x=25;

    if(!!x)  ///This condition will run bcuz true
    {
        printf("%d",!x); ///!x means false =0 will print

    }

    else
        printf("%d",x);

    getch();


}
