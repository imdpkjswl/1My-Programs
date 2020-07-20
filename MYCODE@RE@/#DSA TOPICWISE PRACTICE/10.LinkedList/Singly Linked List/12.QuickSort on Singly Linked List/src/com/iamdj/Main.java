package com.iamdj;

import java.util.Scanner;

//------------------------ NODE THAT CONTAINS DATA AND LINK OF NEXT NODE ----------------------//
class Node {
    int info;
    Node link;

    Node(int info){
        this.info = info;
        link = null;
    }
}



class LinkedListImplementation {

    Scanner in = new Scanner(System.in);

    //------------------------------ INSERT AT REAR --------------------------------//
    Node insert_rear(Node first) {
        int item;
        System.out.println("Enter item to insert at rear:");
        item = in.nextInt();

        Node temp = new Node(item);
        Node cur;

        if(first == null){  // WHEN LIST HAS NO NODE
            first = temp;
            System.out.println(first.info+" is inserted at rear.");
            return first;
        }

        cur = first;

        while (cur.link!= null) {
            cur = cur.link;
        }

        cur.link = temp;
        System.out.println(temp.info+" is inserted at rear.");
        return first;
    }


    //------------------------------ DELETE AT FRONT ------------------------------//
    Node delete_front(Node first) {
        if(first == null) { // WHEN LIST EMPTY
            System.out.println("List is empty.");
            return null;
        }

        if(first.link == null) { // WHEN LIST HAS ONE NODE
            System.out.println(first.info+" is deleted at front.");
            return null;
        }

        System.out.println(first.info+" is deleted at front.");
        first = first.link;
        return first;
    }



    //------------------------------------ DISPLAY LIST -----------------------------------//
    void display(Node first) {
        if(first == null){  // CHECK FOR EMPTINESS
            System.out.println("List is empty.");
            return;
        }

        System.out.println("List items are:");
        Node cur;
        cur = first;
        while(cur!= null){
            System.out.print(cur.info+"  ");
            cur = cur.link;
        }
        System.out.println();
    }



    // takes first and last node,but do not break any links in the whole linked list
    Node partitionLast(Node start, Node end) {

        if(start == end ||
                start == null || end == null)
            return start;

        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.info;

        // iterate till one before the end, no need to iterate till the end because end is pivot
        while(start != end )
        {
            if(start.info < pivot)
            {
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.info;
                curr.info = start.info;
                start.info = temp;
                curr = curr.link;
            }
            start = start.link;
        }

        // swap the position of curr i.e. next suitable index and pivot
        int temp = curr.info;
        curr.info = pivot;
        end.info = temp;

        // return one previous to current because current is now pointing to pivot
        return pivot_prev;
    }

    void quickSort(Node start, Node end) {

        if(start == end )
            return;

        // split list and partition recurse
        Node pivot_prev = partitionLast(start, end);
        quickSort(start, pivot_prev);

        // if pivot is picked and moved to the start,that means start and pivot is same so pick from next of pivot.
        if( pivot_prev != null && pivot_prev == start )
            quickSort(pivot_prev.link, end);

        // if pivot is in between of the list,start from next of pivot,since we have pivot_prev, so we move two nodes.
        else if(pivot_prev != null && pivot_prev.link != null)
            quickSort(pivot_prev.link.link, end);
    }

}




//----------------------------- MAIN FUNCTION AS A DRIVER --------------------------//
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Node first = null;  // CREATE REFERENCE OF NODE CLASS.

        LinkedListImplementation list = new LinkedListImplementation(); // CREATE OBJECT

        while (true) {
            // DISPLAY MENU DRIVEN MESSAGE
            System.out.println("1.Insert at Rear");
            System.out.println("2.Delete at Front");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    first = list.insert_rear(first);
                    break;

                case 2:
                    first = list.delete_front(first);
                    break;

                case 3:
                    list.display(first);
                    break;

                case 4:
                    Node last = first;  // find length of list
                    while(last.link != null)
                        last= last.link;
                    list.quickSort(first,last);
                    break;

                case 5:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Choose valid option.");
            }
        }
    }
}