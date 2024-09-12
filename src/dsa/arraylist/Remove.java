package dsa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("numbers = " + numbers);
        numbers.remove(3); // index
        System.out.println("numbers = " + numbers);
        numbers.remove(Integer.valueOf(3)); // Object
        System.out.println("numbers = " + numbers);

    }
}
