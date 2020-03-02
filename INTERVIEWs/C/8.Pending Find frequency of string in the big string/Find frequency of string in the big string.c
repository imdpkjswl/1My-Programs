#include <stdio.h>
#include <string.h>

int main()
{
   char str1[200],str2[50],final[50];
   int i= 0, count=0;

   printf("Enter a long string\n");
   gets(str1);

   printf("Enter a small string\n");
   gets(str2);
   int len = strlen(str1) ,r=strlen(str2);

   for(int i=0;i<len-r;i++)
    {
        int j=0,k=0;

        while(str1[i] == str2[j])
        {
            //final[k]=str2[j];
            //++k;
            ++i;
            ++j;
            ++count;
            //continue;
        }


   }


   if(count == 0)
    printf("%s not exist\n",str2);
   else
    printf("%s exist %d times\n",str2,count/r);

   return 0;
}

