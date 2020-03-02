#include<stdio.h>
// This Question had asked in CP External Exam.
#define x a*a
#define y b*b
/// Marcos will ignored,when it will used inside double quotes.
int main()
{

        int a,b,sum;

        printf("Enter two number\n");
        scanf("%d %d",&a,&b);

        sum=x+y;

        printf("Sum of square of %d and %d  is  :  %d",a,b,sum);

        return 0;

}
