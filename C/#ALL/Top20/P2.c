/*What is result??
 int x=5;
int boolean b1 = 'true';
    int boolean b2 = 'false';

    if((x==4) && !b2)
     printf 1;
      printf 2;

      if((b2='true') && b1)
      printf 3;
                       */


#include<stdio.h>

void main()

{
    int x=5;
   int  b1 = 'true';  ///Write in single quotation.
    int  b2 = 'false';

    if((x==4) && !b2)
    {
        printf("1"); ///due to false statement, mp skip this step.


    }
     printf("2");  ///this will run due to it is not in if condition.

    if((b2='true') && b1)
    {
        printf("3");  ///Run due to true condition.

    }

     getch();

}
