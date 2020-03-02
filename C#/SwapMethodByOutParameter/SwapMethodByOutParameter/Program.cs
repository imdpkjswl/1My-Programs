using System;

namespace CalculatorApplication
{

    class NumberManipulator
    {

        public void getValues(out int x, out int y)
        {
            int temp;
            Console.WriteLine("Enter the first value: ");
            x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the second value: ");
            y = Convert.ToInt32(Console.ReadLine());

            temp = x;
            x = y;
            y = temp;
        }

        static void Main(string[] args)
        {
            NumberManipulator n = new NumberManipulator();

            /* local variable definition */
            int a , b;

            /* calling a function to get the values */
            n.getValues(out a, out b);

            Console.WriteLine("After method call, value of first  : {0}", a);
            Console.WriteLine("After method call, value of second : {0}", b);
            Console.ReadLine();
        }
    }
}