import java.io.IOException;

public class userInput {
    public static void main(String []args) throws IOException {

        /* Code to take one char input from user.
        int i = System.in.read();
        System.out.println((char)i);
        */
        int i; // trying to take string from user.
        String str = "";

        while((i = System.in.read()) != 46){ // 46 is the ASCII value of dot key.
            str = str + i;
        }
        System.out.println(str);

    }
}
