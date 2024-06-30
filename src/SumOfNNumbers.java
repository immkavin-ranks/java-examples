import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, n;
        System.out.println("Enter N: ");
        n = Integer.parseInt(reader.readLine());
        int [] nNumbers = new int[n];
        System.out.print("Enter " + n + " numbers:\n");
        for (int i = 0; i < n; i++) {
            nNumbers[i] = Integer.parseInt(reader.readLine());
            sum += nNumbers[i];
        }
        System.out.println("sum = " + sum);
    }
}
