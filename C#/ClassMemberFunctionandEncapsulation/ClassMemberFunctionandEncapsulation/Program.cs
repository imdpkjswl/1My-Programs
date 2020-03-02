using System;

namespace BoxApplication
{
    class Box
    {
        private double length;   // Length of a box
        private double breadth;  // Breadth of a box
        private double height;   // Height of a box

        public void setLength(double len)
        {
            length = len;
        }
        public void setBreadth(double bre)
        {
            breadth = bre;
        }
        public void setHeight(double hei)
        {
            height = hei;
        }
        public double getVolume()
        {
            return length * breadth * height;
        }
    }
    class Boxtester
    {
        static void Main(string[] args)
        {
            Box Box1 = new Box();   // Declare Box1 of type Box
            Box Box2 = new Box();
            double volume;

            Console.WriteLine("Enter the Specifications of Two Box");
            // Declare Box2 of type Box
            // box 1 specification
            double L1= Convert.ToDouble(Console.ReadLine());
            double B1 = Convert.ToDouble(Console.ReadLine());
            double H1 = Convert.ToDouble(Console.ReadLine());
            Box1.setLength(L1);
            Box1.setBreadth(B1);
            Box1.setHeight(H1);

            // box 2 specification
            double L2 = Convert.ToDouble(Console.ReadLine());
            double B2 = Convert.ToDouble(Console.ReadLine());
            double H2 = Convert.ToDouble(Console.ReadLine());
            Box2.setLength(L2);
            Box2.setBreadth(B2);
            Box2.setHeight(H2);

            // volume of box 1
            volume = Box1.getVolume();
            Console.WriteLine("Volume of Box1 : {0}", volume);

            // volume of box 2
            volume = Box2.getVolume();
            Console.WriteLine("Volume of Box2 : {0}", volume);

            Console.ReadKey();
        }
    }
}