import java.util.Stack;

public class Main {

    public static Stack<Integer> sortStack(Stack<Integer>
                                                   input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(4);
        st.push(43);
        st.push(23);
        st.push(16);

        System.out.println(sortStack(st));

    }
}
