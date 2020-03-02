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
void display_inorder(NODE root)
{
    if(root == NULL)
    {
        return;
    }

    display_inorder(root->Llink);

    printf("%d\n",root->Info);

    display_inorder(root->Rlink);

}


void display_preorder(NODE root)
{
    if(root == NULL) return;

    printf("%d\n",root->Info);

    display_preorder(root->Llink);

    display_preorder(root->Rlink);

}

void display_postorder(NODE root)
{
    if(root == NULL) return;

    display_postorder(root->Llink);

    display_postorder(root->Rlink);

    printf("%d\n",root->Info);

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

    printf("%d node inserted\n",item);
    if(root==NULL)
    {
        root = temp;
        return root;
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
                if(root == NULL)
                {
                    printf("Tree is Empty\n");
                    break;
                }
                display_inorder(root);
                break;

            case 3:
                if(root == NULL)
                {
                    printf("Tree is Empty\n");
                    break;
                }
                display_preorder(root);
                break;

            case 4:
                if(root == NULL)
                {
                    printf("Tree is Empty\n");
                    break;
                }
                display_postorder(root);
                break;

            case 5:
                exit(0);
        }
    }
}
