import java.util.Scanner;

class addnum {
    public static void main(String args[]) {
        int a, b, sum;

        System.out.println("Enter two integers to calculate their sum");
        Scanner obj = new Scanner(System.in);

        a = obj.nextInt();
        b = obj.nextInt();
        sum = a + b;

        System.out.println("Sum of the integers = " + sum);
    }
}