package dsa.arrays;

public class TwoDimensionalArray {
    int [][] arr;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInArray(int row, int col, int valueToInsert) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                System.out.println("The value is inserted successfully.");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index values for 2D Array.");
        }
    }

    public void accessCell(int row, int col) {
        System.out.println("Accessing row#" + row + " col#" + col);
        try {
            System.out.println("The cell value is " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index values for 2D Array.");
        }
    }

    public void traverse2DArray() {
        for (int[] row : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(row[col] + "\t");
            }
            System.out.println();
        }
    }

    public void searchIn2DArray(int valueToSearch) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == valueToSearch) {
                    System.out.println("Value is found at Row# " + row + " Col# " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found in the array.");
    }

    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Value: " + arr[row][col] + " deleted successfully.");
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index values for 2D Array.");
        }
    }
}
