import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringManipulation {
    static String RESET = "\033[0m", RED = "\033[0;31m", GREEN = "\033[0;32m";
    public static void main(String[] args) throws IOException {
        String s1 = null, s2, s3 = "", again = null;
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean validChoice;
        do {
            System.out.print("""
                    Manipulate Strings
                    1. toLowerCase()
                    2. toUpperCase()
                    3. trim()
                    4. length()
                    5. substring()
                    6. equals()
                    7. concat()
                    8. EXIT()
                    Enter your choice:\s""");
            choice = Integer.parseInt(br.readLine());
            validChoice = choice >= 1 && choice <= 7;
            if (validChoice) {
                System.out.print("Enter the String: ");
                s1 = br.readLine();
            }
            switch (choice) {
                case 1:
                    s3 = s1.toLowerCase();
                    break;
                case 2:
                    s3 = s1.toUpperCase();
                    break;
                case 3:
                    s3 = s1.trim();
                    break;
                case 4:
                    System.out.println(GREEN + s1.length());
                    break;
                case 5:
                    System.out.print("Enter start index: ");
                    int start = Integer.parseInt(br.readLine());
                    System.out.print("Enter end index: ");
                    int end = Integer.parseInt(br.readLine());
                    s3 = s1.substring(start, end);
                    break;
                case 6:
                    System.out.print("Enter another String: ");
                    s2 = br.readLine();
                    System.out.println(GREEN + s1.equals(s2));
                    break;
                case 7:
                    System.out.print("Enter another String: ");
                    s2 = br.readLine();
                    s3 = s1.concat(s2);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println(RED + "Invalid choice");
            }
            if (validChoice) {
                System.out.println(GREEN + s3 + RESET);
                System.out.print("\nTry more? (y/n): ");
                again = br.readLine();
            }
        } while (validChoice && again.equals("y"));
    }
}

// how to change console color for output only
// https://stackoverflow.com/questions/5762491/how-to-print-color-text-in-console