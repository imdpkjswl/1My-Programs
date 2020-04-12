import java.util.Scanner;
import java.io.*;


class Node{
	private int data;
	private Node next;
	
	public Node(){
		data = 0;
		next = null;
	}
	
	public Node(int d,Node n){
		data = d;
		next = n;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public int getData(){
		return (data);
	}
	
	public Node getNext(){
		return (next);
	}
	
}


class LinkedList {
	private int size;
	private Node start;
	
	public LinkedList(){
		size =0;
		start = null;
	}
	
       
        public void insertAtFirst(int val){
            Node n;
            n = new Node();  
            n.setData(val);
            n.setNext(start);
            start = n;
            size++;
        }
        
        public void insertAtLast(int val){
            Node n,t;
            n =new Node();
            n.setData(val);
            
            t =start;
            if(t == null)
                start = n;
            else
            {
                while(t.getNext() != null){
                    t =t.getNext();
                }
                t.setNext(n);
            }

		size++;
        }
        
        
        
        
        public void deleteAtpos(int pos){
            if(start == null)
                System.out.println("List is empty");
            else if(pos<1 || pos>size)
                System.out.println("Invalid Position");
            else if(pos==1)
                deleteFirst();
            else if(pos == size)
                deleteLast();
            else{
                Node t, t1;
                t = start;
                for(int i=1;i<pos-1;i++)
                    t=t.getNext();
                t1 = t.getNext();
                t.setNext(t1.getNext());
                size--;
                
            }
        }
        
        
        
        
        
        public void insertAtpos(int val,int pos){
            if(pos == 1)
                insertAtFirst(val);
            else if(pos==size+1)
                insertAtLast(val);
            else if(pos>1 && pos<=size){
                Node n,t;
                n = new Node(val,null);
                
                t = start;
                for(int i=1;i<pos-1/*before position*/;i++)
                    t = t.getNext();
                
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }else
                System.out.println("Invalid Position");
        }
        
        
        public void deleteLast(){
            if(start == null)
                System.out.println("List is empty");
            else if(size == 1){
                start = null;
                size--;
            }
            else{
                Node t;
                t = start;
                for(int i=1;i<size-1;i++)
                    t = t.getNext();
                t.setNext(null);
                size--;
            }
                
        }
        
        
        
        
        public void deleteFirst(){
            if(start == null)
                System.out.println("List is empty");
            else
                start = start.getNext();
            size--;
        }
        
        
	public boolean isEmpty(){
		if(start == null)
			return (true);
		else
			return (false);	
	}
	
	public int getListSize(){
            return (size);
        }
        
        public void viewList(){
            Node t;
            
            if(isEmpty()){
                System.out.println("List is Empty");
            }
            
            t = start; // storing first node reference in t
            for(int i=1;i<=size;i++){
                System.out.print(t.getData()+"   ");
                t = t.getNext();
            }
        }

}




public class Test {

	public static void main(String args[]){
	
            LinkedList list = new LinkedList();
            int ch,pos,item;
            boolean flag=true;
            Scanner sc = new Scanner(System.in);
            
            while(flag){
            System.out.println("\n1.Insert item at start");
            System.out.println("2.Insert item at last");
            System.out.println("3.Insert item at position");
            System.out.println("4.Delete first item");
            System.out.println("5.Delete last item");
            System.out.println("6.Delete item at pos");
            System.out.println("7.View list");
            System.out.println("8.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            
            switch(ch){
                case 1:
                    System.out.println("Enter item");
                    item = sc.nextInt();
                    list.insertAtFirst(item);
                    break;
                case 2:
                    System.out.println("Enter item");
                    item = sc.nextInt();
                    list.insertAtLast(item);
                    break;
                case 3:
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    System.out.println("Enter item");
                    item = sc.nextInt();
                    list.insertAtpos(item, pos);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter positon");
                    pos = sc.nextInt();
                    list.deleteAtpos(pos);
                    break;
                case 7:
                    list.viewList();
                    break;
                case 8:
                    flag=false;
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option chosen");
            }
            }
		
    }
}