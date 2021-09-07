package Numbers;

/**
 * Time complexity:
 * O(n) + n/2 + n/3 + n/5 + ...
 * O(n) + O(n*log(log(n)))
 * O(n*log(log(n)))
 */
public class NthPrime_AllPrime {
    private static void sieveOfEratosthenes(int[] prime, int n) {
        // As per algo, Assume all are prime
        for (int i = 0; i <= n; i++)
            prime[i] = 1;

        // Marking 0's & 1's as Not Prime
        prime[0] = 0;
        prime[1] = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[i] == 1) {
                // Update all multiples of i*j
                for (int j = 2; i*j <= n; j++)
                    prime[i*j] = 0; // not prime
            }
        }

    }
    public static void main(String[] args) {
        int[] NthPrime = new int[1001]; int j = 1;

        int limit = 1000;
        int[] allPrime = new int[limit + 1];
        sieveOfEratosthenes(allPrime, limit);
        // Printing (1-N) prime numbers:
        for (int i =2; i <= limit; i++) {
            if (allPrime[i] == 1) {
                System.out.print(i + " ");
                NthPrime[j++] = i;
            }
        }
        System.out.println();

        // Finding nth prime number
        int Nth = 5;
        System.out.println(Nth+"th prime number is:  "+NthPrime[Nth]);

    }
}
