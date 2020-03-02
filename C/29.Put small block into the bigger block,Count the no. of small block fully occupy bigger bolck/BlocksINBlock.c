///Put the number of blocks into the bigger block by taking input from the user.

#include<stdio.h>
#include<conio.h>

void main()
{

    float L1,B1,A1,L2,B2,A2,co;


    printf("Enter the length and breadth of Bigger block\n");
    scanf("%f%f",&L1,&B1);

    printf("Enter the length and breadth of Smaller block\n");
    scanf("%f%f",&L2,&B2);

    A1 = L1*B1;
    A2 = L2*B2;
    co = A1/A2;
if(L1<L2  && B1<B2)

    printf("Enter the correct data, Try Again\n");
else
    printf("Number of Block Requires : %.1f",co);

}
