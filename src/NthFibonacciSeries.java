import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthFibonacciSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter range: ");
        int n = Integer.parseInt(reader.readLine());
        int n1 = 1, n2 = 0;
        while (n-- > 0) {
            System.out.print(n2 + " ");
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
    }
}
