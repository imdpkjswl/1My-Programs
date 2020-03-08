#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>


struct node
{
        int info;
        struct node *right,*left;
};

typedef struct node *NODE;


NODE getNODE(int item)
{
    NODE ptr;
    ptr = (NODE)malloc(sizeof(struct node));
    ptr->info = item;
    ptr->left = NULL;
    ptr->right = NULL;

    if(ptr == NULL){printf("Memory Allocation failed");exit(0);
    }return ptr;
}


void display(NODE root)
{
    if(root == NULL)
    {
        return;
    }

    display(root->left);

    printf("%d\n",root->info);

    display(root->right);

}



NODE insert(NODE root, int item)
{
    //searching for the place to insert
    if(root==NULL)
        return getNODE(item);
    else if(item>root->info) // item is greater. Should be inserted to right
        root->right = insert(root->right,item);
    else // item is smaller should be inserted to left
        root->left = insert(root->left,item);
    return root;
}


//Utility function to find the minimum value in a node
NODE find_minimum(NODE root)
{
    if(root == NULL)
        return NULL;
    else if(root->left != NULL) // node with minimum value will have no left child
        return find_minimum(root->left); // left most element will be minimum
    return root;
}
NODE delete(NODE root, int key)
{
    //searching for the item to be deleted
    if(root==NULL)
        return NULL;
    if (key>root->info)
        root->right = delete(root->right, key);
    else if(key<root->info)
        root->left = delete(root->left, key);
    else
    {
        //No Children
        if(root->left==NULL && root->right==NULL)
        {
            free(root);
            return NULL;
        }

        //One Child
        else if(root->left==NULL || root->right==NULL)
        {
            NODE temp;
            if(root->left==NULL)
                temp = root->right;
            else
                temp = root->left;
            free(root);
            return temp;
        }

        //Two Children
        else
        {
            NODE temp = find_minimum(root->right);
            root->info = temp->info;
            root->right = delete(root->right, temp->info);
        }
    }
    return root;
}

NODE search(NODE root, int key)
{
    if(root==NULL || root->info==key) //if root->data is x then the element is found
        return root;
    else if(key>root->info) // key is greater, so we will search the right subtree
        return search(root->right, key);
    else //key is smaller than the data, so we will search the left subtree
        return search(root->left,key);
}


int main()
{
    NODE root,ser;
    root=ser= NULL;
    int ch,item;
    for(;;)
    {
        printf("1.INSERT\n");
        printf("2.DELETE\n");
        printf("3.Display\n");
        printf("4.SEARCH\n");
        printf("5.Exit\nEnter your choice\n");
        scanf("%d",&ch);
        system("cls");
        switch(ch)
        {

            case 1:
                printf("Enter item\n");
                scanf("%d",&item);
                root = insert(root,item);
                break;

            case 2:
                if(root==NULL){
                     printf("Tree is empty\n");
                     break;
                }

                printf("Enter key to be delete\n");
                scanf("%d",&item);
                ser=search(root,item);
                if(ser==NULL){
                    printf("Key not found\n");
                    break;
                }
                root = delete(root,item);
                break;

            case 3:
                display(root);
                if(root==NULL)
                    printf("Tree is empty\n");
                break;

            case 4:
                if(root==NULL){
                     printf("Tree is empty\n");
                     break;
                }
                printf("Enter key to be search\n");
                scanf("%d",&item);
                root=search(root,item);
                if(root!=NULL)
                    printf("Key found\n");
                else
                    printf("Key not found\n");
                break;

            case 5:
                exit(0);
                break;

            default:
                printf("Invalid option chosen\n");


        }

    }

}


