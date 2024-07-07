import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthFibonacciSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter range: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println(getNthFibonacciNumber(n));
        int n1 = 1, n2 = 0;
        while (n-- > 0) {
            System.out.print(n2 + " ");
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
    }

    private static long getNthFibonacciNumber(int N) {
        if (N < 2) return 0;
        if (N == 2) return 1;
        return getNthFibonacciNumber(N - 1) + getNthFibonacciNumber(N - 2);
    }
}
