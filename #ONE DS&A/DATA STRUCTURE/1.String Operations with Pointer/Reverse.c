#include <stdio.h>
#include<string.h>
#include <conio.h>

void main()
{
	char str[100];
	int len,i;
	printf("\nENTER A STRING: ");
	scanf("%s",str);

	len=strlen(str);

	printf("\nTHE REVERSE OF THE STRING IS:");
	for(i=len;i>=0;i--)
		{
		    printf("%c",*(str+i));
		}

	return ;
}
