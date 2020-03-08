#include<iostream>
using namespace std;

struct node
{
	int data;
	node* left;
	node* right;
};


struct node* getNode(int data)
{
	node* newNode=new node();
	newNode->data=data;
	newNode->left=NULL;
	newNode->right=NULL;
	return newNode;
}

void inorder(struct node* root)
{
    if (root != NULL)
     {
        inorder(root->left);
        cout<<root->data<<" ";
        inorder(root->right);
    }
}

node* findMin(node*root)
{
    while(root->left!=NULL)
    {
        root=root->left;
    }
    return root;
}

struct node* Insert(struct node* root, int data)
{
	if (root == NULL)
		return getNode(data);

	if (data < root->data)
		root->left  = Insert(root->left, data);
	else if (data > root->data)
		root->right = Insert(root->right, data);

	return root;
}

bool Search(node*root,int value)
{
	if(root==NULL)
		return false;
	else if(root->data == value)
	{
		return true;
	}
	else if(value < root-> data)
		Search(root->left,value);
	else if(value > root->data)
		Search(root->right,value);
}


node* Delete( node* root,int value)
{
	c=Search(root,value);
	if(root==NULL)
		return root;
	else if(value< root->data)
	{
		root->left= Delete(root->left,value);
	}
	else if(value> root->data)
	{
		root->right= Delete(root->right,value);
	}

	// Node deletion
	else
	{
		//case 1: Leaf Node
		if(root->left==NULL&&root->right==NULL)
		{
			delete root;
			root=NULL;
			return root;
		}
		//case 2: one child
		else if(root->left==NULL)
		{
			struct node* temp=root;
			root=root->right;
			delete temp;
			return root;
		}
		else if(root->right==NULL)
		{
			struct node* temp=root;
			root=root->left;
			delete temp;
			return root;
		}
		//case 3: 2 child
		else
		{
			struct node*temp=findMin(root->right);
			root->data=temp->data;
			root->right=Delete(root->right,temp->data);
		}
	}
	return root;

}



int main()
{
    struct node *root;
    root= NULL;
    bool ser; // here,ser is taken for searching items
    int ch,item;
    for(;;)
    {
        printf("\n1.INSERT\n");
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
                root = Insert(root,item);
                break;

            case 2:
                if(root==NULL){
                     printf("Tree is empty\n");
                     break;
                }

                printf("Enter key to be delete\n");
                scanf("%d",&item);
                ser=Search(root,item);
                if(ser==false){
                    printf("Key not found\n");
                    break;
                }
                root = Delete(root,item);
                break;

            case 3:
                inorder(root);
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
                ser=Search(root,item);
                if(ser==true)
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
