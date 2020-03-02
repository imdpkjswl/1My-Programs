import java.util.Scanner;
//Java Program to demonstrate the use of If else-if ladder.
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
public class LADDER {
    public static void main(String[] args) {

        System.out.println("Enter your marks");

        Scanner in = new Scanner(System.in);
        int marks=in.nextInt();

        if(marks >=0 && marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<=100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid! , Please Enter the correct marks");
        }
    }
}  