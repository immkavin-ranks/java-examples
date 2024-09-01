package dsa.arrays;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);

        tda.insertValueInArray(0, 0, 10);
        tda.insertValueInArray(0, 0, 20);
        tda.insertValueInArray(3, 0, 20);

        System.out.println(Arrays.deepToString(tda.arr));

        tda.insertValueInArray(0, 1, 20);
        tda.insertValueInArray(0, 2, 30);
        tda.accessCell(0, 1);

        tda.traverse2DArray();

        tda.searchIn2DArray(30);
        tda.searchIn2DArray(40);

        tda.deleteValueFromArray(0, 2);
        tda.traverse2DArray();
    }
}
