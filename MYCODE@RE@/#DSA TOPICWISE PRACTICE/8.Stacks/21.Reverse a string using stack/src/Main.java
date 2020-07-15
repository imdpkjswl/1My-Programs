import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();

        String str = "DeepakJaiswal";
        char[] chr = str.toCharArray();

        for(int i=0;i<str.length();i++)
            st.push(chr[i]);

        str = "";

        for(int i=0;i<chr.length;i++)
            str += st.pop();

        System.out.println(str);
    }
}
