import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        StringBuilder rstr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr.append(str.charAt(i));
        }
//        for (char c : str.toCharArray()) {
//            rstr.insert(0, c);
//        }
        System.out.println(rstr);
    }

}
