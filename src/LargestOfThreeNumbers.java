import java.io.*;

public class LargestOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter three numbers: ");
        String[] s = reader.readLine().split(" ");
        double d1 = Double.parseDouble(s[0]);
        double d2 = Double.parseDouble(s[1]);
        double d3 = Double.parseDouble(s[2]);
        double D = d1;
        if (d2 > D) D = d2;
        if (d3 > D) D = d3;
        System.out.println("Largest number = " + D);
    }
}
