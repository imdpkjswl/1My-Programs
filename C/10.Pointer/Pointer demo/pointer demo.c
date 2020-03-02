#include<stdio.h>
#include<conio.h>

main()
{
    int x=5,*y;
    y=&x;
    printf("%d %u\n",x,y);
    printf("%d %u\n",y,&x);
    printf("%u",*&y);
    getch();

}
