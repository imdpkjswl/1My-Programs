import java.util.Scanner;

public class IFELSE {

    //Java Program to demonstrate the use of if statement.
    public static void main(String[] args) {
        //defining an 'age' variable
        System.out.println("Enter your age");

        Scanner in = new Scanner(System.in);
        int age= in.nextInt();
        //checking the age
        if(age >=18) {
            System.out.println("You are eligible for Voting");
        }else{
            System.out.println("You are not eligible for Voting");
        }
    }
}
