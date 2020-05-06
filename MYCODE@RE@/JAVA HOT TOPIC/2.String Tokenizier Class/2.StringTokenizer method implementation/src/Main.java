// Pragrom in Java illustrating the methods of StringTokenizer class:
// hasMoreToken     nextToken   countTokens
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        String mydelim = " : ";
        String mystr = "JAVA : Code : String : Tokenizer : Geeks";

        char[] str = new char[20];

        // Use of Constructor 2
        // Here we are passing Delimiter - "mydelim"
        StringTokenizer geeks3 =  new StringTokenizer(mystr, mydelim);

        // Printing count of tokens and tokens
        int count = geeks3.countTokens();
        System.out.println("Number of tokens : " + count + "\n");
        for (int i = 0; i <count; i++)
            System.out.println("token at [" + i + "] : " + geeks3.nextToken());


        // .hasMoreTokens() method checks for more Tokens.
        // Here not working as no Tokens left
        while (geeks3.hasMoreTokens())
            // .nextToken is method is returning next token.
            System.out.println(geeks3.nextToken());
    }
}