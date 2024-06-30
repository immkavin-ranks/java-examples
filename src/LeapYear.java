import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter year: ");
        int year = Integer.parseInt(br.readLine());
        System.out.printf("\nisLeapYear("+year+") = " + isLeapYear(year));
    }

    private static boolean isLeapYear(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }
}
