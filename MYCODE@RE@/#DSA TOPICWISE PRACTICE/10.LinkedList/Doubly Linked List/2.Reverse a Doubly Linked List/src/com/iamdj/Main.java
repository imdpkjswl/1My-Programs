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






    // Iterative solution
    Node reverseList(Node first) {
        Node prev,cur, next;

        cur=next = first;

        while (cur != null) {
            prev = cur.left;
            cur.left = cur.right;
            cur.right = prev;
            next = cur;
            cur = cur.left;
        }
        return next;
    }



/*
    // Recursive solution
    Node reverseList(Node first) {
        Node temp = first.right;
        first.right = first.left;
        first.left = temp;
        return temp == null ? first : reverseLis(temp);
    }

 */




}


public class Main {

    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        Node first =null;
        doublyLinkedList list = new doublyLinkedList();

        int ch;

        while(true){
            System.out.println("1.Insert at rear");
            System.out.println("2.Delete at front");
            System.out.println("3.Display");
            System.out.println("4.Reverse list");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = s.nextInt();

            switch(ch){

                case 1:
                    first = list.insert_at_rear(first);
                    break;

                case 2:
                    first = list.delete_at_front(first);
                    break;

                case 3:
                    list.display(first);
                    break;

                case 4:
                   first = list.reverseList(first);
                    break;

                case 5:
                    System.exit(0);

            }

        }

    }
}
