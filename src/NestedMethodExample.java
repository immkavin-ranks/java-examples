class Nested {
    int m, n;

    Nested(int x, int y) {
        m = x; n = y;
    }

    int largest() {
        return Math.max(m, n);
    }

    void display() {
        int large = largest(); // calling a method
        System.out.println("Largest value: " + large);
    }
}

public class NestedMethodExample {
    public static void main(String[] args) {
        Nested ob = new Nested(2, 3);
        ob.display();
    }
}
