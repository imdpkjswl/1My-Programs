#include<stdio.h>

int main()
{
	int n,a=0,b=1,sum;
	printf("Enter The value of sequence\n");
	scanf("%d",&n);

	for(;a<n;)   /// also use while(a<n)
	{

		printf("%d \t",a);
		sum=a+b;
		a=b;
		b=sum;



	}



}
