import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter input: ");
        String input = reader.readLine();
        StringBuilder reversedInput = new StringBuilder(input);
        reversedInput.reverse();
        if (input.equals(new String(reversedInput))) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        }
        return true;
    }

}
