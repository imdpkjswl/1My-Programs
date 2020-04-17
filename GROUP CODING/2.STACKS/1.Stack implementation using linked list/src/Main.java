import java.util.*;

class Node{
    int item;
    Node link;

    Scanner in = new Scanner(System.in);

    Node(){
        System.out.println("Enter item:");
        item=in.nextInt();
    }
}

class linkedList{
    int size,count=0;
    Scanner in = new Scanner(System.in);


    void stackSize(){
            System.out.println("Enter the size of stack:");
            size = in.nextInt();
        }

    Node insertRear(Node first){
        Node temp,cur;
        if(size == count){
            System.out.println("Stack is overflow");
            return first;
        }
        temp = new Node();
        temp.link = null;



        if(first == null){
            System.out.println(+temp.item+" is inserted");
            count++;
            return temp;
        }

        cur=first;
        while(cur.link != null){
            cur = cur.link;
        }
        cur.link = temp;
        System.out.println(+temp.item+" is inserted");
        count++;
        return first;

    }

    Node deleteFront(Node first){
        Node cur;

        if(first == null){
            System.out.println("Stack is underflow");
            return null;
        }

        count--;

        if(first.link == null){
            System.out.println(first.item+" is deleted");
            return null;
        }

        cur = first.link;
        return cur;
    }


    void display(Node first){
        Node cur;

        if(first == null){
            System.out.println("Stack is underflow");
            return;
        }

        cur = first;
        while(cur != null){
            System.out.print(cur.item+"  ");
            cur = cur.link;
        }
        System.out.println();

    }
}


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Node first = null;
        linkedList list = new linkedList();
        list.stackSize();

        int ch;

        while(true){
            System.out.println("1.Insert Rear\n2.Delete Front\n3.Display\n4.Exit\nEnter your choice:");
            ch=scan.nextInt();

            switch(ch){
                case 1:
                    first = list.insertRear(first);
                    break;

                case 2:
                    first = list.deleteFront(first);
                    break;

                case 3:
                    list.display(first);
                    break;

                case 4:
                    System.exit(0);
            }
        }


    }
}
