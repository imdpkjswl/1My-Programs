import java.util.*;

public class fractionalKnapsackGreedyTechnique {
    static int n, m, rc;            // rc is remaining capacity
    static float[] w = new float[n];
    static float[] p = new float[n];
    static float[] x = new float[n];  // contain solutions
    static float[] pw = new float[n];

    // finding pi/wi and arranged in decreasing order:
    static void fractionSort(){
        for(int i=0;i<n;i++){
            pw[i] = (p[i] / w[i]);  // calculating fraction of profit and weight
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(pw[i] > pw[i+1]){
                    float temp1, temp2, temp3;
                    temp1 = pw[i];
                    pw[i] = pw[i+1];
                    pw[i+1] = temp1;

                    temp2 = w[i];
                    w[i] = w[i+1];
                    w[i+1] = temp2;

                    temp3 = p[i];
                    p[i] = p[i+1];
                    p[i+1] = temp3;

                }
            }
        }

        System.out.println(Arrays.toString(pw));
        System.out.println(Arrays.toString(w));
        System.out.println(Arrays.toString(p));
    }

    static void greedyKnapsack(){

    }



    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of instance:");
            n =in.nextInt();
            System.out.println("Enter the weights:");
                for(int i=0;i<n;i++)
                    w[i] = in.nextFloat();
            System.out.println("Enter the profits:");
                for(int i=0;i<n;i++)
                    p[i] = in.nextFloat();
            System.out.println("Enter the capacity of knapsack:");
            m = in.nextInt();
            rc = m;

            fractionSort();

            //System.out.println("The Total Optimal Profit Is " + sum);

    }
}
