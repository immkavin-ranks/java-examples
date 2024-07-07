import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = s.nextInt(), b = s.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcd1(a, b));
        System.out.println(gcdrc(a, b)); // 1071, 462
    }

    // Euclidean algorithm - subtraction based version
    private static int gcd(int a, int b) {
        while (a != b) if (a > b) a -= b; else b -= a;
        return a;
    }

    // division-based version
    private static int gcd1(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    private static int gcdrc(int a, int b) {
        if (b == 0) return a;
        return gcdrc(b, a % b);
    }

// https://en.wikipedia.org/wiki/Euclidean_algorithm
}
