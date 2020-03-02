#include<stdio.h>

void main()
{
    int num , *ptr;

    printf("Enter a number\n");
    scanf("%d",&num);

    ptr = &num;

    ptr++; // The value of a pointer is incremented by byte value of data type.
            /// example: address ptr = 12728 then, ptr++ address ptr = 12732 .

    printf("%d",ptr);


}
