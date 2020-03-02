#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<windows.h> ///This header file helps to print date time related data.

//Program to print date and time using windows.h header file
void main()
{
    SYSTEMTIME stime; /// SYSTEMTIME is declared in header file.

    GetSystemTime(&stime); /// storing values in new structured type data type.

    printf("Current System time is  %d / %d / %d \n",stime.wHour,stime.wMinute,stime.wSecond);
    printf("Current System date is  %d / %d / %d ",stime.wDay,stime.wMonth,stime.wYear);
    getch();
}
/*
void main()
{
    int hh,mm,ss;
    char TimeExtension[5];

    printf("Enter 12hr format time.Ex: 02:12:56 AM OR 02:12:56 PM\n");
    scanf("%d %d %d %s",&hh,&mm,&ss,TimeExtension);

    if(hh==12)
        hh=hh-1;

    ///Checking time format is AM or PM
    if(strcmp(TimeExtension,"AM")==0 || strcmp(TimeExtension,"PM")==0)
    {   ///Checking possible time format
        if(hh>12 || hh<1|| mm>59 || mm<0 || ss>59 || ss<0)
        {
            printf("Invalid Time Format...\n");
            return;
        }
        ///Comparing AM or PM to convert into Military time format.
        if(strcmp(TimeExtension,"AM")==0)
            hh=hh;

        if(strcmp(TimeExtension,"PM")==0)
            hh+=12;
    }
    else
        {
            printf("Invalid Input,Enter the correct data\n");
            return;
        }

    printf("Military time format is :\n");
    printf("%d : %d : %d\n",hh,mm,ss);

}
*/

