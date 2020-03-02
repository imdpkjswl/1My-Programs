//Write a program which Allows Integer Input Only

#include<stdio.h>


main()
{
    int x=0; // initial value is zero.
    for(;;)   // used infinite loop
        {
    x=GetIntegerOnly(); // Access the user define function.
    if(x<=0) exit(0); // condition for false to exit from program.
    printf("\nYou Have Entered %d\n\n",x);
}    getch();
}
int GetIntegerOnly()  // user define function.
{
    int num=0,ch; // input initial value is zero.
    do
    {
        ch=getch();  // here we getting a character from keyboard.
        if(ch>=48&&ch<=57) // ASCII code of zero is 48 and nine is 57 And Checking the num b/w 0-9 only.
        {
            printf("%c",ch); // here we have dine eco.
            num=num*10+(ch-48); // till here this working when condition will be true.
        }
        if(ch==13) // here is used for exit the program when has been false.
            break;
    }while(1); // Run When the condition will be true
    return(num);
}
