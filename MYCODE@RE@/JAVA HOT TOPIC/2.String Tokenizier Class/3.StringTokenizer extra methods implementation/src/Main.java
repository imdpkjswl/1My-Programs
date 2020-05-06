// Program in Java illustrating the methods of StringTokenizer 
// class: hasMoreElements, nextElement and nextElement 
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        String mydelim = " : ";
        String mystr = "JAVA : Code : String : Tokenizer : Geeks";

        // Use of Constructor 2 
        // Here we are passing Delimiter - "mydelim" 
        StringTokenizer geeks =
                new StringTokenizer(mystr, mydelim);

        //  .countTokens() method counts no. of tokens present. 
        int count = geeks.countTokens();
        System.out.println("Number of tokens : " + count);

        //  use of hasMoreElements() - true if tokens are present 
        while (geeks.hasMoreElements())

            //  use of nextElement() - returns the next token 
            System.out.println(geeks.nextElement());
    }
} 