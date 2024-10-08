import java.util.Random;

public class HandleException {
    public static void main(String[] args) {
        Random random = new Random();
        int c = 0;
        for (int i = 0; i < 7; i++) {
            try {
                int a = random.nextInt();
                int b = random.nextInt();
                c = 12345 / (a/b);
            } catch (ArithmeticException e) {
                System.out.print("reset c = ");
                c = 0;
            } finally {
                System.out.println(c);
            }
        }
    }
}
