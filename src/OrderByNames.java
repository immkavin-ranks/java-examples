import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrderByNames {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size: ");
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            names[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    String temp = names[i];
                    names[i] = names [j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in alphabetical order");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(Arrays.stream(names).sorted().toArray()));
    }
}
