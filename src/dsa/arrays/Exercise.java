package dsa.arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(arr)));
        System.out.println(sumOfDiagonalElements(new int[][] {{1, 2}, {3, 4}}));
        System.out.println(Arrays.toString(findTopTwoScores(new int[]{90, 84, 85, 86, 87, 85, 85, 83, 23, 45, 84, 1, 2, 0})));
        System.out.println(findMissingNumberInArray(new int[] {1, 2, 4, 5}));
        System.out.println(Arrays.toString(removeDuplicates(new int[] {1, 1, 2, 2, 3, 4, 5, 2, 2})));
        System.out.println(removeDuplicatesInSortedArray(new int[] {1, 1, 2, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[] {2, 4, 1}));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(searchInArray(new int[] {1,2,3,4,5,6}, 6));
        System.out.println(maxProduct(new int[] {2, 3, -2, 4}));
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        sumAndProduct(arr);
        printPairs(arr);
    }

    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }

        int [] middleArray = new int[array.length - 2];

        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

//        System.arraycopy(array, 1, middleArray, 0, middleArray.length);
        return middleArray;
    }

    public static int sumOfDiagonalElements(int[][] array) {
        int sum = 0;
        int numberOfRows = array.length;

        for (int i = 0; i < numberOfRows; i++) {
            sum += array[i][i];
        }

        return sum;
    }

    public static int[] findTopTwoScores(int[] array){
        int top1 = Integer.MIN_VALUE;
        int top2 = Integer.MIN_VALUE;
        for (int score : array) {
            if (score > top1) {
                top2 = top1;
                top1 = score;
            } else if (score > top2){
                top2 = score;
            }
        }
        return new int[] {top1, top2};
    }

    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length;
        int expectedSum = ((n + 1) * (n + 2)) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] uniqueElements = new int[n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueElements[index++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueElements, index);
    }

    public static int removeDuplicatesInSortedArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < numbers.length; j++) {
            if(numbers[i] != numbers[j]) {
                i++;
                numbers[i] = numbers[j];
            }
        }
        return i + 1;
    }

    // leetcode 121
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = 1;
        while (true) {
            if (numbers[i] + numbers[j] != target) {
                if (j == numbers.length - 1) {
                    i++;
                    j = i + 1;
                } else {
                    j++;
                }
            } else {
                break;
            }
        }
        return new int[] {i, j};
    }

    public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param intArray an integer array
     * @return The two largest numbers in the array
     */
    public static String maxProduct(int[] intArray) {
        int firstMaximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;

        for (int i : intArray) {
            if (i > firstMaximum) {
                secondMaximum = firstMaximum;
                firstMaximum = i;
            } else if (i > secondMaximum) {
                secondMaximum = i;
            }
        }
        return firstMaximum + "," + secondMaximum;
    }

// leetcode 48
// O(n^2) time
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(matrix, i, j, i, n - 1 - j);
            }
        }
    }

    public static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    public static void sumAndProduct(int [] arr) {

        int sum = 0;
        int product = 1;
        for (int j : arr) {
            sum += j;
            product *= j;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }

    public static void printPairs(int[] arr) {
        for (int i: arr) {
            for (int j: arr) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }
    }
}
