#include<stdio.h>
#include<conio.h>

/// A positive integer is called an Armstrong number of order n if abcd... = a^n + b^n + c^n + d^n + ...
void main()
{
    int num,temp,digit,rem,sum=0;

    printf("Enter the number of digit and as well any number\n");
    scanf("%d %d",&digit,&num);

    temp = num;

    while(num!=0)
    {

        rem = num%10;
        if(digit == 4)
                sum= sum + (rem*rem*rem*rem);
        else
                sum= sum + (rem*rem*rem);
        num=num/10;

    }

    if(sum == temp)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");


        getch();


}
