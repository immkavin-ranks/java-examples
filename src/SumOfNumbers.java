import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        System.out.println("Enter Numbers: ");
        String[] input = reader.readLine().split(" ");
        for (String i : input) {
            sum += Integer.parseInt(i);
        }
        System.out.println("sum = " + sum);
    }
}
