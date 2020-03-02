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
        printf("Tree Creation Failed\n");
        return NULL;
    }

    return ptr;
}

NODE create_tree(NODE root)
{
    int item;
    printf("Enter the item\n");
    scanf("%d",&item);

    NODE temp,CUR,PREV;

    temp = getNODE();
    temp->Info = item;
    temp->Rlink = temp->Llink =NULL;

    if(root ==NULL) return temp;

    CUR = root;
    PREV = NULL;
    while(CUR!= NULL)
    {
        PREV = CUR;
        if(item < CUR->Info)
            CUR = CUR->Llink;
        else
            CUR = CUR->Rlink;
    }

    if(item < PREV->Info)
        PREV->Llink = temp;
    else
        PREV->Rlink = temp;

    return root;
}



void search(NODE root)
{
    int key;
    printf("Enter the key to be searched\n");
    scanf("%d",&key);

    NODE CUR;

    if(root ==NULL)
    {
        printf("Tree is empty\n");
        return;
    }


    CUR = root;
    while(CUR!= NULL)
    {
        if(key == CUR->Info) break;

        if(key < CUR->Info)
            CUR = CUR->Llink;
        else
            CUR = CUR->Rlink;
    }

    if(CUR == NULL)
    {
        printf("Key is not found\n");
        return;
    }

    printf("Key is found\n");

}

void inorder(NODE root)
{
    if(root == NULL)  return;

    inorder(root->Llink);
    printf("%d\n",root->Info);
    inorder(root->Rlink);
}


void preorder(NODE root)
{
    if(root == NULL)  return;

    printf("%d\n",root->Info);
    preorder(root->Llink);
    preorder(root->Rlink);
}

void postorder(NODE root)
{
    if(root == NULL)  return;

    postorder(root->Llink);
    postorder(root->Rlink);
    printf("%d\n",root->Info);

}

void main()
{
    int item,choice;
    NODE root = NULL;

    for(;;)
    {
        printf("1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Search Key\n6.Exit\nEnter your choice\n");
        scanf("%d",&choice);


        system("cls");
        switch(choice)
        {

        case 1:
            root = create_tree(root);
            break;

        case 2:
            if(root == NULL)
            {
                printf("Tree is empty\n");
                return;
            }
            inorder(root);
            break;

        case 3:
            if(root == NULL)
            {
                printf("Tree is empty\n");
                return;
            }
            preorder(root);
            break;

        case 4:
            if(root == NULL)
            {
                printf("Tree is empty\n");
                return;
            }
            postorder(root);
            break;

        case 5:
            search(root);
            break;

        case 6:
            exit(0);
        }
    }
}
