import java.util.Scanner;

class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        float a,b,c;
        System.out.println("Number Division Portal::::))))");
        System.out.println("Enter a number: ");
        a=in.nextInt();
        System.out.println("Enter another nuber: ");
        b=in.nextInt();



        try{
            c =a/b;
            System.out.println("Result:  " +c);
        }

        catch(Exception ex){
            System.out.println(ex);
        }



    }
}
