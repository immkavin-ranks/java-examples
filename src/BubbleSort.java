public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 4, 23, 27, 96, 34, 256, 12};
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
