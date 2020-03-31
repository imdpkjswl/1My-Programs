import java.util.Scanner;

class deleteMiddle{
    int top = -1,n=10;
    int []st = new int[n];

    void display(){
        int i;
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }
        for(i=0;i<=top;i++){
            System.out.print(st[i]+"  ");
        }
        System.out.println();
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }
        top--;
    }

    void push(int item){
        if(top == n-1){
            System.out.println("Stack in overflow");
            return;
        }
        st[++top] = item;
    }

    void deleteMid(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }
        int i,pos;
        if((top+1)%2 == 0){ // checking total no. of element is even or odd.
            pos = (top)/2; // for even
        }else{
            pos = (top+1)/2;
            pos = pos; // for odd
        }

        for(i=pos;i<=top;i++){
            st[i] = st[i+1]; // shifting
        }
        top--; // decrementing top value
    }

}
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int item,ch;
	deleteMiddle obj = new deleteMiddle();

	while(true){
	    System.out.println("1.Push\n2.Pop\n3.Display\n4.Delete Middle\n5.Exit\nEnter your choice");
	    ch=in.nextInt();

	    switch(ch){
            case 1:
                System.out.println("Enter item:");
                item=in.nextInt();
                obj.push(item);
                break;

            case 2:
                obj.pop();
                break;

            case 3:
                obj.display();
                break;

            case 4:
                obj.deleteMid();
                break;

            case 5:
                System.exit(0);
        }
    }

    }
}
