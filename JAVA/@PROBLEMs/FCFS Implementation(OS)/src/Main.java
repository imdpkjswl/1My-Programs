import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int []at = new int[100];
        int []bt = new int[100];
        int []gt = new int[100];
        System.out.println("First Come First Serve Scheduler:\n");
        System.out.println("Enter the no. of process: ");
        n = in.nextInt();
        for(int i=0;i<n;i++)
            gt[i] = (i+1);

        System.out.println("Enter "+n+" arrival time:");
        for(int i=0;i<n;i++){
            at[i] = in.nextInt();
        }

        System.out.println("Enter "+n+" burst time:");
        for(int i=0;i<n;i++){
            bt[i] = in.nextInt();
        }

        // Rearranging the arrival time in increasing order.
        for(int j=1;j<n;j++){
            for(int i=0;i<n-j;i++){
                if(at[i+1] < at[i]){
                    int temp1, temp2,temp3;
                    temp1= at[i];
                    at[i] = at[i+1];
                    at[i+1] = temp1;

                    temp2 = bt[i+1];
                    bt[i+1] = bt[i];
                    bt[i] = temp2;

                    temp3 = gt[i+1];
                    gt[i+1] = gt[i];
                    gt[i] = temp3;
                }
            }
        }
        int totalTime = 0;

        // Showing table
        System.out.println("\nArrival Time: ");
        for(int i=0;i<n;i++) {
            System.out.print(at[i] + "  ");
        }
        System.out.println();
        System.out.println("Burst Time: ");
        for(int i=0;i<n;i++) {
            System.out.print(bt[i] + "  ");
        }

        System.out.println("\nGantt Chart:");
        for(int i=0;i<n;i++){
            if(i==0)
                System.out.print("Process:        ");
            System.out.print("    P"+gt[i]+" ");
        }

        System.out.println();
        totalTime += at[0];
        for(int i=0;i<n;i++) {
            if(i==0)
                System.out.print("Interval:       ");
            System.out.print(totalTime+"      ");
            totalTime += bt[i];
        }
        System.out.print(totalTime+"     ");





    }
}
