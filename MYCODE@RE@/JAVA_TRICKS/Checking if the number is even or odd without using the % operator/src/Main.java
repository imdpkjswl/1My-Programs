public class Main {
    public static void main(String[] args) {
        int num = 23;

        if((num & 1) == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");

        num = 12;
        System.out.println((num & 1) == 0 ?  "EVEN" : "ODD" );
    }
}
