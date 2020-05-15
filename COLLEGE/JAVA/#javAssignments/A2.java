import java.util.Scanner;

public class Main {
    static Scanner in =new Scanner(System.in);
    public static void main(String[]args) {
        
        

        double weight, newWeight;
        int ch;
        double rg [] = {0.78,0.39,2.65,1.17,1.05,1.23};

        System.out.println("Enter earth weight");
        weight= in.nextDouble();

        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus\t\t2. Mars\t\t3.Jupiter");
        System.out.println("4. Saturn\t\t5. Uranus\t\t6.Neptune");

        System.out.println("Which planet are you want to visit?");
        ch=in.nextInt();

        if(ch>6 || ch<1)
        {
            System.out.println("Invalid input Entered.");
            return;
        }
        ch = ch-1;
        newWeight = rg[ch]*weight;
        System.out.println("Your Weight Would Be "+newWeight+" lbs on that planet.");


    }
}
