package com.iamdj;

import java.util.HashSet;
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
        while(cur!= null) {
            System.out.print(cur.info+"  ");
            cur = cur.link;
        }
        System.out.println();
    }


    void swapNode(Node first, int a, int b) {

        if(first == null){ System.out.println("List is empty"); return; }

        // Nothing to do if x and y are same
        if (a == b) return;

        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = first;
        while (currX != null && currX.info != a)  // Iterate till 'a' to be found.
        {
            prevX = currX;
            currX = currX.link;
        }

        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = first;
        while (currY != null && currY.info != b) // Iterate till 'b' to be found.
        {
            prevY = currY;
            currY = currY.link;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
        


        // If x is not head of linked list
        if (prevX != null)
            prevX.link = currY;
        else //make y the new head
            first = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.link = currX;
        else // make x the new head
            first = currX;

        // Swap next pointers
        Node temp = currX.link;
        currX.link = currY.link;
        currY.link = temp;

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
            System.out.println("4.Swap two node");
            System.out.println("5.Exit");
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
                    System.out.println("Enter first number");
                    int f = in.nextByte();
                    System.out.println("Enter second number");
                    int s = in.nextByte();
                    list.swapNode(first, f, s);
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