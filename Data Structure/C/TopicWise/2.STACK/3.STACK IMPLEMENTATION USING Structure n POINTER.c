#include<stdio.h>
#include<stdlib.h>

/* Creating a structure which contain the stack and its constraints */
struct ArrayStack
{

    int top;
    int capacity;
    int *array;
};

/* Creating a stack which on where all operations will be performed */
struct ArrayStack* createStack(int cap)
{
    struct ArrayStack *stack; // Creating stack type variable
    stack = malloc(sizeof(struct ArrayStack)); // Allocate Structure memory
    stack->top= -1;
    stack->capacity = cap;
    stack->array = malloc(sizeof(int)*stack->capacity); // Create stack
    return (stack); // Return stack
}

int is_Full(struct ArrayStack *stack)
{
    if(stack->top == stack->capacity -1)
        return (1);
    else
        return (0);
}

int is_Empty(struct ArrayStack *stack)
{
    if(stack->top == -1)
        return (1);
    else
        return (0);

}

 void push(struct ArrayStack *stack, int item)
 {
     if(!is_Full(stack))
     {
         stack->top++;
         stack->array[stack->top] = item;
     }
     else
        printf("Stack is Full\n");
 }

 int pop(struct ArrayStack *stack)
 {
     int item;

     if(!is_Empty(stack))
     {
         item = stack->array[stack->top];
         stack->top--;
         return (item);
     }
     return (-1);

 }


 void main()
 {
     int choice,item;
     struct ArrayStack *stack;
     stack = createStack(5); // Store stack ,that has been created.

     for(;;)
     {
         system("cls");
         printf("1.Push\n2.Pop\n3.Exit\nEnter your choice\n");
         scanf("%d",&choice);

         switch(choice)
         {
         case 1:
            printf("Enter an item\n");
            scanf("%d",&item);
            push(stack,item);
            break;

         case 2:
            item = pop(stack);

            if(item == -1)
                printf("Stack is Empty\n");
            else
                printf("Popped item is %d\n",item);
            break;

         case 3:
            exit(0);

         }

     }
 }
