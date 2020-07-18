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



    //------------------------------ INSERT AT FRONT --------------------------------//
    Node insert_front(Node first) {
        int item;
        System.out.println("Enter item to insert at front:");
        item = in.nextInt();

        Node temp = new Node(item);

        if(first == null){ // WHEN LIST HAS ONE NODE
            first = temp;
            System.out.println(first.info+" is inserted at front.");
            return first;
        }

        temp.link = first;

        System.out.println(temp.info+" is inserted at front.");
        return temp;
    }



    //----------------------------- DELETE AT REAR -----------------------------------//
    Node delete_rear(Node first) {
        if(first == null) { // WHEN LIST HAS NO NODE
            System.out.println("List is empty.");
            return null;
        }

        if(first.link == null) { // WHEN LIST HAS ONE NODE
            System.out.println(first.info+" is deleted at front.");
            return null;
        }

        Node cur, prev = null;

        cur = first;
        while(cur.link != null) {
            prev = cur;
            cur = cur.link;
        }
        System.out.println(cur.info+" is deleted ar rear.");
        prev.link = null;
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

}




//----------------------------- MAIN FUNCTION AS A DRIVER --------------------------//
public class LinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        Node first = null;  // CREATE REFERENCE OF NODE CLASS.

        LinkedListImplementation list = new LinkedListImplementation(); // CREATE OBJECT

        while (true) {
            // DISPLAY MENU DRIVEN MESSAGE
            System.out.println("1.Insert at Front");
            System.out.println("2.Insert at Rear");
            System.out.println("3.Delete at Front");
            System.out.println("4.Delete at Rear");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    first = list.insert_front(first);
                    break;

                case 2:
                    first = list.insert_rear(first);
                    break;

                case 3:
                    first = list.delete_front(first);
                    break;

                case 4:
                    first = list.delete_rear(first);
                    break;

                case 5:
                    list.display(first);
                    break;

                case 6:
                    System.exit(1);
            }
        }
    }
}