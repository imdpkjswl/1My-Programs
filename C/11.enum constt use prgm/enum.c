#include<stdio.h>
void main()
{
    enum weeks{MON=1,TUE,WED,THU,FRI,SAT,SUN};
    enum weeks day;
    day=WED;
    printf("%d",day); //output :3
    day++;
    printf("%d",day); // output:4
    getch(); // print on screen 34
}
