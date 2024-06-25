public class OddOrEvenTillHundred {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100) {
            System.out.println("i = " + i + ((i % 2 == 0) ? " Even" : " Odd"));
        }
    }
}
