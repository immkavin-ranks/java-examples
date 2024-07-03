import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        do {
            System.out.print("Enter a character: ");
            input = br.readLine();
        } while (input.length() > 1);
        char ch = input.charAt(0);
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')
            System.out.println("Arithmetic Operator");
        else
            System.out.println("Not an Arithmetic Operator");
    }
}
