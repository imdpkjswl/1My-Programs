///What will be result??

#include<stdio.h>

int main()
{
    int array[3] ={5};  ///HERE IT CONTAIN {5,0,0} ,THIS VALLUE WILL BE PRINT.

    int i;

    for(i=0;i<=4;i++)  /// aRRAY SIZE ONLY 3,AFTER THIS  ANY GARBAGE VALUE WILL PPRINT.
    {


        printf("%d\n",array[i]);
    }


}

