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
    Node insert_rear(Node first, int item) {

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


    /**
     * BEST METHOD EVER!
     * @param first
     * @return loop or not
     */
    static boolean detectLoop(Node first) {

        HashSet<Node> s = new HashSet<>();

        while (first != null) {
            // If we have already has this node in hashmap it means their is a cycle
            if (s.contains(first))
                return true;

            // If we are seeing the node for the first time, insert it in hash
            s.add(first);

            first = first.link;
        }

        return false;
    }


}




//----------------------------- MAIN FUNCTION AS A DRIVER --------------------------//
public class Main {
    public static void main(String[] args) {

        Node first = null;  // CREATE REFERENCE OF NODE CLASS.

        LinkedListImplementation list = new LinkedListImplementation(); // CREATE OBJECT

        first = list.insert_rear(first,1);
        first = list.insert_rear(first,2);
        first = list.insert_rear(first,3);
        first = list.insert_rear(first,4);
        first = list.insert_rear(first,5);
        first = list.insert_rear(first,6);


        // Create loop for testing- forth node is pointing to first node of list.
        first.link.link.link.link = first;

        if (list.detectLoop(first))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}