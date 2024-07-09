import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixManipulation {
    public static void main(String[] args) throws IOException {
        Matrix m = new Matrix();
        m.set();
        m.add();
        m.display();
        m.sub();
        m.display();
        m.mul();
        m.display();
    }
}

class Matrix {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] c = new int[3][3];


    void set() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a 3x3 matrix A");
        for (int i = 0; i < 3; i++) {
            String[] row= br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(row[j]);
            }
        }
        System.out.println("Enter a 3x3 matrix B");
        for (int i = 0; i < 3; i++) {
            String[] row= br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                b[i][j] = Integer.parseInt(row[j]);
            }
        }
    }

    void add() {
        System.out.println("Addition of A and B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void sub() {
        System.out.println("Subtraction of A and B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    void mul() {
        System.out.println("Multiplication of A and B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}