import java.util.Scanner;


class STACK {

	Scanner in = new Scanner(System.in);
	int n=10;
	
	int []st = new int[n];
	int item, top = -1;
	
	boolean isFull(){
		if(top == n-1)
			return true;
		else
			return false;
	}
	
	boolean isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void push() {
		if(isFull()){
			System.out.println("Stack is full");
			return;
		}
		else {
			System.out.println("Enter item to push onto stack");
			item = in.nextInt();
			st[++top] = item;
		}
	}
	
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		else {
			System.out.println(st[top]+" is deleted");
			top--;
		}
	}
	
	public void display()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            return;
        }

        System.out.println("Elements in the stack :");
        for(int i=0;i<=top;i++)
            System.out.println(+st[i]+"  ");
    }
}



public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		STACK obj = new STACK();
		int ch;

		
		for(;;)
		{
	
			for(int i=0;i<20;i++)
				System.out.println();
			
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice");
			ch = in.nextInt();
	
			
			switch(ch)
			{
			case 1:
				obj.push();
				break;
				
			case 2:
				obj.pop();
				break;
				
			case 3:
				obj.display();
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter the correct input");
			}
		}
		
		

	}

}
