///What is Result???

#include<stdio.h>

void main()

{
    int x=0;
    int y=13;

    do{
        y--;
        ++x;
    }

    while(x<5);  ///Due to while used x increased up to 5 & y decreased up to 7.

        printf("%d And %d",x,y);

        getch();


}
