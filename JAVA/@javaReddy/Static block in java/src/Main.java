public class Main {

    static
    {
        System.out.println("Static block up");
    }

    public static void main(String[] args) {

        System.out.println("Static In Main");
    }

    static
    {
        System.out.println("Static block down");
    }
}
