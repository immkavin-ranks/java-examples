package dsa.arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int [] arr;
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Inserted successfully.");
            } else {
                System.out.println("There is already a value is assigned.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array.");
        }
    }

    public void traverseArray() {
        try {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array does not exist.");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at index " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found in the array.");
    }

    public void deleteValue(int indexOfValueToDelete) {
        try {
            arr[indexOfValueToDelete] = Integer.MIN_VALUE;
            System.out.println("The value at " + indexOfValueToDelete + " is successfully deleted.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index value is not in the range of array.");
        }
    }
}

