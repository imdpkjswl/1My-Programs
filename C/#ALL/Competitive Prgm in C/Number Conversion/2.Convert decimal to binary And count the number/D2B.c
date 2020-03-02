#include<stdio.h>
#include<conio.h>


void main()
{
    long num,dec,rem,base=1,bin=0,nof1s=0; //long is used for store the decimal number.rem is remainder and nof1s is no. of 1s

    printf("Enter the decimal number\n");
    scanf("%ld",&num);

    dec=num;  //storing yhe num value into the dec.

    if(num<0)
    {
        exit(0);
    }

    while(num>0)
    {
        rem=num%2;

  if(rem==1)
        {
            nof1s++;  ///checking the 1's count in the program.
        }

        bin=bin+(rem*base);
        num=num/2;
        base=base*10;

    }

    printf("Input number is : %d\n",dec);
    printf("Its binary value is : %d\n",bin);
    printf("No. of 1's in the binary number is : %d",nof1s);

    getch();

}
