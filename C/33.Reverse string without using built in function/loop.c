#include <stdio.h>

///Reverse a string without using build in functions......
#define deepak int main()


deepak
{

  	char Str[100],comp[50];
  	int i,j;

  	printf("Please Enter any String : \n");
  	gets(Str);


  	j=0;
  	//for(j=0;Str[j]!='\0';j++);
  	
	  while(Str[j]!= '\0') j++;


 	printf("\nString after Reversing : \n");
  	for (i =j-1; i >= 0; i--)
  	{
  		printf("%c", Str[i]);
  	}
  			

  	return 0;
}
