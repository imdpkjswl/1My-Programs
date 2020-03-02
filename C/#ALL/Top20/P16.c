///Predicate the Output???

#include<stdio.h>

int main()
{
   int count=9;
   int t=0;
   int n=(count+7)/8;
   switch(count%8)
   {
       case 0: do { t++;
        case 4: t++;
        case 3: t++;
        case 2: t++;
        case 1: t++;  ///Why the first case started from case 1.

   }

   while(--n>0);  ///for first 1>0 AGAIN Loop will repeat and
                  /// second time n=0>0 condition fail,program come out from loop.
   printf("%d",t);

}
getch();
}
