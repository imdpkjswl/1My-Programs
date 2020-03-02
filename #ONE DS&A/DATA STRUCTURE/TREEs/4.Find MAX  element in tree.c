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


int biggest(NODE root)
{
    if(root == NULL)
        return 0;


    int res = root->Info;
    int Lres = biggest(root->Llink);
    int Rres = biggest(root->Rlink);

    if(Lres > res)
        res = Lres;


    if(Rres > res)
        res = Rres;

    return res;
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
    int choice,max,min;
    NODE root = NULL;

    for(;;)
    {
        printf("1.Insert\n2.Display\n3.Find Biggest element\n4.Exit\n");
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
                max = biggest(root);
                printf("Biggest element :  %d\n",max);
                break;

            case 4:
                exit(0);
        }
    }
}
