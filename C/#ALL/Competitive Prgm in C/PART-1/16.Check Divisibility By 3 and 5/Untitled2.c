#include<stdio.h>

int main()

{
    int num;
    printf("Enter The Number To Check Divisible By 3 And 5\n");
    scanf("%d",&num);

    if(num%3==0 && num%5==0)
    {
        printf("The Entered Number %d is DIVISIBLE 3 And 5\n",num);

    }

    else
{


        printf("The Entered Number %d is NOT DIVISIBLE 3 And 5\n",num);
    }
    getch();


}
