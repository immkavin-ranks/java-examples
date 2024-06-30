import java.util.ArrayList;

public class NumberPatternPowerOfTwo {

    public static ArrayList<ArrayList<Integer>> numberPattern(int n) {
        int num = 1;
        ArrayList<ArrayList<Integer>> pattern = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();

            int size = (int) Math.pow(2, i);

            for (int j = 0; j < size; j++) {
                innerList.add(num);
                num = num % 9 + 1;
            }
            pattern.add(innerList);
        }
        return pattern;
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        ArrayList<ArrayList<Integer>> result = numberPattern(n);
        System.out.println("result = " + result);
        for (ArrayList<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
