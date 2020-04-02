import java.util.*;

class person{
    private String name;
    private String usn;

    public person(String name, String usn){
        this.name = name;
        this.usn = usn;
    }

    public String toString(){
        return "Name:  " +this.name+ "  Usn:  " +this.usn; // concatenating name with usn.
    }

}

class personStack{
    private person [] stack; // person type data.
    private int top;
    private int size;

    personStack(){
        top = -1;
        size = 50;
        stack =new person[50]; // do not remove any lines from this code section.
    }

    public personStack(int size){
        top = -1;
        this.size = size;
        stack = new person[this.size];
    }

    public boolean push(person item){
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

    public person pop(){
        return stack[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}

public class Main {

    public static void main(String[] args) {

        person p1 = new person("DEEPAK","1VA18CS010");
        person p2 = new person("JAISWAL","1VA18CS010");

        personStack obj = new personStack();

        obj.push(p1);
        obj.push(p2);

        System.out.println(obj.pop().toString());

    }
}
