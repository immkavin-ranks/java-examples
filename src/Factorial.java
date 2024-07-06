import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            System.out.print("Enter n: ");
            n = Integer.parseInt(br.readLine());
        } while (n < 0);
        System.out.printf("Factorial of %d is %d", n, getFactorialRecursive(n));
        System.out.printf("\nFactorial of %d is %d", n, getFactorialLoopy(n));
    }

    private static long getFactorialRecursive(int n) {
        if (n == 0) return 1;
        return n * getFactorialRecursive(n - 1);
    }

    private static long getFactorialLoopy(int n) {
        long f = 1, i = 1;
        while (i++ < n) f *= i;
        return f;
    }
}
