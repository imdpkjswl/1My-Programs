#include <stdio.h>
#include <string.h>

int main()
{
   char string[100],ch[2];
   int i= 0, count=0;

   printf("Enter a string\n");
   gets(string);

   printf("Enter a character\n");
   gets(ch);
   int len = strlen(string) ,r=strlen(ch);

   for(int i=0;i<len;i++)
    {
        int j=0;
        while(string[i] == ch[j])
        {
            ++count;
            ++i;
            continue;
        }
   }

   if(count == 0)
    printf("%s not exist\n",ch);
   else
    printf("%s exist %d times\n",ch,count);

   return 0;
}
