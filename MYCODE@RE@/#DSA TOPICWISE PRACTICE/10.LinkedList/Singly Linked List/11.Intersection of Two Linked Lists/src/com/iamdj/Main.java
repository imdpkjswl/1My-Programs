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
            return first;
        }

        cur = first;
        while (cur.link!= null) {
            cur = cur.link;
        }
        cur.link = temp;
        return first;
    }


    //------------------------------------ DISPLAY LIST -----------------------------------//
    void display(Node first) {
        if(first == null){  // CHECK FOR EMPTINESS
            System.out.println("List is empty.");
            return;
        }

        Node cur;
        cur = first;
        while(cur!= null){
            System.out.print(cur.info+"  ");
            cur = cur.link;
        }
        System.out.println();
    }

    Node intersectionList(Node one , Node two) {
        if(one == null || two == null){
            return null;
        }
        HashSet<Integer> s = new HashSet<>();
        Node result = null;
        // Store first list items in Set.
        while(one != null){
            s.add(one.info);
            one = one.link;
        }

        // compare set's value with second list, if match then push into another list.
        while(two != null) {
            if(s.contains(two.info)){
                result=insert_rear(result, two.info);
            }
            two = two.link;
        }
        return result;
    }

}




//----------------------------- MAIN FUNCTION AS A DRIVER --------------------------//
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Node one = null;
        Node two = null;
        Node intersect;

        LinkedListImplementation list = new LinkedListImplementation();

        // Create first list
        one = list.insert_rear(one,1);
        one = list.insert_rear(one,2);
        one = list.insert_rear(one,6);
        one = list.insert_rear(one,4);
        one = list.insert_rear(one,3);

        // Create second list
        two = list.insert_rear(two,2);
        two = list.insert_rear(two,8);
        two = list.insert_rear(two,6);
        two = list.insert_rear(two,4);

        System.out.println("First list are:");
        list.display(one);
        System.out.println("Second list are:");
        list.display(two);

        System.out.println("The intersection of two list: ");
        intersect = list.intersectionList(one, two);
        list.display(intersect);

    }
}