public class Main {
    static String str = "";

    static
    {
        str = "Hello World";
    }

    public static void main(String[] args) {

        System.out.println("String value:  "+str); // static block will execute before main method block.
    }
}
