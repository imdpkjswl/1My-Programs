import java.util.*;

class stackImplementation{
    private int [] stack;
    private int top;
    private int size;

    stackImplementation(){
        top = -1;
        size = 50;
        stack =new int[50]; // do not remove any lines from this code section.
    }

    public stackImplementation(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    public boolean push(int item){
        if(!isFull()) {
            top++;
            stack[top] = item;
            return true;
        }
        else
            return false;
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public int pop(){
        return stack[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}

public class Main {

    public static void main(String[] args) {
    stackImplementation obj = new stackImplementation();

        if (!obj.isFull()) {
            obj.push(10);
            obj.push(20);
            obj.push(30);
            obj.push(40);
            obj.push(50);
        }

        System.out.println(obj.pop());

    }
}
