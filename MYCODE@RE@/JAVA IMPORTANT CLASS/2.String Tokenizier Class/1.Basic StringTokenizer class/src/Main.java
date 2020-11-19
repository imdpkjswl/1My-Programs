import java.util.StringTokenizer;

public class Main{

    public static void main(String args[]){

        StringTokenizer st = new StringTokenizer("My Name is Deepak Jaiswal"," ");

        while (st.hasMoreTokens()) {  // checks if there is more tokens available
            System.out.println(st.nextToken()); // returns the next token from the StringTokenizer object.
        }
    }
}  