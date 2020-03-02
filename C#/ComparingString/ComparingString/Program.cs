using System;

namespace StringApplication
{

    class StringProg
    {

        static void Main(string[] args)
        {
            Console.WriteLine("Enter any two string to compare them");

            string str1 = Console.ReadLine(); // No need to convert bcuz Read Always take string from the users.

            string str2 = Console.ReadLine();

            if (String.Compare(str1, str2) == 0)
            {
                Console.WriteLine(str1 + " and " + str2 + " are equal.");
            }
            else
            {
                Console.WriteLine(str1 + " and " + str2 + " are not equal.");
            }
            Console.ReadKey();
        }
    }
}