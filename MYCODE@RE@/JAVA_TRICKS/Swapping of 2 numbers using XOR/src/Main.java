public class Main {

    public static void main(String[] args) {
        int a = 12;
        int b = 13;

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println(a);
        System.out.println(b);
    }
}
