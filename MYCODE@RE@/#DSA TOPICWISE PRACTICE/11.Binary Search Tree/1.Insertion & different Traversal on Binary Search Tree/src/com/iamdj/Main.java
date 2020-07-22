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

    void preOrder(Node root) {
        if(root == null)
            return;

        System.out.print(root.data+"  ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if(root == null) return ;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"  ");
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

        System.out.println("InOrder Traversal:");
        bst.inOrder(root);
        System.out.println("\n\npreOrder Traversal:");
        bst.preOrder(root);
        System.out.println("\n\npostOrder Traversal:");
        bst.postOrder(root);

    }
}
