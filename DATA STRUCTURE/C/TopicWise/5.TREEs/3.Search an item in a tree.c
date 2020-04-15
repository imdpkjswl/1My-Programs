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
    if(root == NULL) return ;


    display_inorder(root->Llink);

    printf("%d\n",root->Info);

    display_inorder(root->Rlink);

}




NODE search(NODE root)
{
    int item,temp;
    printf("Enter item to be searched\n");
    scanf("%d",&item);

    NODE CUR;

    if(root == NULL)
    {
        printf("Tree not exist,Search cannot be done\n");
        return NULL;
    }

    CUR = root;
    while(CUR!=NULL)
    {
        if(item == CUR->Info)
        {
            temp = CUR; // storing address
            break; // found
        }

        if(item<=CUR->Info)
            CUR = CUR->Llink;
        else
            CUR = CUR->Rlink;

    }

    if(CUR == NULL)
    {
        printf("%d not found\n",item);
        return root;
    }

    printf("%d found at %d address\n",item,temp);

    return root;

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
    // First time inserting node(ROOT NODE)
    if(root == NULL)  return temp;


    CUR = root;
    while(CUR!=NULL)
    {
        PREV = CUR;

        if(item<=CUR->Info)
            CUR = CUR->Llink;
        else
            CUR = CUR->Rlink;

    }

    if(item<=PREV->Info)
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
        printf("1.Insert\n2.Display\n3.Search\n4.Exit\n");
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
                search(root);
                break;

            case 4:
                exit(0);
        }
    }
}
