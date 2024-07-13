public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;
        for (int i : arr) total -= i;
        System.out.println("Missing number: " + total);
    }
}
