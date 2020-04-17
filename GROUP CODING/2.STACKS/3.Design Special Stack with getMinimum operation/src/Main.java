import java.util.Scanner;


class STACK {
    Scanner in = new Scanner(System.in);
    int n=10;
    int []st = new int[n];
    int top = -1;


    // for special stack
    int []m = new int[50];
    int top1 = -1;

    void getMin(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Minimum element in actual stack is:  "+m[top1]);
    }

    public void push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        else {
            st[++top] = item;

            if(top == 0){
                m[++top1] = item;
                return;
            }

            if(m[top1] > st[top]){
                m[++top1] = st[top];
            }
        }

    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        else {
            System.out.println(st[top]+" is deleted");
            if(m[top1] == st[top]){
                top1--;
            }

            top--;

        }
    }


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


    public void display()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            return;
        }

        System.out.println("Elements in the stack :");
        for(int i=0;i<=top;i++)
            System.out.print(+st[i]+"  ");
        System.out.println();
    }

}



public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        STACK obj = new STACK();
        int ch,item;


        for(;;)
        {

            System.out.println("1.Push\n2.Pop\n3.Display\n4.Get minimum element\n5.Exit\nEnter your choice");
            ch = in.nextInt();


            switch(ch)
            {
                case 1:
                    System.out.println("Enter item to push onto stack");
                    item = in.nextInt();
                    obj.push(item);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    obj.getMin();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct input");
            }
        }



    }

}
