public class powerCalculation {

        /* Function to calculate x raised to the power y of time complexity O(n) */
        static int power(int x, int y)
        {
            if (y == 0)
                return 1;
            else if (y % 2 == 0)
                return power(x, y / 2) * power(x, y / 2);
            else
                return x * power(x, y / 2) * power(x, y / 2);
        }

    /** Function to calculate x raised to the power y in O(logn)
    int power(int x, unsigned int y)
    {
        int temp;
        if( y == 0)
            return 1;
        temp = power(x, y/2);
        if (y%2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }       */

    /* Program to test function power */
        public static void main(String[] args)
        {
            int x = 2;
            int y = 10;

            System.out.printf("%d", power(x, y));
        }



}
