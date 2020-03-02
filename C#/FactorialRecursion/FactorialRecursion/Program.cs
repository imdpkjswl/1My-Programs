using System;

namespace CalulationApplication
{
    class NumberManipulator
    {
        public int factorial(int num)
        {
            /* local variable declaration */
            int result;

            if (num == 1 || num == 0)
                return 1;
            
            else
            {
                result = num * factorial(num - 1);
                return result;
            }
        
    } // end of factorial method
        static void Main(string[] args)
        {
            int num;

            Console.WriteLine("Enter a number");

            num = Convert.ToInt32(Console.ReadLine());

            NumberManipulator n = new NumberManipulator();

            //calling the factorial method {0}", n.factorial(num));

            Console.WriteLine("Factorial of {0} is : {1}", num , n.factorial(num));
           
            Console.ReadLine();
        } // end of main method
    } // end of class NumberManipulator

} // end of namespace CalulationApplication