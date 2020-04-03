public class Main {

    public static void main(String[] args) {
	int a = 8;
	int b = 3;

	    b = a + b - (a=b); // assigning in this fashion is allowed.

	    System.out.println(a+ "    "+b);
    }
}
