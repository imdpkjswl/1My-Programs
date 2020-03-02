using System;

namespace BoxApplication
{
    class Box
    {
        public double length;   // Length of a box
        public double breadth;  // Breadth of a box
        public double height;   // Height of a box
    }
    class Boxtester
    {
        static void Main(string[] args)
        {
            Box Box1 = new Box();   // Declare Box1 of type Box
            Box Box2 = new Box();   // Declare Box2 of type Box
            double volume = 0.0;    // Store the volume of a box here

            // box 1 specification
            Console.WriteLine("Enter the Specification Of First Box");
            Box1.height = Convert.ToDouble(Console.ReadLine());
            Box1.length = Convert.ToDouble(Console.ReadLine());
            Box1.breadth = Convert.ToDouble(Console.ReadLine());

            // box 2 specification
            Console.WriteLine("Enter the Specification Of First Box");
            Box2.height = Convert.ToDouble(Console.ReadLine());
            Box2.length = Convert.ToDouble(Console.ReadLine());
            Box2.breadth = Convert.ToDouble(Console.ReadLine());

            // volume of box 1
            volume = Box1.height * Box1.length * Box1.breadth;
            Console.WriteLine("Volume of Box1 : {0}", volume);

            // volume of box 2
            volume = Box2.height * Box2.length * Box2.breadth;
            Console.WriteLine("Volume of Box2 : {0}", volume);
            Console.ReadKey();
        }
    }
}