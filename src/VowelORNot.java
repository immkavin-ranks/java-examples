import java.io.*;

public class VowelORNot {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter an alphabet: ");
        char c = (char) System.in.read();
        switch (c) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}
