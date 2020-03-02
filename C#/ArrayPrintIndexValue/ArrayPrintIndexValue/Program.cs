using System;

namespace ArrayApplication
{

    class MyArray
    {

        static void Main(string[] args)
        {
            int[] n = new int[100]; /* n is an array of 10 integers */
            int i, j,term;

            Console.WriteLine("Enter the Last Term");
            term = Convert.ToInt32(Console.ReadLine());

            /* initialize elements of array n */
            for (i = 0; i < term; i++)
            {
                n[i] = i + 100;
            }

            /* output each array element's value */
            for (j = 0; j < term; j++)
            {
                Console.WriteLine("Index[{0}] = {1}", j, n[j]);
            }

            Console.ReadKey();
        }
    }
}