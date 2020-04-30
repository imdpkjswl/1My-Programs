public class StackWithMax {
    private Stack<Integer> data;
    private Stack<Integer> max;

// General method using
    public StackWithMax() {
        data = new Stack<Integer>();
        max = new Stack<Integer>();
    }

    public void push(int x) {
        data.push(x);
        if (max.empty() || x >= max())
            max.push(x);
    }

    public int pop() {
        if (data.peek() == max())
            max.pop();
        return data.pop();
    }

    public int peek() {
        return data.peek();
    }

    public int max() {
        return max.peek();
    }
}

static public void main(String[] args) throws IOException {
    FastScanner scanner = new FastScanner();
    int queries = scanner.nextInt();
    StackWithMax stack = new StackWithMax();
    for (int qi = 0; qi < queries; ++qi) {
        String operation = scanner.next();
        if ("push".equals(operation)) {
            int value = scanner.nextInt();
            stack.push(value);
        } else if ("pop".equals(operation)) {
            stack.pop();
        } else if ("max".equals(operation)) {
            System.out.println(stack.max());
        }
    }
}