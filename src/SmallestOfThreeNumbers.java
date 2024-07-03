import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers: ");
        int smallest = 0;
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            if (i == 0) {
                smallest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        br.close();
        System.out.println("Smallest number = " + smallest);
    }
}
