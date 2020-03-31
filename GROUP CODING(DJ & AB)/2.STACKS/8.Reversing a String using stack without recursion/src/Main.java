import java.util.Scanner;

class Stack {

    public static String reverseString(String str){
        if(str== null || str.equals(""))
            return str;
    char[] ch = str.toCharArray();

    // Pushing character one by one into stack
    for(int i=0;i<str.length();i++){
        push(ch[i]);
    }

    // Popping character one by one from  stack
    int k=0;
    while(top != -1){
        ch[k++] = pop();
    }

    return String.copyValueOf(ch);
    }


    static int top = -1;
    static char []st = new char[50]; // utility stack

    static char pop() {
        top--;
        return st[top+1];
    }
    static void push(char item){
        st[++top] = item;
    }


}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        Stack obj = new Stack();

        System.out.println("Enter a String:");
        str = in.next();

        str = obj.reverseString(str);

        System.out.println("Reversed String:  "+str);
    }
}
