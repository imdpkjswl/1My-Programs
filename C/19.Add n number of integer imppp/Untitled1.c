#include<stdio.h>
int main()

{
  int n,sum=0,c,value;
  printf("How Many Number You Want To Add ?\n");
  scanf("%d",&n);
  printf("Enter The %d Integers\n",n);
  for(c=1;c<=n;c++)
  {
  scanf("%d",&value);
  sum= sum + value;

  }
printf("Sum Of The Integers = %d\n",sum);
getch();
}
