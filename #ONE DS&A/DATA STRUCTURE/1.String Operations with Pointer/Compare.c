#include<stdio.h>


int compare_string(char *str1, char *str2)
{
   while(*str1==*str2)
   {
      if ( *str1 == '\0' || *str2 == '\0' )
         break;

      str1++;
      str2++;
   }
   if( *str1 == '\0' && *str2 == '\0' )
      return 0;
   else
      return -1;
}

void main()
{
    char str1[100], str2[100], result;

    printf("Enter first string\n");
    gets(str1);

    printf("Enter second string\n");
    gets(str2);

    result = compare_string(str1, str2);

    if ( result == 0 )
       printf("Both strings are same.\n");
    else
       printf("Entered strings are not equal.\n");

    return 0;
}

