package com.iamdj;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter item:");
        data =s.nextInt();
    }
}

class binarySearchTree {

    Node insert(Node root) {
        Node temp = new Node();
        if(root == null) {
            System.out.println(temp.data+" is inserted.");
            root = temp;
            return root;
        }

        Node cur,prev;
        cur = root;
        prev = null;
        while(cur != null) {
            prev = cur;
            if(temp.data <= cur.data)
                cur = cur.left;
            else
                cur = cur.right;
        }

        if(temp.data <= prev.data)
            prev.left = temp;
        else
            prev.right = temp;

        System.out.println(temp.data+" is inserted.");
        return root;
    }

    void inOrder(Node root) {
        if(root == null) return ;

        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }





    Node find_minimum(Node root) {

        if(root == null) return null;

        else if(root.left != null) // node with minimum value will have no left child
            return find_minimum(root.left); // left most element will be minimum
        return root;
    }

    Node deletion(Node root, int key){

        if(root==null)
            return null;
        //Searching for the item to be deleted
        if (key > root.data) // Key might be present in Right Side.
            root.right = deletion(root.right, key);
        else if(key < root.data) // Key might be present in Left Side.
            root.left = deletion(root.left, key);
        else
        {
            //No Children
            if(root.left==null && root.right==null)
            {
                return null;
            }

            //One Child
            else if(root.left==null || root.right==null)
            {
                Node temp;
                if(root.left==null)
                    temp = root.right;
                else
                    temp = root.left;

                return temp;
            }

            //Two Children
            else
            {
                Node temp = find_minimum(root.right); // Searching minimum element in right side of tree.
                root.data = temp.data;
                root.right = deletion(root.right, temp.data);
            }
        }

        return root;
    }
}


public class Main {

    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        root = bst.insert(root);
        root = bst.insert(root);
        root = bst.insert(root);
        root = bst.insert(root);
        root = bst.insert(root);

        System.out.println("Before Deletion: InOrder Traversal:");
        bst.inOrder(root);
        root = bst.deletion(root, 8);
        System.out.println("\nAfter Deletion: InOrder Traversal:");
        bst.inOrder(root);
    }
}
