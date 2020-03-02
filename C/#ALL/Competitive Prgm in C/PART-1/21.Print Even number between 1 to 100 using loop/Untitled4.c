#include<stdio.h>

int main()

{
    int a,b;
    printf("Enter The integer, which is in between '2' and 'n' number\n");
    scanf("%d",&b);


    for(a=1;a<=b;a++)

       {
           if(a%2==0)
        printf("%d\n",a);


       }

       if(b<1)
     printf("Invalid Input\n");



    getch();


}
