import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of Matrix A: ");
        String[] a = sc.nextLine().split(" ");
        int m1 = Integer.parseInt(a[0]), n1 = Integer.parseInt(a[1]);
        System.out.print("Enter order of Matrix B: ");
        String[] b = sc.nextLine().split(" ");
        int m2 = Integer.parseInt(b[0]), n2 = Integer.parseInt(b[1]);
        if (n1 != m2) {
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];
        int[][] C = new int[m1][n2];
        System.out.println("Enter elements of Matrix A: ");
        for (int i = 0; i < m1; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < n1; j++) {
                A[i][j] = Integer.parseInt(row[j]);
            }
        }
        System.out.println("Enter elements of Matrix B: ");
        for (int i = 0; i < m2; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < n2; j++) {
                B[i][j] = Integer.parseInt(row[j]);
            }
        }
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Matrix A x B = C");
        for (int[] row : C) {
            for (int i : row) System.out.print(i + "\t");
            System.out.println();
        }
    }
}
