#include<stdio.h>
#include<stdio.h>
#include<conio.h>

/*
///Program to reveres a string without using built in function.
void main()
{
    char s[100];

    printf("Enter a string to Reverse\n");
    scanf("%s",s);

    ///For built in function :  strrev(s);
    int i=0,j=0;


    while(s[j]!= '\0') j++;  /// j is length of string...

    for(i=j-1;i>=0;i--)
    {
        printf("%c",s[i]);
    }
}
*/

/// 1.Program to Print given pattern.
/*   *
     **
     ***
     ****
     *****
*/
/*
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=1;j<=5;j++)
        {
            if(i>=j)
                printf("*");
            else
                printf(" ");
        }

        printf("\n");
    }
}
*/
///////////////////////////////////////////////
/* Another Method:
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("*");
        }

        printf("\n");
    }
}
*/

/// 2.Program to Print given pattern.
/*
     *****
      ****
       ***
        **
         *
*/
/*
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=1;j<=5;j++)
        {
            if(i<=j)
                printf("*");
            else
                printf(" ");
        }

        printf("\n");
    }
}
*/
/// 3.Program to Print given pattern.
/*
    *
   **
  ***
 ****
*****

*/
/*
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=1;j<=5;j++)
        {
            if(j>=6-i)
                printf("*");
            else
                printf(" ");
        }

        printf("\n");
    }
}
*/

/// 4.Program to Print given pattern.
/* BackSlash Diagonal
*
 *
  *
   *
    *
*/
/*
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=1;j<=i;j++)
        {
            if(i<=j)
                printf("*");
            else
                printf(" ");
        }

        printf("\n");
    }
}
*/
// Another Method : Best way...
/*
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=1;j<=i;j++)
        {
            if(i>=2 && j<=i-1)
                printf(" ");
            else
                printf("*");
        }

        printf("\n");
    }
}
*/

/// 5.Program to Print given pattern.
/*

*****
****
***
**
*

*/
/*
void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=5;j>=i;j--)
        {

                printf("*");

        }

        printf("\n");
    }
}
*/
/// 6.Program to Print given pattern.
/* Forward Diagonal

    *
   *
  *
 *
*

*/

void main()
{
    int i,j;

    for(i=1;i<=5;i++)
    {
        for(j=5;j>=i;j--)
        {
            if(i>=5 && j>=i-5)
                printf("*");
            else
                printf(" ");

        }

        printf("\n");
    }
}
