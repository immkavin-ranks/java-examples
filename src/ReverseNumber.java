import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(reader.readLine()), nReversed = 0, remainder;
        do {
            remainder = n % 10;
            nReversed = nReversed * 10 + remainder;
            n /= 10;
        } while (n > 0);
        System.out.println("nReversed = " + nReversed);
    }
}
