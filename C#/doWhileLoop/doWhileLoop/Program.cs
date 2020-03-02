using System;

namespace Loops
{
    class Program
    {
        static void Main(string[] args)
        {

            int n = 1;

            do
            {
                Console.WriteLine("value of n : {0}", n);
                n++ ;
            }
            while (n <= 20);
            Console.ReadLine();
        }
    }
}