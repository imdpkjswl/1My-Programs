///How many times loop iteration will take place in this program??


#include<stdio.h>

int main()
{

   for(int i=2;i<10;i++)

    switch(i)

    {


    case 1: i+=1;
    case 2: i+=2; ///here the 2nd iteration will stop due to i become 11 which come out from loop.
    case 4: i+=1;
    default: i+=3; ///first iteration i become 8,go for 2nd iteration
    break;

    }


}
