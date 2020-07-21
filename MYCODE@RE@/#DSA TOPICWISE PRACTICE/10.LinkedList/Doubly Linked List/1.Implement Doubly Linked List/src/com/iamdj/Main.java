package com.iamdj;

import java.util.*;

class Node{

    int item;
    Node left;
    Node right;

    Scanner s = new Scanner(System.in);

    Node() {
        System.out.println("Enter item : ");
        item = s.nextInt();
    }
}

class doublyLinkedList{

    Node insert_at_front(Node first){
        Node temp = new Node();
        if(first == null){
            first = temp;
            System.out.println(temp.item+" is inserted");
            return first;
        }
        temp.right = first;
        first.left = temp;
        first = temp;
        System.out.println(first.item+" is inserted");
        return first;
    }

    Node insert_at_rear(Node first){
        Node temp = new Node();
        if(first == null){
            first = temp;
            System.out.println(temp.item+" is inserted");
            return first;
        }
        Node cur;
        cur = first;
        while(cur.right != null){
            cur = cur.right;
        }
        cur.right = temp;
        temp.left = cur;
        System.out.println(temp.item+ " is inserted");
        return first;
    }

    Node delete_at_front(Node first){
        if(first == null){
            System.out.println("List is empty");
            return first;
        }
        Node cur;
        cur=first.right;
        first = cur;
        return first;
    }

    Node delete_at_rear(Node first){
        if(first == null){
            System.out.println("List is empty");
            return null;
        }

        Node prev,cur;
        prev =null;
        cur = first;
        while(cur.right != null){
            prev = cur;
            cur = cur.right;
        }
        System.out.println(cur.item+ " is deleted");
        prev.right = null;
        return first;
    }

    void display(Node first){
        Node cur;
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        cur = first;
        while(cur!= null){
            System.out.print(cur.item+ "  ");
            cur = cur.right;
        }
        System.out.println();
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        Node first =null;
        doublyLinkedList list = new doublyLinkedList();

        int ch;

        while(true){
            System.out.println("1.Insert at front");
            System.out.println("2.Insert at rear");
            System.out.println("3.Delete at front");
            System.out.println("4.Delete at rear");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            ch = s.nextInt();

            switch(ch){
                case 1:
                    first = list.insert_at_front(first);
                    break;

                case 2:
                    first = list.insert_at_rear(first);
                    break;

                case 3:
                    first = list.delete_at_front(first);
                    break;

                case 4:
                    first = list.delete_at_rear(first);
                    break;

                case 5:
                    list.display(first);
                    break;

                case 6:
                    System.exit(0);

            }

        }

    }
}
