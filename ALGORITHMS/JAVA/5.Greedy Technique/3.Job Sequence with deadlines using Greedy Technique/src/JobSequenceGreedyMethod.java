import java.util.*;

public class JobSequenceGreedyMethod {

        static Scanner in = new Scanner(System.in);
        static{
            System.out.println("Enter the number of jobs:");
            n =in.nextInt();
        }
        static int n, temp, high;
        static int[] jobs;
        static int[] profit = new int[n];
        static int[] deadline = new int[n];

        public static void read(){
            System.out.println("Enter the Profits:");
            for(int i=0;i<n;i++)
                profit[i] = in.nextInt();
            System.out.println("Enter the Deadlines:");
            for(int i=0;i<n;i++)
                deadline[i] = in.nextInt();

            // Finding maximum deadline time:
            for(int i=0;i<n;i++) {
                if(high < deadline[i])
                    high = deadline[i];
            }

            jobs = new int[high];  // for making jobs size the max value of deadline.
        }


        public static void sortProfit() {
            for(int i=0;i<high;i++) {
                jobs[i] = -1;
            }


            // Sorting profit in decreasing order with other respective value in their places using bubble sort:
            for(int j=1;j<n;j++) {
                for(int i=0;i<n-j;i++) {
                    if(profit[i] < profit[i+1]) {
                        int temp1, temp2;
                        temp1 = profit[i];
                        profit[i] = profit[i+1];
                        profit[i+1] = temp1;

                        temp2 = deadline[i];
                        deadline[i] = deadline[i+1];
                        deadline[i+1] = temp2;
                    }
                }
            }

            System.out.println(Arrays.toString(profit));  // FOR CHECKING PURPOSE
            System.out.println(Arrays.toString(deadline));
        }


        public static int jobSequenceImplementation(){
            int d;
            for(int i=0;i<n;i++){
                temp = profit[i];   // Selecting ith item from profit array.
                d= deadline[i];     // Selecting ith deadline time and note that array started from ZERO index.So,We have to reduce its index by one.
                if(jobs[d-1] == -1){       // Checking (d-1)th position is empty or not.
                    jobs[d-1] = temp;
                }
                else {
                    for(int k= d-1;k>=0;k--){  // If Position already assign, Try to assign left side of jobs array(IF ANY VACANT PRESENT otherwise skip)
                        if(jobs[k] == -1){
                            jobs[k] = temp;
                            break;   // Not supposed to run further after assigned value to job array.
                        }
                    }
                }
            }

             System.out.println(Arrays.toString(jobs));  //  FOR CHECKING PURPOSE
            int sum=0;
            for(int i=0;i<high;i++){
                sum += jobs[i];
            }
            return sum;

        }



        public static void main(String args[]){
            read();
            sortProfit();
            int result = jobSequenceImplementation();
            System.out.println("The total optimal profit is:  " + result);

        }


}
