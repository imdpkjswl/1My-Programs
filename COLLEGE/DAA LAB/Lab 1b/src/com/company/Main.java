package stack;

import java.util.*;

class utility{
	
	private int i,top,size,arr[];
	
	public utility(int n){
		top =-1;
		size = n;
		arr = new int[size];
	}
	
	public void push(int item){
		if(top == size-1){
			System.out.println("Stack overflow");
			return;
		}
		
		arr[++top] =   item;
		System.out.println(item + " is pushed");
		 
	}
	
	public void pop(){
		if(top == -1){
			System.out.println("Stack underflow");
			return;
		}
		
		System.out.println(arr[top--]+ "is popped");
	}
	
	
	public void display(){
		if(top == -1){
			System.out.println("Stack is Empty");
			return;
		}
		
		for(i=0;i<=top;i++){
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
	}
}





class stack {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size,ch,item;
		System.out.println("Enter the size of stack :");
		size = s.nextInt();
		
		utility obj = new utility(size);
		
		while(true){
			System.out.println("1.Push item");
			System.out.println("2.Pop item");
			System.out.println("3.Display item");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			ch = s.nextInt();
			
			switch(ch){
			
			case 1:
				System.out.println("Enter item");
				item = s.nextInt();
				obj.push(item);
				break;
				
			case 2:
				obj.pop();
				break;
				
			case 3:
				obj.display();
				break;
			
			case 4:
				System.exit(0);
			}
		}

	}

}
