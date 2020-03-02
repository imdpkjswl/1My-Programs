using System;

namespace RectangleApplication
{
    class Rectangle
    {
        //member variables
        public double length;
        public double width;

        public double GetArea()
        {
            return length * width;
        }
        //member function
        public void Display()
        {
            Console.WriteLine("Length: {0}", length);
            Console.WriteLine("Width: {0}", width);
            Console.WriteLine("Area: {0}", GetArea());
        }
    }//end class Rectangle

    class ExecuteRectangle
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter The Length and Width of Recatangle");

            Rectangle r = new Rectangle();  // Object for Rectangle class i.e. r.
            r.length = Convert.ToDouble(Console.ReadLine());
            r.width =  Convert.ToDouble(Console.ReadLine());
            r.Display();
            Console.ReadLine();
        }
    }
}