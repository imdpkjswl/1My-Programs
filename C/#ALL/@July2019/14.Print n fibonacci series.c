 #include<stdio.h>

 unsigned long fib(int num)
 {
     if(num == 1 || num == 0)
        return 1;

     return (fib(num-1)+fib(num-2));

 }

void main()
 {
     unsigned long n,i;

     printf("Enter last term\n");
     scanf("%d",&n);

     printf("\n");

     for(i=1;i<=n;i++)
     {
         printf("%d\n",fib(i));
     }

     printf("The is required series.\n");
 }
