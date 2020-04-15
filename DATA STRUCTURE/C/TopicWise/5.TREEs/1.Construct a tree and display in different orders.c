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


void display_levelorder(NODE root)
{

    NODE CUR,q[20];
    int front =0,rear = -1;

    q[++rear] = root;

    while(front<=rear)
    {
        CUR = q[front++];
        printf("%d\n",CUR->Info);

        if(CUR->Llink != NULL)
            q[++rear] = CUR->Llink;

        if(CUR->Rlink != NULL)
            q[++rear] = CUR->Rlink;

    }

    printf("\n");
}


/// Finding Height of a tree
int maxDepth(NODE root)
{
    if(root == NULL) return 0;

    int Ldepth = maxDepth(root->Llink);
    int Rdepth = maxDepth(root->Rlink);

    // Use the larger one
    if(Ldepth > Rdepth)
        return (Rdepth + 1);
    else
        return (Ldepth + 1);
}

// This function will work ,if level of is known.
void display_levelbylevel_order(NODE root)
{
    int i,level = maxDepth(root) + 1; // By Level = height +1

    for(i=1;i<=level;i++)
    {
        support_level(root,i);
        printf("\n");
    }
}

// This Function may used for printing any particular level.
void support_level(NODE root,int level)
{
    if(root == NULL)  return;

    if(level == 1)
        printf("%d ",root->Info);
    else if(level > 1)
    {
        support_level(root->Llink,level-1);
        support_level(root->Rlink,level-1);
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
        printf("1.Insert\n2.In-order\n3.Pre-order\n4.Post-order\n5.Level-Order\n6.Display Level By Level\n7.Find Height of Tree\n8.Exit\n");
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
                display_levelorder(root);
                break;

            case 6:
                if(root == NULL)
                {
                    printf("Tree is Empty\n");
                    break;
                }
                display_levelbylevel_order(root);
                break;


            case 7:
                printf("Height of Tree is : %d\n",maxDepth(root));
                break;


            case 8:
                exit(0);
        }
    }
}
