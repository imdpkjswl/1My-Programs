import java.util.Scanner;

public class Prime{
    public static void main(String[] args){

        System.out.println("Enter a number");

        Scanner in = new Scanner(System.in);
        int num =  in.nextInt();

        int res;
        res = isPrime(num);

        if(res == 1)
            System.out.println("Prime number");
        else
            System.out.println("not Prime number");
    }

   static int isPrime(int n){
        int i;

        if(n==1 || n==0) // 1 and 0 is not prime number
            return 0;

        for(i=2;i<n/2;i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
   }
}