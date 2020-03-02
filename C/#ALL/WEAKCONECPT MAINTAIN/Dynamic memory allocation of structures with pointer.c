#include <stdio.h>
#include <stdlib.h>

struct person {
   int age;
   char name[30];
};
/*
    WE CAN ALSO THIS CODE.
    int age[30];
    scanf("%d", &(ptr+i)->age);
    printf("Name: %s\tAge: %d\n", (ptr+i)->name, *(ptr+i)->age);
*/

int main()
{
   struct person *ptr;

   int i, num;

   printf("Enter number of persons: ");
   scanf("%d", &num);

   /// Allocating memory locations.
   ptr = (struct person*) malloc(num * sizeof(struct person));

   for(i = 0; i < num; ++i)
   {
       printf("Enter %d person name :\n",i+1);
       scanf("%s", (ptr+i)->name);
       printf("Enter %d person age :\n",i+1);
       scanf("%d", &(ptr+i)->age);

       system("cls");
   }

   printf("Displaying Information : \n");
   for(i = 0; i < num; ++i)
       printf("Name: %s\tAge: %d\n", (ptr+i)->name,(ptr+i)->age);


   return 0;
}
