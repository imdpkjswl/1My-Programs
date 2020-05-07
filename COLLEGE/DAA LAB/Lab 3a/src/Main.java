import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        System.out.println("Please enter first number(Nr):");
        float Nr = in.nextFloat();

        System.out.println("Please enter second number(Dr):");
        float Dr = in.nextFloat();

        try{
            new Main().doDivide(Nr,Dr);
        } catch(Exception ex){
            System.out.println("Exception condition program is ending");
        }
    }

    public void doDivide(float a, float b) {
        float res = a/b;
        System.out.println("Division results of "+a+"/"+b+" = " +res);
    }
}
