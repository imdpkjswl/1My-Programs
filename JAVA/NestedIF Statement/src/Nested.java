import java.util.Scanner;

// Java program to illustrate nested-if statement
// Program to find biggest number among three input numbers.
public class Nested {
    public static void main( String[] args ) {
       System.out.println("Enter Three numbers to find biggest among them");
       Scanner in =  new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();

       if(a>b){

           if(a>c)
               System.out.println(+a+" is the bigger number");
           else
               System.out.println(+c+" is the bigger number");
       }
        else if(b>c) {

               if(b>a)
                   System.out.println(+b+" is the bigger number");
               else
                   System.out.println(+a+" is the bigger number");
        }
        else if(c>a) {

            if(c>b)
                System.out.println(+c+" is the bigger number");
            else
                System.out.println(+b+" is the bigger number");
        }
    }
} 