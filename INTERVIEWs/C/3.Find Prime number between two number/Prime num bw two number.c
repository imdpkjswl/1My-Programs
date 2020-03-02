#include<stdio.h>
#include<conio.h>


void main()
{

    int num1,num2,ref,i;

    printf("Enter two numbers\n");
    scanf("%d %d",&num1, &num2);

    printf("Prime numbers between %d and %d are: \n", num1, num2);
//////////////////////////////////////////////////////////////////////////////////////////////
    while(num2>= num1)
    {
        ref=0;
        if(num1<2)  num1 = 2; // by default assigning 2 in num1 variable.
        for(i=2;i<=num1/2;i++) // Logic for prime number.
        {
            if(num1%i == 0)
            {
                ref =1;
                break;
            }

        }

        if(ref==0) // printing prime number between two given numbers.
        {
            printf("%d\t",num1);
        }
        num1++; // Incrementing num1 by +1.

    }

    getch();
}
