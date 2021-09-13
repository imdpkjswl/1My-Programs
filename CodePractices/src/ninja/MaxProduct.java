package ninja;

/**
 * example: max product whereas sum of digits must be n.
 * n = 4  -->  2*2 = 4
 * n = 6  -->  3*3 = 6
 * n = 8  -->  2*3*3 = 18
 * n = 10 -->  4*3*3 = 36
 */
public class MaxProduct {
    public static void main(String[] args) {
        int n =10;
        int p = 1;

        if(n < 4){
            System.out.println(n-1);
        }else{
            while(n>4){
                n = n-3;
                p = p*3;
            }
            System.out.println(p*n);
        }
    }


}
