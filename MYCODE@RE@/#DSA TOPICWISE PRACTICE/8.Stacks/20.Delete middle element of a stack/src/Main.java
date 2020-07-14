import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(23);
        st.push(12);
        st.push(33);
        st.push(22);
        st.push(76);
        st.push(34);

        int n = st.size();
        int mid;

        // Check for odd/even number
            if(n%2==0)
                mid = n/2;
            else
                mid = 1+(n/2);  // in case of even, item will deleted on basis of size of stack/2,BUt not case of index.

        // Store half stack element to delete mid.
        int[] temp = new int[mid];

        // copy element from stack till mid size.
        for(int i=0;i<mid;i++)
            temp[i] = st.pop();

        // Push element from second last index of temp array, and thus mid removed.
        for(int i=mid-2;i>=0;i--)
            st.push(temp[i]);

        System.out.println("Mid item deleted successfully:");
        System.out.println(st);

    }
}
