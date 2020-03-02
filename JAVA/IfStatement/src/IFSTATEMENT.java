import java.util.Scanner;

public class IFSTATEMENT {

    //Java Program to demonstrate the use of if statement.
        public static void main(String[] args) {
            //defining an 'age' variable
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your age");
            int age= in.nextInt();
            //checking the age
            if(age >=18) {
                System.out.println("You are eligible for Voting");
            }
            if(age<18) {
                System.out.println("You are not eligible for Voting");
            }
        }
}
