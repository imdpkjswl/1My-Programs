using System;

namespace ArrayApplication
{

    class MyArray
    {

        static void Main(string[] args)
        {
            int[] n = new int[100];
            Console.WriteLine("Enter the last term");

            int term = Convert.ToInt32(Console.ReadLine());

            /* initialize elements of array n */
            for (int i = 0; i < term; i++)
            {
                n[i] = i + 100;
            }

            /* output each array element's value */
            foreach (int j in n)
            {
                
                int i = j - 100;
                Console.WriteLine("Element[{0}] = {1}", i, j);

            }
            Console.ReadKey();
        }
    }
}