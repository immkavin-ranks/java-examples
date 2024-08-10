/* SeparateEvenOddNumbers.java */
// TCS Interview Question
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenOddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));

        List<Integer> evenNumbers = map.get(true);
        List<Integer> oddNumbers = map.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
