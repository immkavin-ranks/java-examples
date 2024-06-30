import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int n = Integer.parseInt(reader.readLine());
        int sum = 0, input = n, order = getOrderOfNumber(n), remainder;
        while(n > 0) {
            remainder = n % 10;
            sum += (int) Math.pow(remainder, order);
            n /= 10;
        }
        if (sum == input) System.out.println(input + " is an armstrong number.");
        else System.out.println(input + " is not an armstrong number.");
    }

    private static int getOrderOfNumber(int x) {
        int order = 0;
        while (x > 0) {
            x /= 10;
            order++;
        }
        return order;
    }
}
