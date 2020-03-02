///What will be outout???

#include<stdio.h>

void main()
{
    char arr[5] ="Hello";  ///Here array size is 5,in which no space for null character,so unknown value will print after Hello.

    printf("%s",arr);

    getch();

}

