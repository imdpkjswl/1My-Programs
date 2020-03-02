#include<stdio.h>
#include<stdlib.h>

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
void inorder(NODE root)
{

    NODE stack[20],CUR;
    int top = -1;

    if(root == NULL)
    {
        printf("Tree not exist\n");
        return;
    }

    CUR = root;
    for(;;)
    {
        while(CUR != NULL)
        {
            stack[++top] = CUR;
            CUR = CUR->Llink;
        }

        if(top != -1)
        {
            CUR = stack[top--];
            printf("%d  ",CUR->Info);
            CUR = CUR->Rlink;
        }
        else
        {
            printf("\n");
            return;
        }
    }

}


void preorder(NODE root)
{
    NODE stack[20],CUR;
    int top = -1;

    if(root == NULL)
    {
        printf("Tree not exist\n");
        return;
    }

    CUR = root;
    for(;;)
    {
        while(CUR != NULL)
        {
            printf("%d  ",CUR->Info);
            stack[++top] = CUR;
            CUR = CUR->Llink;
        }

        if(top != -1)
        {
            CUR = stack[top--];
            CUR = CUR->Rlink;
        }
        else
        {
            printf("\n");
            return;
        }

    }


}

void postorder(NODE root)
{
    struct stack
    {
        NODE address;
        int flag;
    };


    struct stack s[20];
    NODE CUR;
    int top = -1;

    if(root == NULL)
    {
        printf("Tree not exist\n");
        return;
    }

    CUR = root;
    for(;;)
    {
        while(CUR != NULL)
        {
            top++;
            s[top].address = CUR;
            s[top].flag = 1;
            CUR = CUR->Llink;
        }

        while(s[top].flag < 0)
        {
            CUR = s[top].address;
            top--;

            printf("%d  ",CUR->Info);
            if(top == -1)
            {
                printf("\n");
                return;
            }
        }

        // Ascend to traverse the right sub tree

        CUR = s[top].address;
        CUR = CUR->Rlink;
        s[top].flag = -1;

    }
}

NODE insert(NODE root)
{
    int item;
    printf("Enter the item\n");
    scanf("%d",&item);

    NODE temp,PREV,CUR;

    temp = getNODE();
    temp->Info = item;
    temp->Rlink=temp->Llink = NULL;

    // First time inserting node(ROOT NODE)
    if(root == NULL)
    {
        printf("%d node inserted\n",item);
        return temp;
    }

    CUR = root;
    while(CUR!=NULL)
    {
        PREV = CUR;

        if(item <= CUR->Info)
            CUR = CUR->Llink;
        else
            CUR = CUR->Rlink;

    }

    printf("%d node inserted\n",item);

    if(item <= PREV->Info)
        PREV->Llink = temp;
    else
        PREV->Rlink = temp;

    return root;

}


void main()
{
    int choice;
    NODE root = NULL;

    for(;;)
    {
        printf("1.Insert\n2.In-order\n3.Pre-order\n4.Post-order\n5.Exit\n");
        printf("Enter the choice\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {
            case 1:
                root = insert(root);
                break;

            case 2:
                inorder(root);
                break;

            case 3:
                preorder(root);
                break;

            case 4:
                postorder(root);
                break;

            case 5:
                exit(0);
        }
    }
}
