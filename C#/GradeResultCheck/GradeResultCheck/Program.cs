using System;

namespace DecisionMaking
{

    class Program
    {

        static void Main(string[] args)
        {
            
            char grade;

            Console.WriteLine("Enter your grade to Check your proformance");
            Console.WriteLine("Note : Always enter your grade in Upper case Letter");

            grade = Convert.ToChar(Console.ReadLine());

            Console.WriteLine("Your grade is  {0}", grade);

            switch (grade)
            {
               case 'A' :
                    Console.WriteLine("Excellent!");
                    break;
                case 'B':
                    Console.WriteLine("Very Good");
                    break;
                case 'C':
                    Console.WriteLine("Well done");
                    break;
                case 'D':
                    Console.WriteLine("You have just passed");
                    break;
                case 'F':
                    Console.WriteLine("Passed But Better try again");
                    break;
                default:
                    Console.WriteLine("Invalid grade , Please Re-enter your grade");
                    break;
            }
           
            Console.ReadLine();
        }
    }
}