import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int ch, count=0; // for score 

        System.out.println("Are you ready for a quiz");
        System.out.println("Okay, here it comes");

        System.out.println("Q1) What is the capital of alaska");
        System.out.println("\t\t1)Melbourne");
        System.out.println("\t\t2)Anchorage");
        System.out.println("\t\t3)Juneau");

        ch=sc.nextInt();

        if(ch==3)
        {
            System.out.println("That's correct!");
            count++;
        }
        else if((ch==2)||(ch==1))
        {
            System.out.println("That's wrong. Capital of alaska is Juneau");
        }
        else
        {
            System.out.println("Invalid input!");
        }


        System.out.println("Q2) Can you store the value \'\'Cat\'\' in a variable of type int?");
        System.out.println("\t\t1)Yes");
        System.out.println("\t\t2)No");

        ch=sc.nextInt();

        if(ch==2)
        {
            System.out.println("That's correct!");
            count++;
        }
        else if(ch==1)
        {
            System.out.println("Sorry, \'\'Cat\'\' is a string. int can only store numbers.");
        }
        else
        {
            System.out.println("Invalid Input!");
        }


        System.out.println("Q3) What is the result of 9+6/3");
        System.out.println("\t\t1)5");
        System.out.println("\t\t2)11");
        System.out.println("\t\t3)15/3");

        ch=sc.nextInt();

        if(ch==2)
        {
            System.out.println("That's correct!");
            count++;
        }
        else if((ch==1)||(ch==3))
        {
            System.out.println("That's wrong. The result: 11");
        }
        else
        {
            System.out.println("Invalid Input!");
        }

        System.out.println("Overall, You got "+count+" correct out of 3");
        System.out.println("Thanks for playing!");
    }
}
