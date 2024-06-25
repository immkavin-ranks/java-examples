import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthFibonacciSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter range: ");
        int n = Integer.parseInt(reader.readLine());
        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; ++i) {
            System.out.print(n2 + " ");
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
    }
}
