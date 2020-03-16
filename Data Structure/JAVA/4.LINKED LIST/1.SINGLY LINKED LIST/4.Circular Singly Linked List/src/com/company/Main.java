package com.company;

import java.util.*;

class Node{
    int item;
    Node link;

    Scanner s = new Scanner(System.in);

    // During creation of node ,assigning item
    Node(){
        System.out.println("Enter item : ");
        item = s.nextInt();
    }

}

class circularSinglyLinkedList{

    Node insert_at_front(Node first){

        Node temp = new Node(); // Creating node
        temp.link = temp; // self loop
        Node cur;

        // If list is empty
        if(first == null){
            first = temp;
            System.out.println(temp.item + " is inserted");
            return first;
        }
        /**
         * First attach temp to first node
         * then,traverse from first to last node by using cur
         * then,attach last node reference to the temp node
         * return temp node reference
         */
        temp.link = first;
        cur = first;
        while(cur.link != first){
            cur = cur.link;
        }
        cur.link = temp;
        first = temp;
        System.out.println(temp.item+" is inserted");
        return first;
    }

    Node insert_at_rear(Node first){
        Node temp = new Node(); // Creating node
        temp.link=temp; // self loop for only one node
        Node cur;

        // If list is empty
        if(first == null){
            first = temp;
            System.out.println(temp.item + " is inserted");
            return first;
        }

        // Traversing from first to last
        cur = first;
        while(cur.link != first){
            cur = cur.link;
        }
        cur.link = temp;
        temp.link= first;
        System.out.println(temp.item + " is inserted");
        return first;
    }

    Node delete_at_front(Node first){
        Node cur,sec;

        if(first == null){
            System.out.println("List is empty");
            return first;
        }

        if(first.link == first){
            System.out.println(first.item+" is deleted");
            return null;
        }

        sec= first.link;
        System.out.println(first.item+" is deleted");

        cur = first;
        while (cur.link!=first){
            cur= cur.link;
        }
        cur.link = sec;
        first = sec;
        return first;
    }


    Node delete_at_rear(Node first){
        Node prev, cur;
        prev = null;

        if(first == null){
            System.out.println("List is empty");
            return first;
        }

        if(first.link == first){
            System.out.println(first.item+" is deleted");
            return null;
        }

        cur = first;
        while (cur.link!=first){
            prev = cur;
            cur= cur.link;
        }
        System.out.println(cur.item+" is deleted");
        prev.link = first;
        return first;
    }

    void display(Node first){
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Contents of list are :");
        Node cur;
        cur = first;
        while(cur.link!= first){
            System.out.print(cur.item+"  ");
            cur = cur.link;
        }
        System.out.print(cur.item);
        System.out.println();
    }
}




public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int ch;
        Node first = null;

        circularSinglyLinkedList list = new circularSinglyLinkedList();

        while(true){
            System.out.println("1.Insert at Front");
            System.out.println("2.Insert at Rear");
            System.out.println("3.Delete at Front");
            System.out.println("4.Delete at Rear");
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
