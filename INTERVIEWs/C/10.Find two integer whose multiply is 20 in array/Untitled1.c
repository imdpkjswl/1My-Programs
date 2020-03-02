/*
[2,3,6,4,7,9,11,14,13,5,8,23]
Find two integer that multiply is 20.
*/

#include<stdio.h>

void main()
{
    int i=0,j=0,k,l;
    int h=0;
    int a[]={2,3,6,4,7,9,11,14,5,13,8,23};



        while(h<12)
        {
            if((a[i]*a[h]) == 20)
            {
                printf("Integer : %d and %d gives after multiplication = %d\n",a[i],a[h],a[i]*a[h]);
                printf("Position of elements : %d  and %d \n",i,h);
                return;

            }

            ++h;
                if(h==12)
                {
                    h=0;
                    ++i;
                    continue; // Optional

                }

        }

}

