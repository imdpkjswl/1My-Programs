using System;

namespace DecisionMaking
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Two  Number to Get the Result");
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            switch (a)  // Outer Switch
            {
                case 1 :              Console.WriteLine("This is the value of outer switch ");
                                      Console.WriteLine("Exact value of a is : {0}", a);
                                      break;
  

                    switch (b) // Inner Switch
                    {
                        case 2 :       Console.WriteLine(); //Move cursor to next line.
                                        Console.WriteLine("This is the value of inner switch ");
                                        Console.WriteLine("Exact value of b is : {0}", b);
                                        break;
                       
                    }
                    break;

                default:
                    Console.WriteLine("Invalid Input");
                    break;
                    
            }
           Console.ReadLine();
        }
    }
}