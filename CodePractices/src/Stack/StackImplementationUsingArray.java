package Stack;

import java.util.*;
public class StackImplementationUsingArray {
    static int top = -1;
    static int cap = 5;
    static int[] st = new int[cap];

    private static boolean push(int item){
        if(top==cap-1){
            return false;
        }
        else{
            st[++top] = item;
            return true;
        }
    }

    private static boolean pop(){
        if(top==-1){
            return false;
        }
        else{
            top--;
            return true;
        }
    }

    private static void print(){
        for(int i=0;i<=top;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        while(true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Print");
            System.out.println("4.Exit");

            int ch = new Scanner(System.in).nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter item to push:");
                    int item = new Scanner(System.in).nextInt();
                    if(push(item))
                        System.out.println(item+ " pushed!!!");
                    else
                        System.out.println("Stack overflow!!!");
                    break;
                case 2:
                    if(pop())
                        System.out.println(st[top+1]+" popped!!!");
                    else
                        System.out.println("stack underflow!!!");
                    break;
                case 3:
                    if(top==-1){
                        System.out.println("Stack underflow!!!");
                    }else {
                        System.out.println("Stack elements are: ");
                        print();
                    }
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("You have not entered valid input data!!! Try again");

            }

        }
    }
}
