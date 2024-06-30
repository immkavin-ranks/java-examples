import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int x) {
        if (x == 2) return true;
        if (x < 2 || x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
