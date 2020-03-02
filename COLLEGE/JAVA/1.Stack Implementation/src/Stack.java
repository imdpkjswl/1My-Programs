import java.util.*;
import java.util.Scanner;

class Stack
{

    Scanner obj = new Scanner(System.in);

    int i,top=-1,item,n=10;
    int a[] = new int[n];


    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull()
    {
        return top == n - 1;
    }

    public void push()
    {
        System.out.println("Enter an item");
        item = obj.nextInt();

        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            return;
        }

        System.out.println("Inserting " + item);
        a[++top] = item;
    }



    // Utility function to pop top element from the stack
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            return 0;
        }

        System.out.println("Removing " + a[top]);

        return a[top--];
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
            System.out.println(+a[i]+"  ");
    }



    public static void main(String[] args)
    {

        Scanner i = new Scanner(System.in);
        Stack st = new Stack();
        int ch;

        while(true)
        {
            System.out.print("1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter your choice :\n");
            ch = i.nextInt();

            // INDIAN JUGAAD
            for(int j=0;j<25;j++)
                System.out.println();
            //System.out.flush(); //Used for clear screen of normal terminal
            switch(ch)
            {
                case 1:
                    st.push();
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.display();
                    break;

                case 4:
                    System.exit(1);
            }

        }


    }

}
