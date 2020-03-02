#include<stdio.h>
#include<stdlib.h>
#include<math.h>


struct node
{
    int Info;

    struct node *Llink;
    struct node *Rlink;

};

typedef struct node* NODE;

NODE getNODE()
{
    NODE ptr;

    ptr = (NODE)malloc(sizeof(struct node));

    if(ptr == NULL)
    {
        printf("Node creation failed\n");
    }

	return ptr;
}

void display(NODE root,int level)
{
    int i;

    if(root == NULL) return;

    display(root->Rlink,level+1);

    for(i=0;i<level;) printf("  ");

    printf("%c\n",root->Info);

    display(root->Llink,level+1);

}


NODE create(char postfix[])
{

    NODE temp,stack[20];
    int i,k;
    char symbol;

    for(i=k=0;(symbol = postfix[i]) != '\0';i++)
    {
        temp = getNODE();
        temp->Info = symbol;
        temp->Llink = temp->Rlink = NULL;


        if(isalnum(symbol))
            stack[k++] = temp;
        else
        {
            temp->Rlink = stack[--k];
            temp->Llink = stack[--k];
            stack[k++] = temp;

        }

    }

    return stack[--k];

}



double eval(NODE root)
{
    double num;

    switch(root->Info)
    {

        case '+':
            return eval(root->Llink) + eval(root->Rlink);

        case '-':
            return eval(root->Llink) - eval(root->Rlink);

        case '*':
            return eval(root->Llink) * eval(root->Rlink);

        case '/':
            return eval(root->Llink) / eval(root->Rlink);

        case '^':
        case '$':
            return pow(eval(root->Llink),eval(root->Rlink));


        default:
            if(isalpha(root->Info))
            {
                printf("%c = ",root->Info);
                scanf("%lf",&num);
                return num;
            }
            else
                return root->Info - '0';
    }
}

void main()
{
    int choice,level=1;
    double res;
    char postfix[100];
    NODE root = NULL;

    printf("Enter the postfix expression\n");
    scanf("%s",postfix);


    for(;;)
    {
        printf("1.Insert\n2.Display\n3.Evaluate\n4.Exit\n");
        printf("Enter the choice\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {
            case 1:
                root = create(postfix);
                break;

            case 2:
                display(root,1);
                break;

            case 3:
                res = eval(root);
                printf("Evaluated Result :  %lf\n",res);
                break;

            case 4:
                exit(0);
        }
    }
}

