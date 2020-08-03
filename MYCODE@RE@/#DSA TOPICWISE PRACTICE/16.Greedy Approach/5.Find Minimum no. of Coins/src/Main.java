import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Greedy strategy does not give the surety about optimal solutions.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of denominations");
        int n = in.nextInt();

        int[] deno = new int[n];
        System.out.println("Enter denominations:");
        for(int i=0;i<n;i++)
            deno[i] = in.nextInt();
        // Note: Condition for this problem is deno must be sorted.
        Arrays.sort(deno);

        System.out.println("Enter the capacity:");
        int cap = in.nextInt();

        for(int i=n-1;i>=0;i--){

            while(cap >= deno[i]){
                cap -= deno[i];
                answer.add(deno[i]);
            }
        }

        int count =0;
        System.out.println("Answer is:");
        for (Integer coin : answer) {
            System.out.print(coin + "  ");
            count++;
        }
        System.out.println("\nTotal coin needed: "+count);

    }
}
