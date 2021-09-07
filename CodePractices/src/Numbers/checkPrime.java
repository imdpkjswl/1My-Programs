package Numbers;

public class checkPrime {
    private static boolean isPrime(int num) {
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 2;
        boolean result = isPrime(num);
        //System.out.println(result);

        for(int i=1;i<50;i++){
            if(isPrime(i)){
                System.out.print(i+"  ");
            }
        }
    }
}
