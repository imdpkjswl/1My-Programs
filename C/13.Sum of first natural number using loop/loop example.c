//Program to calculate first natural numbers
// positive integers 1,2,3,.....,n are the known as natural numbers

#include<stdio.h>
int main()

{
    int num,count,sum=0;
    printf("Enter A Positive Number : ");
    scanf("%d",&num);

     // Using for loop terminates,when num is less than count
     for(count=1; count<=num; count++)
     {
         sum += count;
     }
     printf("Sum Of First n Natural Number = %d\n",sum);
     return 0;
}
