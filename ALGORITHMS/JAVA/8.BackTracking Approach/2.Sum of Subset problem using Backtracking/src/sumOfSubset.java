import java.util.*;

// Padma Reddy Program
public class sumOfSubset {
    static int count = 0, m;
    static boolean flag = false;
    static int[] x = new int[10];
    static int[] w = new int[10];

    static void subset(int weightSoFar, int k, int totalRemainingWt){
        x[k] = 1;

        if(weightSoFar + w[k] == m){
            if(flag == false){
                System.out.print("The solution is:");
                flag = true;   // used to check soln found or not
            }

            System.out.print("\nSubset solution = "+(++count)+"\n");
            for(int i=0;i<=k;i++){
                if(x[i] == 1) System.out.print(w[i]+" ");
            }
            return;
        }

        if(weightSoFar + w[k] + w[k+1] <= m){
            subset(weightSoFar + w[k], k+1, totalRemainingWt - w[k]);
        }

        if((weightSoFar + totalRemainingWt - w[k] >= m) && (weightSoFar + w[k+1]) <= m){
            x[k] = 0;
            subset(weightSoFar, k+1,totalRemainingWt - w[k]);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int sum =0,n;
        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();

        System.out.println("Enter the elements in ascending order:");
        for(int i=0;i<n;i++) w[i] = sc.nextInt();

        System.out.println("Enter the required sum:");
        m = sc.nextInt();

        for(int i=0;i<n;i++) sum += w[i];

        if(sum < m){
            System.out.println("No solution exist.");
            return;
        }


        subset(0,0,sum);
        if(flag == false){
            System.out.println("No solution found");
        }

    }
}
