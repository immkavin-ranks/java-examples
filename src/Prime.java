import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("isPrime(" + n +"): " + isPrime(n));
        System.out.println("getFirstNPrimes(" + n +"): " + getFirstNPrimes(n));
        System.out.println("getPrimesTillN(" + n +"): " + getPrimesTillN(n));
        reader.close();
    }

    private static boolean isPrime(int x) {
        if (x == 2 || x == 3) return true;
        if (x < 2 || x % 2 == 0 || x % 3 == 0) return false;
        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> getFirstNPrimes(int N) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        int num = 3;
        while (primes.size() < N) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if (num % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(num);
            num += 2;
        }
        return primes;
    }

    private static List<Integer> getPrimesTillN(int n) {
        // Sieve of Eratosthenes algorithm
        List<Integer> primes = new ArrayList<>();
        if (n > 1) {
            primes.add(2);
            boolean[] prime = new boolean[(n + 1) / 2];
            Arrays.fill(prime, true);
            for (int p = 3; p * p <= n; p += 2) {
                if (prime[p / 2]) {
                    for (int i = p * p; i <= n; i += 2 * p) {
                        prime[i / 2] = false;
                    }
                }
            }
            for (int i = 3; i <= n; i += 2) {
                if (prime[i / 2]) {
                    primes.add(i);
                }
            }
        }
        System.out.println("There are " + primes.size() + " prime(s) till " + n);
        return primes;
    }
}