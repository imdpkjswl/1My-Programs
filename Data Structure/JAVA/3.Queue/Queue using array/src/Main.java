import java.util.*;


class Queue{
	Scanner in  = new Scanner(System.in);
	int n=10;
	
	int que[] = new int[n];
	int rear = -1;
	int front =0;
	
	void insertRear(){
		
		if(rear == n-1){
			System.out.println("Queue is Full");
			return;
		} 
		
		int item;
		System.out.println("Enter item :");
		item = in.nextInt();
		
		que[++rear] = item;
		System.out.println(que[rear]+" is now inserted");
		
	}
	
	
	void delete_Front(){
		
		if(front>rear){
			System.out.println("Queue is Empty");
			return;
		} 
		
		System.out.println(que[front]+" is now deleted");
		front++;
	}
	
	void display(){
		if(front>rear){
			System.out.println("Queue is Empty");
			return;
		} 
		
		for(int i=front;i<=rear;i++)
			System.out.println(que[i]+"  ");
	}
	
}


public class Main {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	Queue obj = new Queue();
	int ch;
	
	for(;;){
		
		System.out.println("1.InsertREAR\n2.DeleteFRONT\n3.Display\n4.Exit");
		System.out.println("Enter your choice:");
		ch = in.nextInt();
		
		switch(ch){
		
		case 1:
			obj.insertRear();
			break;
			
		case 2:
			obj.delete_Front();
			break;
			
		case 3:
			obj.display();
			break;
			
		default:
			System.out.println("Incorrect option chosen");
			
		}
		
	}
	
 }

}
