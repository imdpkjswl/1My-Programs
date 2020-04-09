import java.util.*;

class Node{
    public  int item;
    public Node left;
    public Node right;

            Scanner in = new Scanner(System.in);

            public Node(){
                System.out.println("Enter item to be inserted:");
                item = in.nextInt();
            }
}


class linkedList{

    void display(Node first){
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        Node cur = first;
        
        while(cur!= null){
            System.out.print(cur.item+"  ");
            cur = cur.right;
        }
        System.out.println();
    }
    
    Node insertAtFirst(Node first){
        Node temp = new Node();
        Node cur;
        
        System.out.println(temp.item+" is inserted.");
        if(first == null){ first = temp; return first; }
        temp.left = null;
        temp.right = first;
        first.left = temp;
        return temp;
    }

    Node insertAtLast(Node first){
        Node temp = new Node();

        System.out.println(temp.item+" is inserted.");
        if(first == null){ first = temp; return first; }

        Node cur = first;
        while(cur.right != null){
            cur = cur.right;
        }
        cur.right = temp;
        temp.left = cur;

        return first;
    }
    
    Node deleteAtLast(Node first){
        if(first == null){ System.out.println("List is empty"); return null; }
        if(first.right == null){ System.out.println(first.item+" is deleted."); return null; }
        Node prev = null, cur = first;
        while(cur.right != null){
            prev = cur;
            cur = cur.right;
        }
        System.out.println(cur.item+" is deleted.");
        prev.right = null;
        return first;
    }

    Node deleteAtFirst(Node first){
        if(first == null){ System.out.println("List is empty"); return null; }
        if(first.right == null){ System.out.println(first.item+" is deleted."); return null; }

        System.out.println(first.item+" is deleted.");
        Node second = first.right;
             first.left = null;

             return second;
    }


    Node insertSpecific(Node first,int pos) {
        Node temp = new Node();
        int count = 0 ;

        if(first == null){ count++; first = temp; return first; }

        Node help, cur = first;
        while(cur!= null){
            count++;
            if(count == pos-1 && count <= pos){
                System.out.println(temp.item+" is inserted.");
                help = cur.right;

                cur.right = temp;
                temp.left = cur;

                temp.right = help;
                help.left = temp;

                return first;
            }
            cur = cur.right;
        }

        System.out.println("Invalid position entered.");
        return first;
    }



    
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        Node first = null;
        linkedList list = new linkedList();

        while(true){
            System.out.println("1.Insert First\n2.Insert Last\n3.Delete First\n4.Delete Last\n5.Display\n6.Insert specific\n7.Exit\nChoose your option");
            ch = in.nextInt();

            switch(ch){
                case 1:
                    first = list.insertAtFirst(first);
                    break;

                case 2:
                    first = list.insertAtLast(first);
                    break;

                case 3:
                    first = list.deleteAtFirst(first);
                    break;

                case 4:
                    first = list.deleteAtLast(first);
                    break;

                case 5:
                    list.display(first);
                    break;

                case 6:
                    int pos;
                    System.out.println("Enter position:");
                    pos = in.nextInt();
                    first = list.insertSpecific(first,pos);
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}
