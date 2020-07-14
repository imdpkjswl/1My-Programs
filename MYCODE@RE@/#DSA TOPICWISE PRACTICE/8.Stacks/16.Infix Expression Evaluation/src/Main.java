import java.util.Stack;

public class Main {

    public static int evaluate(String infix) {

        char[] chr = infix.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> value = new Stack<>();

        // Stack for Operators: 'ops' 
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {

            // Current token is a whitespace, skip it
            if (chr[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers 
            if (chr[i] >= '0' && chr[i] <= '9') {

                String str = "";
                // There may be more than one digits in number 
                while (i < chr.length && chr[i] >= '0' && chr[i] <= '9')
                    str += chr[i++];

                value.push(Integer.parseInt(str));
            }

            // Current token is an opening brace, push it to 'ops' 
            else if (chr[i] == '(')
                op.push(chr[i]);

                // Closing brace encountered, solve entire brace
            else if (chr[i] == ')') {

                while (op.peek() != '(')
                    value.push(applyOperator(op.pop(), value.pop(), value.pop()));

                op.pop();
            }

            // Current token is an operator. 
            else if (chr[i] == '+' || chr[i] == '-' || chr[i] == '*' || chr[i] == '/') {

                // While top of 'ops' has same or greater precedence to current 
                // token, which is an operator. Apply operator on top of 'ops' 
                // to top two elements in values stack 
                while (!op.empty() && hasPrecedence(chr[i], op.peek()))
                    value.push(applyOperator(op.pop(), value.pop(), value.pop()));

                // Push current token to 'ops'. 
                op.push(chr[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining ops to remaining values
        while (!op.empty())
            value.push(applyOperator(op.pop(), value.pop(), value.pop()));

        // Top of 'values' contains result, return it 
        return value.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1', 
    // otherwise returns false. 
    public static boolean hasPrecedence(char op1, char op2) {

        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a' and 'b'. Return the result.
    public static int applyOperator(char op, int b, int a) {

        switch (op) {

            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    // Driver method to test above methods 
    public static void main(String[] args) {

        System.out.println(Main.evaluate("10 + 2 * 6"));
        System.out.println(Main.evaluate("100 * 2 + 12"));
        System.out.println(Main.evaluate("100 * ( 2 + 12 )/2"));
        System.out.println(Main.evaluate("100 * ( 2 + 12 ) / 14"));
    }
}