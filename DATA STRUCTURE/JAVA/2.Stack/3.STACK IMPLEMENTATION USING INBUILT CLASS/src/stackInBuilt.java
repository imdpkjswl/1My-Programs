import java.util.Scanner;
import java.util.Stack;

public class stackInBuilt {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();

        while(true){
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.println("Enter your option");
            int item, ch = in.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter element to push into stack");
                    item = in.nextInt();
                    s.push(item);
                    break;

                case 2:
                    if(s.isEmpty()) {
                        System.out.println("Stack is empty");
                        break;
                    }
                    System.out.println("Popped item:  "+s.pop());
                    break;

                case 3:
                    if(s.isEmpty()){
                        System.out.println("Stack is empty");
                        break;
                    }
                    System.out.println("The stack elements:");
                    for(int i=0;i< s.size();i++) {
                        System.out.print(s.get(i)+"  ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.exit(1);
            }
        }

    }
}
