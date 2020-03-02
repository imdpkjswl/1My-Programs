using System;

namespace CalculatorApplication
{
    class NumberManipulator
    {
        public int FindMax(int num1, int num2)
        {
            
            int result;

            if (num1 > num2)
                result = num1;
            else
                result = num2;

            return result;
        }
    }
    class Test
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter any two number");

            /* local variable definition */
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            int big;
            NumberManipulator n = new NumberManipulator();

            //calling the FindMax method
            big = n.FindMax(a, b);
            Console.WriteLine("Max value is : {0}", big);
            Console.ReadLine();
        }
    }
}