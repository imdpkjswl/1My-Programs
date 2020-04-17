import java.util.Scanner;


class STACK {

    Scanner in = new Scanner(System.in);
    int n=20;

    int []st = new int[n];
    int item, top = -1;


    // Incomplete code
    void sort(){

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

    public void push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        else {
            st[++top] = item;
        }
    }


    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return ;
        }
        else {
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

            System.out.println("1.Push\n2.Display\n3.Sort\n4.Exit\nEnter your choice");
            ch = in.nextInt();


            switch(ch)
            {
                case 1:
                    System.out.println("Enter item to push onto stack");
                    item = in.nextInt();
                    obj.push(item);
                    break;

                case 2:
                    obj.display();
                    break;

                case 3:
                    obj.sort();
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
