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

class singlyLinkedList{

    Node insert_at_front(Node first){

        Node temp = new Node(); // Creating node

        // If list is empty
        if(first == null){
            first = temp;
            System.out.println(temp.item + " is inserted");
            return first;
        }

        // Simply adding to first node
        temp.link = first;
        System.out.println(temp.item + " is inserted");
        return temp;
    }

    Node insert_at_rear(Node first){
        Node temp = new Node(); // Creating node
        Node cur;

        // If list is empty
        if(first == null){
            first = temp;
            System.out.println(temp.item + " is inserted");
            return first;
        }

        // Traversing from first to last
        cur = first;
        while(cur.link != null){
            cur = cur.link;
        }
        cur.link = temp;
        System.out.println(temp.item + " is inserted");
        return first;
    }

    Node delete_at_front(Node first){
        Node cur;

        if(first == null){
            System.out.println("List is empty");
            return first;
        }

        System.out.println(first.item+ " is deleted");
        cur = first.link;
        first=cur;
        return first;
    }


    Node delete_at_rear(Node first){
        Node prev, cur;

        if(first == null){
            System.out.println("List is empty");
            return first;
        }
        prev = null;
        cur =first;
        while(cur.link != null){
            prev = cur;
            cur =cur.link;
        }
        prev.link = null;
        return first;
    }

    Node mergeSecondWithFirst(Node first, Node second){
        Node cur;
        if(first == null){
            return second;
        }
        if(second == null){
            return second;
        }

        cur =first;
        while(cur.link!=null){
            cur= cur.link;
        }
        cur.link = second;
        System.out.println("Merge successful");
        return first;
    }

    Node mergeFirstWithSecond(Node first, Node second){
        Node cur;
        if(first == null){
            return second;
        }
        if(second == null){
            return second;
        }

        cur =second;
        while(cur.link!=null){
            cur= cur.link;
        }
        cur.link = first;
        System.out.println("Merge successful");
        return second;
    }


    void display(Node first){
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Contents of list are :");
        Node cur;
        cur = first;
        while(cur!= null){
            System.out.print(cur.item+"  ");
            cur = cur.link;
        }
        System.out.println();
        System.out.println();
    }
}




public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int ch;
        Node first = null;
        Node second = null;

        singlyLinkedList list = new singlyLinkedList();

        while(true){
            System.out.println("1.Insert at Front in first list");
            System.out.println("2.Insert at Rear in second list");
            System.out.println("3.Delete at Front in first");
            System.out.println("4.Delete at Rear in second");
            System.out.println("5.Merge Second with First");
            System.out.println("6.Merge first with Second");
            System.out.println("7.Display");
            System.out.println("8.Exit");
            System.out.println("Enter your choice");
            ch = s.nextInt();

            switch(ch){
                case 1:
                    first = list.insert_at_front(first);
                    break;

                case 2:
                    second = list.insert_at_rear(second);
                    break;

                case 3:
                    first = list.delete_at_front(first);
                    break;

                case 4:
                    second = list.delete_at_rear(second);
                    break;

                case 5:
                    first = list.mergeSecondWithFirst(first, second);
                    break;

                case 6:
                    second = list.mergeFirstWithSecond(first,second);
                    break;

                case 7:
                    list.display(first);
                    list.display(second);
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }
}
