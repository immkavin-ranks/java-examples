package dsa.arrays;

public class SingleDimensionArrayDemo {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(4);
        sda.insert(0, 1);
        sda.insert(1, 3);
        sda.insert(2, 5);
        sda.insert(1, 2);
        sda.insert(4, 9);

        System.out.println("Array traversal");
        sda.traverseArray();

        sda.searchInArray(3);
        sda.searchInArray(9);

        int secondElement = sda.arr[1];
        System.out.println(secondElement);
        sda.deleteValue(1);
        System.out.println(sda.arr[1]);
    }
}