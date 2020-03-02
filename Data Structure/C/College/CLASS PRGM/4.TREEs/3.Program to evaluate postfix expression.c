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

// This function is also used for sorting the tree elements.
void display_inorder(NODE root)
{
    if(root == NULL) return ;


    display_inorder(root->Llink);

    printf("%d\n",root->Info);

    display_inorder(root->Rlink);

}



NODE create_exp_tree(char postfix[])
{

    NODE temp,stack[50];

    int i,top=-1;
    char symbol;

    for(i=0;postfix[i]!='\0';i++)
    {
        symbol = postfix[i];

        temp=getNODE();
        temp->Info = symbol;
        temp->Llink =temp->Rlink = NULL;

        if(isdigit(symbol))
            stack[++top] = temp;
        else
        {
            temp->Rlink = stack[top--];
            temp->Llink = stack[top--];
            stack[++top] = temp;

        }
    }

    return stack[top--];

}


double eval(NODE root)
{
    float num;
    switch(root->Info)
    {
        case '+' : return eval(root->Llink) + eval(root->Rlink);
        case '-' : return eval(root->Llink) - eval(root->Rlink);
        case '*' : return eval(root->Llink) * eval(root->Rlink);
        case '/' : return eval(root->Llink) / eval(root->Rlink);
        case '$' : return pow(eval(root->Llink) , eval(root->Rlink));

        default: return root->Info;
    }
}
void main()
{
    int choice;
    double res;
    NODE root = NULL;
    char postfix[50];

    printf("Enter the postfix exp\n");
    scanf("%s",postfix);

    root = create_exp_tree(postfix);

    res = eval(root);

    printf("EVALUATED : %s\n",res);
}

