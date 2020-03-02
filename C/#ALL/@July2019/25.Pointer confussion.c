#include<stdio.h>
#include<conio.h>
/*
void main()
{

void main()/// This will not run.
{
    int x=10;
    int *ptr;

    ptr=&x; // Assign after declaration.SEE THE DIFFERENCE.

    *ptr =4;

    printf("%d",*ptr);

}

    int x=10;
    int *ptr=&x; // Assign just after declaration.

    *ptr =6;

    printf("%d",*ptr);

}
*/

void main() // Original
{
    printf("Inside 1st main\n");
        func();
}
#define main func  ///Don't put this on top of the original main function.
void main() // Macros
{
    printf("Inside 2nd main\n");
}

