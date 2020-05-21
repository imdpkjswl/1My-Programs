import java.util.*;

public class fractionalKnapsackGreedyTechnique {
    static Scanner in = new Scanner(System.in);
    static{
        System.out.println("Enter the number of instance:");
        n =in.nextInt();
    }
    static int n, m;
    static float rc;            // rc is remaining capacity
    static float[] w = new float[n];
    static float[] p = new float[n];
    static float[] x = new float[n];  // contain solutions
    static float[] pw = new float[n];

    // finding pi/wi and arranged in decreasing order:
    static void fractionSort() {
        for(int i=0;i<n;i++) {
            pw[i] = (p[i] / w[i]);  // calculating fraction of profit and weight
        }

        // Sorting pw in decreasing order with placing respective value in their places using bubble sort:
        for(int j=1;j<n;j++) {
            for(int i=0;i<n-j;i++) {
                if(pw[i] < pw[i+1]) {
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

//        System.out.println(Arrays.toString(pw));
//        System.out.println(Arrays.toString(w));
//        System.out.println(Arrays.toString(p));
    }

    static float greedyKnapsack(){
        float sum=0f;

        for(int i=0;i<n;i++)
            x[i] = 0;
        rc = m;

        for(int i=0;i<n;i++){
            if(w[i] <= rc){
                rc = rc - w[i];
                x[i] = 1;
            }
            else{
                x[i] = rc/w[i];
                rc = rc - (w[i]*x[i]);
            }

            if(rc == 0)
                break;
        }

        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(x));
        for(int i=0;i<n;i++){
            sum += p[i]*x[i];
        }

        return sum;
    }


// This program is not able to select multiple objects.Hence it will not work on large  value of capacity.
    public static void main(String args[]){

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
            float result = greedyKnapsack();

            System.out.println("The total optimal profit is:  " + result);

    }
}
