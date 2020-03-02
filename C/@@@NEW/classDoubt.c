/*
Input : 1   2   3   4   5   6
Output: 2   5   6   30  10  91

*/

///Genuine Program for all types of inputs
void main()
{
   int n,num;
   int sum=0;
   int temp;
   int i;
   int a[100];

   printf("Enter the value of n\n");
   scanf("%d",&n);

   printf("Enter %d elements\n",n);
   for(i=0;i<n;i++)
   {
       scanf("%d",&a[i]);
   }

   for(i=0;i<n;i++)
   {
       num = a[i];
       if(num%2 != 0)
       {
           temp = 2*num;
           printf("%d   ",temp);
       }

        ///Squaring of all even numbers along the previous even number
       sum =sum+num*num;

       if(num%2==0)
       {
           printf("%d   ",sum);
       }

   }
}
