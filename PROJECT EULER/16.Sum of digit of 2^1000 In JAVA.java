using System;
using System.Diagnostics;
using System.Numerics;

namespace euler {
    class Problem16 {

        public static void Main(string[] args) {
            new Problem16().SolveUsingBigInteger();            
        }

        public void SolveUsingBigInteger() {
            Stopwatch clock = Stopwatch.StartNew();

            const int value = 2;
            const int exponent = 1000;
            int result = 0;

            BigInteger number = BigInteger.Pow(value, exponent);

            while (number > 0) {
                result += (int) (number % 10);
                number /= 10;
            }

            clock.Stop();            
            Console.WriteLine("The sum og digits of {1}^{2} is: {0}", result, value, exponent);
            Console.WriteLine("Solution took {0} ms", clock.ElapsedMilliseconds);
        }

    }
}