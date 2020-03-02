#include<stdio.h>

void main()
{
   int num,bin,dec=0,base=1,rem;

    printf("Enter the binary numbers\n");
    scanf("%d",&num);

    bin=num;  ///Storing num value in bin

    while(num>0)
    {
        rem=num%10;  //finding the remainder
        dec=dec+(rem*base);  //formula
        num=num/10;
        base=base*2;

    }

    printf("\nThe binary is : %d\n",bin);

    printf("Its decimal value is : %d",dec);

    getch();

}
