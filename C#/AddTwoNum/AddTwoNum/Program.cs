using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddTwoNum
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Two number");
            
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

           int  sum = a + b ;
            Console.WriteLine("Sum is : " +sum);
            Console.ReadKey();

            
        }
    }
}
