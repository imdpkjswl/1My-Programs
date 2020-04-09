import java.sql.Struct;
import java.util.Scanner;
import java.util.StringTokenizer;

class Customer {
    String name , dob;
    Scanner in  = new Scanner(System.in);

    void read(){
        System.out.println("Enter customer name : ");
        name =  in.next();
        System.out.println("Enter customer dob in the format dd/mm/yy");
        dob = in.next();
    }

    void display(){
        StringTokenizer st = new StringTokenizer(dob,"/");
        System.out.print(name +",");

        while(st.hasMoreTokens()) {
            String val = st.nextToken();
            System.out.print(val);
                if(st.countTokens() != 0)
                    System.out.print(","+" ");
        }
    }
}


public class Main {

    public static void main(String[] args){
            Customer obj = new Customer();
            obj.read();
            System.out.println("Customer details : \n");
            obj.display();
    }
}
