#include<stdio.h>

int main()

{
    int num;
    printf("Enter Any Number\n");
    scanf("%d",&num);

    if(num%2==0)
        printf("The Entered Number %d is Even\n",num);
    else
        printf("The Entered Number %d is Odd\n",num);

    getch();

}
