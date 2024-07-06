public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(1071, 462));
        System.out.println(gcd1(1071, 462));
        System.out.println(gcdrc(1071, 462));
    }

    // Euclidean algorithm - subtraction based version
    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
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
