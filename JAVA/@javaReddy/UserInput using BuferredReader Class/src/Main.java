import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception  //IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 12;
        int b;

        try{
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            a = a+b;
            System.out.println("Addition :  "+a);
        }
        catch(IOException ex){
            System.out.println("Error occurred:  "+ex);
        }

        finally {
            br.close();  // closing the resources that we had used earlier.
            System.out.println("BYE...");
        }

    }
}
