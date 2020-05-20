/**
 * !!!! Coins array must be sorted in Non-Increasing Order !!!!
 * Note: Greedy Algorithms does not guarantee Optimal Solution.
 *  If m != 0, Then Solution does not exist.

 *  Complexity Analysis:
 * Time Complexity: O(N*logN).
 * Auxiliary Space: O(1) as no additional space is used.
 */

public class Main {

    static int[] ans = new int[100]; // store Optimal solution.

    public static int findMinCoins(int []coins, int size,  int m) {
        int i, count = 0;

        for(i = 0; i < size; i++)
        {
            //take as much from coins[i]
            while(m >= coins[i])
            {
                //after taking the coin, reduce the value.
                m -= coins[i];
                ans[count++] = coins[i];
                //count++;
            }
            if(m == 0)
                break;
        }

        if(m != 0) {
            System.out.println("Solution does not exist.");
            System.exit(0);
        }
        return count;
    }

    public static void  main(String [] args)
    {
        /* Example for solution does not exist  */
//        int[] coins = {10,5,2};
//        int i, m = 11;

        /* Example for solution is an optimal solution */
        int[] coins = {25,10,5,1};
        int i, m = 48;

        /* Example for will not guarantee optimal solution */
//        int[] coins = {25,15,1};
//        int i, m = 30;


        //find the size of the coins array
        int size = coins.length;

        int MinCount = findMinCoins(coins,size,m);

        System.out.printf("Total Coins Needed = %d\n",MinCount);

        System.out.printf("Coins are:\t");
        for(i = 0; i < MinCount; i++)
            System.out.printf("%d ", ans[i]);


    }
}