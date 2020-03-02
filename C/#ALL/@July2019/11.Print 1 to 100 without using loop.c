#include<stdio.h>


/// USING GOTO KEYWORD:-
/*
int main()
{
    int i=0;

    start:
        i=i+1;
        printf("%d\t",i);

        if(i<100)
                goto start;

            return 0;


}
*/

/// USING RECURSION MAIN FUNCTION:-
/*
int main()
{
    static i=1;

    if(i<=100)
    {
        printf("%d   ",i);
        i++;
        main();

    }

    return 0;

}
*/

/// USING RECURSION USER_DEFINED FUNCTION PRINT 100 to 1 :-
/*
void display(int num)
{
    if(num<=0)
        exit(0);

    printf("%d   ",num);
    display(num-1);

}

int main()
{
    int n=100;

    printf("Result is :\n");

    display(n);

    return 0;

}
*/
