#include <stdio.h>
#include <stdlib.h>

int main()
{
  int i, num;

  printf("Ten random numbers in [1,100]\n");

  for (i = 1; i <= 10; i++)
    {
        num = rand()% 100+1;
        printf("%d\n", num);
    }

  return 0;

}
