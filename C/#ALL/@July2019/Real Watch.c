#include<stdio.h>
#include<windows.h>

void main()
{
    int n=1;
    int m=9900000;
    for(;m>n;)
    {
    SYSTEMTIME stime; ///SYSTEMTIME declared in header file.

    GetSystemTime(&stime);//Store data in structured type variable.

    printf("Current Time is :   %d / %d / %d ",stime.wHour,stime.wMinute,stime.wSecond);

    system("cls"); //Clear screen on each time.
    n++;
    }

}
