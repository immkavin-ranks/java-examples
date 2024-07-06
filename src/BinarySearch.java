public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 12, 23, 27, 34, 96, 256};
        int i = binarySearchRecursive(arr, 0, arr.length - 1, 7);
        if (i == -1) System.out.println("Not found.");
        else System.out.println("Found at index " + i);
    }

    private static int binarySearchRecursive(int[] arr, int i, int j, int k) {
        if (j < i) return -1;
        int mid = i + (j - 1) / 2;
        if (arr[mid] == k) return mid;
        if (arr[mid] > k) return  binarySearchRecursive(arr, i, mid - 1, k);
        return binarySearchRecursive(arr, mid + 1, j, k);
    }
}
