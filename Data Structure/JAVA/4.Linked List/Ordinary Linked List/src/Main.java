import java.util.Scanner;

class Node{
    private int data=0;
    private Node next=null;
    
    void inData(int data){
        this.data = data;
    }
    
    void inNext(Node next){
        this.next = next;
    }
    
    int getData(){
        return data;
    }
    
    Node getNext(){
        return next;
    }
    
}


class LinkedList{
    
    private int size;
    private Node start;
    
    public LinkedList(){
        size=0;
        start = null;
    }
    
    void insertAtLast(int value){
        Node n,t;
        
        n = new Node();
        n.inData(value);
        
        t = start;
        if(start == null)
            start = n;
        else
        {
            while(t.getNext() != null){
                t = t.getNext();
            }
            t.inNext(n);
        }
        size++;
    }
    
    
    void deleteFirst(){
        if(start == null){
            System.out.println("List is empty");
            return;
        }
        else
            start = start.getNext();
        
        size--;
    }
    
    void viewList(){
        if(start == null){
            System.out.println("List is empty");
            return;
        }
        else
        {
            Node t;
            t=start;
            for(int i=1;i<=size;i++)
            {
                System.out.println(t.getData()+"  ");
                t=t.getNext();
            }
        }
    }
        
    
}


public class Main {
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        int ch,item;
        
        LinkedList list = new LinkedList();
        
        while(true){
            System.out.println("1.Insert at last");
            System.out.println("2.Delete at first");
            System.out.println("3.View list");
            System.out.println("4.Exit\nEnter your choice");
            ch = in.nextInt();
            
            switch(ch){
                
                case 1:
                    System.out.println("Enter item");
                    item = in.nextInt();
                    list.insertAtLast(item);
                    break;
                    
                case 2:
                    list.deleteFirst();
                    break;
                    
                case 3:
                    list.viewList();
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option chosen");
            }
        }
    }
}
