public class Main {

    /* Method to check if x is power of 2*/
    public static boolean isPowerOfTwo (int x) {
     /* First x in the below expression is for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);
    }

    public static void main(String[] args) {
	    int x  = 19;

	    boolean result = isPowerOfTwo(x);
	    System.out.println(result);
    }
}
